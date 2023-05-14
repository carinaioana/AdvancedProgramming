package Lab7.compulsory;

import java.util.ArrayList;
import java.util.List;

public class Exploration {
    private List<Robot> robots;
    private ExplorationMap explorationMap;
    private SharedMemory sharedMemory;

    public Exploration(int n, int numRobots) {
        explorationMap = new ExplorationMap(n);
        sharedMemory = new SharedMemory(n * n);
        robots = new ArrayList<>();
        for (int i = 0; i < numRobots; i++) {
            Robot robot = new Robot("Robot " + (i + 1), explorationMap, sharedMemory);
            robots.add(robot);
        }
    }

    /**
     * method used to launch the thread for each Robot
     */
    public void startExploration() {
        for (Robot robot : robots) {
            Thread t = new Thread(robot);
            t.start();
        }
    }

    /**
     * method used to set the running variable in each Robot to false, which stops the execution
     */

    public void stopExploration() {
        for (Robot robot : robots) {
            robot.setRunning(false);
        }
    }
}
