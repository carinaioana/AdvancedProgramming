package Lab4.compulsory;

import Lab3.homework.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String args[]) {
        /**
         * created an array with students s0,s1,s2,s3
         *                      & projects p0,p1,p2,p3
         */
        var students = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new Student("S" + i) )
                .toArray(Student[]::new);
        var projects = IntStream.rangeClosed(0, 3)
                .mapToObj(j -> new Project("P" + j) )
                .toArray(Project[]::new);
        /**
         * transformed the array into a list
         * & the list into a linked list with stream()
         */
        List<Student> studentList = Arrays.asList(students);
        LinkedList<Student> studentLinkedList = studentList.stream().collect(Collectors.toCollection(LinkedList::new));
        /**
         * using stream().sorted() i sorted the list by the name of the students
         */
        List<Student> newSortedList = studentLinkedList.stream()
                .sorted(Comparator.comparing(Student::getStudentName))
                .collect(Collectors.toList());
        System.out.println(newSortedList);

        /**
         * transformed the array into a tree-set
         * the project names are already sorted
         */
        Set<Project> projectSet = Arrays.stream(projects).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(projectSet);


    }
}
