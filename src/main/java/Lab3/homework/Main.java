package Lab3.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String args[]) {

        Person p1 = new Programmer("Stefan", "11-10-1999", "Java");
        Person p2 = new Designer("Carina", "01-03-2002", 3);

        Company c1 = new Company("Amazon");
        Company c2 = new Company("Alten");

        p1.addRelationship(p2, "p-p");
        p1.addRelationship(c1, "p-c");
        p2.addRelationship(p1, "p-p");
        c1.addRelationship(c2, "c-c");
        p1.addRelationship(c1,"c-p");

        Network network = new Network();
        network.addNode(p1);
        network.addNode(p2);
        network.addNode(c1);
        network.addNode(c2);

        network.sortNodesByImportance();
        network.printNetwork();
    }
}
