package Lab3.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Person implements Node, Comparable<Person>, DateMatch{
    private String name;
    private String birthDate;
    /**
     * variable written as regex with the pattern 2 numbers - 2 numbers - 4 numbers (day-month-year)
     */
    private static final Pattern DATE_PATTERN = Pattern.compile(
            "^\\d{2}-\\d{2}-\\d{4}$");
    private static Set<String> names = new HashSet<>();
    private Map <Node, String> relationships = new HashMap<>();

    /**
     *
     * @param node
     * @param value
     * takes a person/company object and adds a relationship to the hashmap as a key-value pair
     */
    @Override
    public void addRelationship(Node node, String value) {
        relationships.put(node, value);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Map<Node, String> getRelationships() {
        return relationships;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", relationships=" + relationships +
                '}';
    }

    public String getBirthDate() {
        return birthDate;
    }

    /**
     *
     * @param name - name of a person
     * @param birthDate
     * verifies if a name exists already in the set of names
     * ctor
     */
    public Person(String name, String birthDate) {
        if (names.contains(name)) {
            throw new IllegalArgumentException("Name already exists: " + name);
        }
        names.add(name);
        this.name = name;
        if (match(birthDate)){
            this.birthDate = birthDate;
        }else {
            throw new IllegalArgumentException("Argument must be of date format(dd-mm-yyyy): " + birthDate);
        }
    }

    /**
     *
     * @param name
     * @param birthDate
     * @param relationships
     * ctor for a person with predefined relationships
     */
    public Person(String name, String birthDate, Map<Node, String> relationships) {
        if (names.contains(name)) {
            throw new IllegalArgumentException("Name already exists: " + name);
        }
        names.add(name);
        this.name = name;
        /**
         * takes birthdate and verifies if it matches the regex pattern
         */
        if (match(birthDate)){
            this.birthDate = birthDate;
        }else {
            throw new IllegalArgumentException("Argument must be of date format(dd-mm-yyyy): " + birthDate);
        }
        this.relationships = relationships;
    }

    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.getName());
    }

    /**
     *
     * @param date
     * @return
     * takes the date and tries to match it with the date pattern
     */
    @Override
    public boolean match(String date) {
        return DATE_PATTERN.matcher(date).matches();
    }
}
