package Lab6.compulsory;

import javax.swing.*;
import java.awt.*;

public class DrawingPanel extends JPanel {
    final MainFrame frame;
    final static int W = 800, H = 600;
    private static final int DOT_SIZE = 10;
    private static final int CIRCLE_RADIUS = 200;
    private int cx;
    private int cy;

    /**
     * constructor
     */
    public DrawingPanel(MainFrame frame) {
        this.frame = frame;
        initPanel();
    }

    /**
     * create frame
     */
    private void initPanel() {
        setPreferredSize(new Dimension(W, H));
        setBorder(BorderFactory.createEtchedBorder());
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        /**
         * get the number of dots (numVertices)
         */
        int numVertices = (int) frame.getConfigPanel().dotsSpinner.getValue();
        /**
        * get the probability that two dots form a line (edgeProbability)
        */
        double edgeProbability=(double) frame.getConfigPanel().linesCombo.getSelectedItem();
        /**
         * draw the board, that is:
         * compute the coordinates of the dots
         * & draw the dots on a circle using the radius
         */
        setPreferredSize(new Dimension(300, 300));
        cx = getWidth() / 2;
        cy = getHeight() / 2;
        Point[] points = new Point[numVertices];
        for (int i = 0; i < numVertices; i++) {
            double ANGLE_DELTA = 2 * Math.PI / numVertices;
                double angle = i * ANGLE_DELTA;
                int x = (int) (cx + CIRCLE_RADIUS * Math.cos(angle)) - DOT_SIZE / 2;
                int y = (int) (cy + CIRCLE_RADIUS * Math.sin(angle)) - DOT_SIZE / 2;
                points[i] = new Point(x, y);
        }
        /**
         * draw the dots
         */
        for (Point p : points) {
            g.fillOval(p.x - 5, p.y - 5, 10, 10);
        }

        /**
         * draw the lines
         */
        for (int i = 0; i < numVertices; i++) {
            for (int j = i+1; j < numVertices; j++) {
                if (Math.random() < edgeProbability) {
                    g.drawLine(points[i].x, points[i].y, points[j].x, points[j].y);
                }
            }
        }
    }
}
