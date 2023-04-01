package Lab6.homework;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

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
    private void saveGame(ActionEvent E) {
        BufferedImage image = frame.canvas.getImage();
        try {
            File outputFile = new File("src/main/java/Lab6/homework/game_board.png");
            ImageIO.write(image, "png", outputFile);
            System.out.println("Image saved to " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void loadGame(ActionEvent E) {
       /* try {
            FileInputStream fileIn = new FileInputStream("src/main/java/Lab6/homework/game_board.png");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            frame.canvas = (DrawingPanel) in.readObject();
            in.close();
            fileIn.close();
            JOptionPane.showMessageDialog(this, "Game loaded successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading game: " + e.getMessage());
        }
    */
    }
}
