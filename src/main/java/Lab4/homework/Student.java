package Lab4.homework;


import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
    String studentName;

    /**
     * a student can have a list of admissible projects
     */
    List<Project> admissibleProjects = new ArrayList<>();

    public Student(String studentName) {
        this.studentName = studentName;
    }
    public Student(String studentName, List<Project> admissibleProjects) {
        this.studentName = studentName;
        this.admissibleProjects = admissibleProjects;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public int compareTo(Student o) {
        return this.getStudentName().compareTo(o.getStudentName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                '}';
    }
}
