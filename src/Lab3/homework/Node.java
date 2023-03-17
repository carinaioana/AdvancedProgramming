package Lab3.homework;

import java.util.Map;

public interface Node {
    String getName();
    public Map<Node, String> getRelationships();
    public void addRelationship(Node node, String value);

}
