package phuengsujarit.pitthaya.lab7;

import java.awt.*;
import javax.swing.*;


public class PlayerFormV1 extends MySimpleWindow {
    protected JLabel nameLabel, nationLabel ,birthDateLabel, genderLabel,genderspace;
    protected JRadioButton maleRadio, femaleRadio;
    protected JTextField nameField, nationField, birthDateField;
    protected JPanel toPanel, bottomPanel;
    
    PlayerFormV1 (String title){  //create constructors.
        super(title);
        maleRadio = new JRadioButton("Male");        //create components.
        femaleRadio = new JRadioButton("Female:");
        femaleRadio.setSelected(true);
        nameLabel = new JLabel("Name:");
        nationLabel = new JLabel("Nationality:");
        birthDateLabel = new JLabel("Date of Birth (eg.,31-01-2005):");
        genderLabel = new JLabel("Gender:");
        resetButton = new JButton("Reset");
        submitButton = new JButton("Submit");
        nameField = new JTextField(15);
        nationField = new  JTextField(15);
        birthDateField = new  JTextField(15);
        toPanel = new JPanel();
        bottomPanel = new JPanel();
        mainPanel = new JPanel();
        buttonPanel = new JPanel();
        genderspace = new JLabel("                                                ");
        ButtonGroup genderRadio = new ButtonGroup(); //group radiobutton.
        genderRadio.add(maleRadio);
        genderRadio.add(femaleRadio);
    }
    
    public static void createAndShowGUI() {
        PlayerFormV1 msw = new PlayerFormV1("Player Form V1");  //change title.
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
    
    protected void addComponents() {
        toPanel.setLayout(new GridLayout(3,2)); //set and add components to toppanel.
        toPanel.add(nameLabel);
        toPanel.add(nameField);
        toPanel.add(nationLabel);
        toPanel.add(nationField);
        toPanel.add(birthDateLabel);
        toPanel.add(birthDateField);
        bottomPanel.setLayout(new FlowLayout()); //set and add components to bottompanel.
        bottomPanel.add(genderLabel);
        bottomPanel.add(genderspace);
        bottomPanel.add(maleRadio);
        bottomPanel.add(femaleRadio);
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(resetButton);
        buttonPanel.add(submitButton);
        mainPanel.setLayout(new BorderLayout());  //set and add components to mainpanel.
        mainPanel.add(toPanel, BorderLayout.NORTH);
        mainPanel.add(bottomPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        add(mainPanel);
    }
}
