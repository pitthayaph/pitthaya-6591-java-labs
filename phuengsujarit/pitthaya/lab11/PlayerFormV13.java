package phuengsujarit.pitthaya.lab11;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import phuengsujarit.pitthaya.lab10.PlayerFormV11;

public class PlayerFormV13 extends PlayerFormV12 {
    protected String radiobuttonInput;
    protected String hobbieCheck;
    protected List<String> selectedOption;
    
    public PlayerFormV13(String title) {
        super(title);
        radiobuttonInput = "";
            if (femaleRadio.isSelected()) {
                radiobuttonInput = femaleRadio.getText();
            } else if (maleRadio.isSelected()) {
                radiobuttonInput = maleRadio.getText();
            }

            

    
    }


    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PlayerFormV13 mywindow = new PlayerFormV13("Player Form V13");
        mywindow.addComponents();
        mywindow.setFrameFeatures();
        mywindow.addMenus();
        mywindow.addListeners();
        mywindow.enableKeyboard();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
             Object inputMenu = e.getSource();
             
            if (inputMenu == saveMenu) {
            saveToFile(); 
            } else if (inputMenu == openMenu)
            {
                openFromFile(); 
                
                } else {
                super.actionPerformed(e);
            }

      
        }
        


    private void saveToFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showSaveDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (PrintWriter writer = new PrintWriter(selectedFile)) {
                hobbieCheck = "";
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

                selectedOption = sportList.getSelectedValuesList();


                StringBuilder fullMessage = new StringBuilder(nameField.getText()+ " has " + "nationnality as " + nationField.getText() + " and was born on " + birthDateField.getText()+ ", has gender as " + radiobuttonInput + ", is a " + typesCombo.getSelectedItem() + ", has hobbies  as " + hobbieCheck + "and plays [");
            for (int i = 0; i < selectedOption.size(); i++) {
                fullMessage.append(selectedOption.get(i));
                if (i < selectedOption.size() - 1) {
                    fullMessage.append(", ");
                }
            }
            fullMessage.append("]");
                writer.println(selectedFile.getName());
                writer.println(fullMessage);
                //writer.println(selectedFile.getName() + " (END)");
                
                JOptionPane.showMessageDialog(this, "Saving in file " + selectedFile.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Failed to save player data!");
            }
        }
    }

    private void openFromFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(this, "Opening file " + selectedFile.getAbsolutePath());
            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                StringBuilder message =   new StringBuilder();

                message.append("Data read from file " +selectedFile.getAbsolutePath()  + " is\n");
               
                String line;
                while ((line = reader.readLine()) != null) {
                    message.append(line).append("\n");
                }
                JOptionPane.showMessageDialog(this, message.toString());
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Failed to open player data!");
            }
        }
    }


}
