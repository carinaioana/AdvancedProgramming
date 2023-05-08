package Lab6.compulsory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton exitBtn = new JButton("Exit");
    JButton loadBtn = new JButton("Load");
    JButton saveBtn = new JButton("Save");
    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }
    private void init() {
        //change the default layout manager(jff)
        setLayout(new GridLayout(1, 4));

        /**
         * add all buttons
         * configure listeners for all buttons
         */
        exitBtn.addActionListener(this::exitGame);
        loadBtn.addActionListener(this::loadGame);
        saveBtn.addActionListener(this::saveGame);

        add(exitBtn);
        add(loadBtn);
        add(saveBtn);
        //TO DO
    }
    private void exitGame(ActionEvent E){
        frame.dispose();
    }
    private void loadGame(ActionEvent E){ }
    private void saveGame(ActionEvent E){
    }



//To do...
}
