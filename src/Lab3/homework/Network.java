package Lab3.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Network {
    private List<Node> nodes = new ArrayList<>();
    public List<Node> getNodes() {
        return nodes;
    }
    public void addNode(Node node) {
        nodes.add(node);
    }

    /**
     * takes two nodes and compares them by the number of relationships
     */
    public void sortNodesByImportance() {
        nodes.sort((n1, n2) -> n2.getRelationships().size() - n1.getRelationships().size());
    }

    /**
     * prints all the names of the nodes in the list and the number of relationships
     */
    public void printNetwork() {
        for (Node node : nodes) {
            System.out.println(node.getName() +
                    " No. of relationships: " +
                    node.getRelationships().size());
            for (Node n: node.getRelationships().keySet()) {
                System.out.println("Relationship with: "+ n.getName() + " of type: " + node.getRelationships().get(n));
            }

        }
    }

}
