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

    // Override the method to handle text field changes
    protected void handleTextField(JTextField tf) {
        if (tf == birthDateField) {
            handleDateTextField(tf);
        } else if (tf == nameField) {
            handleNameTextField();
        } else if (tf == nationField) {
            handleNationTextField();
        }
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
                JOptionPane.showMessageDialog(this,"gukgoo")  ;
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
    protected void addListeners(){
// Add action listener to nameField
    nameField.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        handleTextField(nameField);
    }
});

// Add action listener to nationField
nationField.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        handleTextField(nationField);
    }
});

// Add action listener to birthDateField
birthDateField.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        handleTextField(birthDateField);
    }
});
    }
       
    

    @Override
    public void keyPressed(KeyEvent e) {
            
    }
}


