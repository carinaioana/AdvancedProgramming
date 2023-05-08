package Lab6.compulsory;
import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.*;

public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;

    /**
     *
     * getters
     */
    public ConfigPanel getConfigPanel() {
        return configPanel;
    }

    public ControlPanel getControlPanel() {
        return controlPanel;
    }

    public DrawingPanel getCanvas() {
        return canvas;
    }
    //constructor
    public MainFrame() {
        super("My Drawing Application");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        /**
         * create the components
         * arrange the components in the container (frame)
         * JFrame uses a BorderLayout by default
         * this is BorderLayout.CENTER/NORTH/SOUTH
         */
        canvas = new DrawingPanel(this);
        add(canvas, BorderLayout.CENTER);

        configPanel = new ConfigPanel(this);
        add(configPanel,BorderLayout.NORTH);

        controlPanel = new ControlPanel(this);
        add(controlPanel, BorderLayout.SOUTH);

        /**
         *         invoke the layout manager
         */
        pack();
    }
    public static void main(String[] args) {
        /**
         *   create an instance of the app and show it
          */
        MainFrame app = new MainFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
