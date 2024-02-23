package phuengsujarit.pitthaya.lab9;

import phuengsujarit.pitthaya.lab8.PlayerFormV5;
import javax.swing.*;
import java.awt.event.*;
import java.util.List;


public class PlayerFormV6 extends PlayerFormV5 implements ActionListener, KeyListener{
    
    public PlayerFormV6 (String title) { // create constructors.
        super(title);
    }

    protected void addListeners() { //add actionlistener and key listener to component
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);
        typesCombo.addActionListener(this);
        nameField.addActionListener(this);
        nameField.addKeyListener(this); // Registering the key listener for nameField
        nationField.addActionListener(this);
        nationField.addKeyListener(this); // Registering the key listener for nationField
        birthDateField.addActionListener(this);
        birthDateField.addKeyListener(this);
    }
    
    public static void createAndShowGUI() {
        PlayerFormV6 msw = new PlayerFormV6("Player Form V6");  //create obj
        msw.addComponents();
        msw.setFrameFeatures();
        msw.addMenus();
        msw.addListeners();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    protected void addComponents(){ 
        super.addComponents();
    }

    protected void addMenus(){
        super.addMenus();
    }

    //set action of each component
    public void actionPerformed(ActionEvent e) { 
        Object src = e.getSource();
        if (src == submitButton) {
            String comboboxInput = (String) typesCombo.getSelectedItem();
            List<String> selectedOption = sportList.getSelectedValuesList();
            String inputName = nameField.getText();
            String inputNation = nationField.getText();
            String inputDate = birthDateField.getText();
            String radiobuttonInput = "";
            if (femaleRadio.isSelected()) {
                radiobuttonInput = femaleRadio.getText();
            } else if (maleRadio.isSelected()) {
                radiobuttonInput = maleRadio.getText();
            }
            
            //get source and add text
            String hobbieCheck = "";
                if (readingCheckBox.isSelected()) {
                    hobbieCheck += "Reading ";
                }
                if (browsingCheckBox.isSelected()) {
                    hobbieCheck += "Browsing ";
                }
                if (sleepingCheckBox.isSelected()) {
                    hobbieCheck += "Sleeping ";
                }
                if (travellingCheckBox.isSelected()) {
                    hobbieCheck += "Traveling ";
                }
        
            // Build the message and show it in the dialog
            StringBuilder fullMessage = new StringBuilder(inputName + " has nationality as " + inputNation + " and was born on " + inputDate + ", has gender as " + radiobuttonInput + ", is a " + comboboxInput + " player, has hobbies as " + hobbieCheck + "and plays [");
            for (int i = 0; i < selectedOption.size(); i++) {
                fullMessage.append(selectedOption.get(i));
                if (i < selectedOption.size() - 1) {
                    fullMessage.append(", ");
                }
            }
            fullMessage.append("]");
            JOptionPane.showMessageDialog(this, fullMessage.toString());
        }
        if (src == resetButton) {
            nameField.setText("");
            nationField.setText("");
            birthDateField.setText("");
        }
    }
        

    public void keyPressed(KeyEvent e) {
        // Check if the Enter key is pressed
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            Object src = e.getSource();
            if (src == nameField) {
                JOptionPane.showMessageDialog(this, "Name is changed to " + nameField.getText());
            } else if (src == nationField) {
                JOptionPane.showMessageDialog(this, "Nationality is changed to " + nationField.getText());
            } else if (src == birthDateField) {
                JOptionPane.showMessageDialog(this, "Date of Birth is changed to " + birthDateField.getText());
            }
        }
    }
        @Override
        public void keyTyped(KeyEvent e) {}
    
        @Override
        public void keyReleased(KeyEvent e) {}

        
    }




