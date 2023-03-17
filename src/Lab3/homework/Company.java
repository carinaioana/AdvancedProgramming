package Lab3.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Company implements Node, Comparable<Company>{
    private String name;
    private static Set<String> names = new HashSet<>();
    private Map<Node, String> relationships = new HashMap<>();
    @Override
    public void addRelationship(Node node, String value) {
        relationships.put(node, value);
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", relationships=" + relationships +
                '}';
    }

    @Override
    public Map<Node, String> getRelationships() {
        return relationships;
    }

    public Company(String name) {
        if (names.contains(name)) {
            throw new IllegalArgumentException("Name already exists: " + name);
        }
        names.add(name);
        this.name = name;
    }

    @Override
    public int compareTo(Company c) {
        return this.name.compareTo(c.getName());
    }
}
