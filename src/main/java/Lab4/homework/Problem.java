package Lab4.homework;


import java.util.*;
import java.util.stream.Collectors;

public class Problem {

    List<Student> students;
    List<Project> projects;
    Map<Student, List<Project>> prefMap;
    Map<Student, Project> matchMap;

    public List<Student> getStudents() {
        return students;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public Map<Student, List<Project>> getPrefMap() {
        return prefMap;
    }

    public Map<Student, Project> getMatchMap() {
        return matchMap;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "students=" + students +
                ", projects=" + projects +
                ", prefMap=" + prefMap +
                ", matchMap=" + matchMap +
                '}';
    }

    Problem(List<Student> students, List<Project> projects){
        this.students = students;
        this.projects = projects;
        prefMap = new HashMap<>();
        matchMap = new HashMap<>();
    }

    /**
     * calculates the average of admissible projects and filters what are below average
     */
    public void queryStudents(){
        double avgNumPreferences = students.stream()
                .mapToInt(s -> s.getAdmissibleProjects().size())
                .average()
                .orElse(0.0);
        System.out.println(students.stream()
                .filter(s -> s.getAdmissibleProjects().size() < avgNumPreferences)
                .collect(Collectors.toList()));
    }

    public void matchProjects() {

        for (Student student : students) {

            // loop through each project in their list of admissible projects
            for (Project project : projects) {
                // if the project is not taken, assign it to the student
                if (!project.isTaken()) {
                    matchMap.put(student, project);
                    project.setTaken(true);
                    break;
                }
            }
        }
    }

    public void setRemainingProjects(){
        for (Student student : students) {
            List<Project> remainingProjects = new ArrayList<>(student.getAdmissibleProjects());;
            // loop through each project in their list of admissible projects
            for (Project project : matchMap.values()) {
                // if the project is not taken, assign it to the student
                if (matchMap.containsValue(project)) {
                    remainingProjects.remove(project);
                }
            }
            prefMap.put(student, remainingProjects);
        }
    }


}
