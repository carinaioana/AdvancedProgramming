package Lab6.homework;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    DrawingPanel canvas;
    ControlPanel controlPanel;

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
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
    }
    /**
     * create the components
     * arrange the components in the container (frame)
     * JFrame uses a BorderLayout by default
     * this is BorderLayout.CENTER/NORTH/SOUTH
     */
    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        configPanel = new ConfigPanel(this);
        add(configPanel,BorderLayout.NORTH);

        controlPanel = new ControlPanel(this);
        add(controlPanel, BorderLayout.SOUTH);

        canvas = new DrawingPanel(this);
        add(canvas, BorderLayout.CENTER);

        /**
         *         invoke the layout manager
         */
        pack();
    }
    /**
     *   create an instance of the app and show it
     */
    public static void main(String[] args) {
        MainFrame app = new MainFrame();;
        app.setVisible(true);
    }
}
