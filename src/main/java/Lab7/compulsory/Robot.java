package Lab7.compulsory;

import java.util.List;

import static java.lang.Thread.sleep;

public class Robot implements Runnable {
    private String name;
    private boolean running;
    Exploration explore;
    int row;
    int col;
    public Robot(String name) {
        this.name = name;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public Exploration getExplore() {
        return explore;
    }

    public void setExplore(Exploration explore) {
        this.explore = explore;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    //...
    public void run() {
        while (running) {
           /* pick a new cell to explore*/
            explore.getMap().visit(row, col, this);
            System.out.println("Visited"+ row+"&"+ col);
           /* make the robot sleep for some time*/

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
