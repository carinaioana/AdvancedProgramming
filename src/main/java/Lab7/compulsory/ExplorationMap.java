package Lab7.compulsory;

public class ExplorationMap {
    private final int[][] cells;
    private final int n;

    public ExplorationMap(int n) {
        this.n = n;
        cells = new int[n][n];
    }

    /**
     *  method which checks if a given cell has already been visited and updates the cells array if the cell is available for visiting
     * @param x
     * @param y
     * @return
     */
    public synchronized boolean visitCell(int x, int y) {
        if (cells[x][y] != 0) {
            return false;
        }
        cells[x][y] = 1;
        return true;
    }

    /**
     * method which checks if a given position is valid within the map
     * @param x
     * @param y
     * @return
     */

    public boolean isValidPosition(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    /**
     * method used to add a value to a specific cell
     * @param x
     * @param y
     * @param value
     */

    public synchronized void addToken(int x, int y, int value) {
        cells[x][y] = value;
    }

    public int getN() {
        return n;
    }
}
