package Lab7.compulsory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exploration {
    int n = 5;
    private final SharedMemory mem = new SharedMemory(n);
    private Cell[][] matrix;
    private final ExplorationMap map = new ExplorationMap(matrix,n);
    private final List<Robot> robots = new ArrayList<>();

    public Exploration() {
    }

    //...
    public void start() {
        for (Robot robot : robots) {
            new Thread(robot).start();
            /*start a new Thread representing the robot*/;
        }
    }
    public static void main(String args[]) {
        var explore = new Exploration();
        explore.addRobot(new Robot("Wall-E"));
        explore.addRobot(new Robot("R2D2"));
        explore.addRobot(new Robot("Optimus Prime"));
        explore.start();
        System.out.println(explore.robots.get(1).getName());
        System.out.println(explore.n);
        System.out.println(explore.map);
    }

    @Override
    public String toString() {
        return "Exploration{" +
                "n=" + n +
                ", mem=" + mem +
                ", matrix=" + Arrays.toString(matrix) +
                ", map=" + map +
                ", robots=" + robots +
                '}';
    }

    private void addRobot(Robot robot) {
        robots.add(robot);
    }

    public ExplorationMap getMap() {
        return map;
    }
}