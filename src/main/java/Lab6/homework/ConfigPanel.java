package Lab6.homework;

import com.fasterxml.jackson.core.SerializableString;

import javax.swing.*;
import javax.swing.event.ListDataListener;

public class ConfigPanel extends JPanel {
    final MainFrame frame;
    JLabel dotsLabel, linesLabel;
    JSpinner dotsSpinner;
    JComboBox linesCombo;
    JButton createButton;

    /**
     * constructor
     */
    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    /**
     * getters and setters
     */
    public int getDotsSpinner() {
        int numVertices = (int) dotsSpinner.getValue();
        return numVertices;
    }

    public void setDotsSpinner(JSpinner dotsSpinner) {
        this.dotsSpinner = dotsSpinner;
    }

    private void init() {
        /**
         * create the label,spinner and ComboBox
         * using methods JLabel that sets a text for
         * JSpinner(you can choose from range 3-100)
         * and JComboBox(you can choose from finite amount of choices
         */
        dotsLabel = new JLabel("Number of dots:");
        dotsSpinner = new JSpinner(new SpinnerNumberModel(6, 3, 100, 1));

        createButton = new JButton("Create new game");
        createButton.addActionListener(e->{
            /**
             * Get current value of spinner
             * repaint frame based on the value of the spinner
             */
            frame.canvas.repaint();
        });
        linesLabel = new JLabel("Line probability:");
        linesCombo = new JComboBox(new ComboBoxModel<Double>() {
            private final Double[] values = new Double[11];
            {
                for (int i = 0; i < values.length; i++) {
                    values[i] = i / 10.0;
                }
            }
            private Double selectedValue = values[0];

            @Override
            public void setSelectedItem(Object anItem) {
                selectedValue = (Double) anItem;
            }

            @Override
            public Object getSelectedItem() {
                return selectedValue;
            }

            @Override
            public int getSize() {
                return values.length;
            }

            @Override
            public Double getElementAt(int index) {
                return values[index];
            }

            @Override
            public void addListDataListener(ListDataListener l) {
            }

            @Override
            public void removeListDataListener(ListDataListener l) {
            }
        });

        /**
         * create the rest of the components
         * JPanel uses FlowLayout by default
         */

        add(dotsLabel);
        add(dotsSpinner);
        add(linesLabel);
        add(linesCombo);
        add(createButton);
    } }
