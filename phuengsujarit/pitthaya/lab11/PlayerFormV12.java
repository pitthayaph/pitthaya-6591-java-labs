package phuengsujarit.pitthaya.lab11;

import phuengsujarit.pitthaya.lab10.PlayerFormV11;
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.*;

public class PlayerFormV12 extends PlayerFormV11 {

    public PlayerFormV12(String title) {
        super(title);
        
    }

    
    // Method to handle name text field
    protected void handleNameTextField() {
        String input = nameField.getText().trim();
        if (input.isEmpty()) {
            showMessageDialog("Please enter some data in Name");
            nameField.requestFocusInWindow();
            nationField.setEnabled(false);

            
        } else {
            showMessageDialog("Name is changed to " + input);
            nationField.setEnabled(true);
            nationField.requestFocusInWindow();
        }
    }

    // Method to handle nation text field
    protected void handleNationTextField() {
        String input = nationField.getText().trim();
        if (input.isEmpty()) {
            showMessageDialog("Please enter some data in Nationality");
            nationField.requestFocusInWindow();
            birthDateField.setEnabled(false);

        } else {
            showMessageDialog("Nationality is changed to " + input);
            birthDateField.setEnabled(true);
            birthDateField.requestFocusInWindow();
        }
    }

    // Method to handle date text field
    protected void handleDateTextField(JTextField tf) {
        String input = tf.getText().trim();
        try {
            if (input.isEmpty()) {
                showMessageDialog("Please enter a valid date in Date of Birth");
            } else {
                
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate date = LocalDate.parse(input, formatter);
                // Date is in correct format
                showMessageDialog("Date of Birth is changed to " + date.format(formatter));
            }
        } catch (DateTimeParseException e) {
            // Date input is incorrect format
            showMessageDialog("Please enter a valid date in Date of Birth");
            tf.requestFocusInWindow();
        }
    }

    // Method to show message dialog
    protected void showMessageDialog(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PlayerFormV12 msw = new PlayerFormV12("Player Form V12");
        msw.addComponents();
        msw.setFrameFeatures();
        msw.addMenus();
        msw.addListeners();
        msw.enableKeyboard();

    }
    
    @Override
    public void actionPerformed(ActionEvent e) { 
        super.actionPerformed(e);
        Object s = e.getSource();
        if (s == nameField){
            handleNameTextField();;
        }
        if (s == nationField){
            handleNationTextField();;
        }
        if (s == birthDateField){
           handleDateTextField(birthDateField);;

        }



    }


    @Override
    public void keyPressed(KeyEvent e) {
            
    }
}