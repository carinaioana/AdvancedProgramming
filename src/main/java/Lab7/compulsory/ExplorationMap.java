package Lab7.compulsory;

import java.util.ArrayList;
import java.util.List;

public class ExplorationMap {
    private final Cell[][] matrix;
    //Cell should be a wrapper or alias for List<Token>
    int n;

    public ExplorationMap(Cell[][] matrix, int n) {
        this.matrix = matrix;
        this.n = n;
    }

    //Cell should be a wrapper or alias for List<Token>
    public boolean visit(int row, int col, Robot robot) {
        synchronized (matrix[row][col]) {
            {
                n = matrix.length;
                Cell cell = matrix[row][col];
                if(!cell.isVisited()){
                    SharedMemory sharedMemory = new SharedMemory(n);
                    List<Token> extractedTokens = sharedMemory.extractTokens(n); // Extract n tokens
                    cell.setVisited(true); // Set the cell to visited after extracting tokens
                    System.out.println(robot.getName() + " visited cell [" + row + "][" + col + "] and extracted " + extractedTokens.size() + " tokens.");
                    return true;
                }
            /*if the cell is not visited
                the robot extract tokens
                and store the tokens in the cell (it becomes visited)
                display a success message
            */
                return false;
            }
        }
// ...
    }

    @Override
    public String toString() {
       /* display the matrix;*/
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sb.append(matrix[i][j].isVisited() ? "1" : "0");
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
