package Lab4.homework;

import com.github.javafaker.Faker;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String args[]) {
        /**
         * generates random students and projects names
         */
        Faker faker = new Faker();

        var students = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new Student(faker.name().fullName()) )
                .toArray(Student[]::new);
        var projects = IntStream.rangeClosed(0, 3)
                .mapToObj(j -> new Project(faker.app().name()) )
                .toArray(Project[]::new);
        /**
         * transformed the array into a list
         * & the list into a linked list with stream()
         */
        List<Student> studentList = Arrays.asList(students);

        /**
         * using stream().sorted() i sorted the list by the name of the students
         */


        LinkedList<Student> studentLinkedList = studentList.stream().collect(Collectors.toCollection(LinkedList::new));
        List<Student> newSortedList = studentLinkedList.stream()
                .sorted(Comparator.comparing(Student::getStudentName))
                .collect(Collectors.toList());
//        System.out.println(newSortedList);

        /**
         * transformed the array into a treeset
         * the project names are already sorted
         */
        Set<Project> projectSet = Arrays.stream(projects).collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(projectSet);
        List<Project> projectList = Arrays.asList(projects);

        Problem problem = new Problem(studentList, projectList);
        problem.matchProjects();
        problem.setRemainingProjects();
        System.out.println(problem.getMatchMap() + "\n" +
                problem.getPrefMap() + "\n" +
                problem.getStudents() + "\n" +
                problem.getProjects());
        problem.queryStudents();

    }
}
