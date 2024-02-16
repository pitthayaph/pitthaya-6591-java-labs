package phuengsujarit.pitthaya.lab7;

import java.awt.*;

import javax.swing.*;


public class MySimpleWindow extends JFrame {
    
    protected JPanel buttonPanel, mainPanel;
    protected JButton resetButton, submitButton;
    
    public MySimpleWindow(String title) { //create constructors.
        super(title);
        resetButton = new JButton("Reset");  //create button and panel.
        submitButton = new JButton("Submit");
        buttonPanel = new JPanel();
        mainPanel = new JPanel();
     }

    protected void setFrameFeatures() {   //setframe.
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    protected static void createAndShowGUI() { //change title and call method.
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

    }

    protected void addComponents() { //add components to panel.
        buttonPanel.setLayout(new FlowLayout()); //set and add components to bottompanel.
        buttonPanel.add(resetButton);
        buttonPanel.add(submitButton);
        mainPanel.setLayout(new BorderLayout()); //set and add components to mainpanel.
        mainPanel.add(buttonPanel,BorderLayout.SOUTH);
        add(mainPanel);
}
}
