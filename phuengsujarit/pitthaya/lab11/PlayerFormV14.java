package phuengsujarit.pitthaya.lab11;

import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class PlayerFormV14 extends PlayerFormV13 {
    private JMenu fillMenu;
    private ButtonGroup fillGroup;
    private JRadioButtonMenuItem yesMenuItem;
    private JRadioButtonMenuItem noMenuItem;

    public PlayerFormV14(String title) {
        super(title);
    }

    @Override
    public void addMenus() {
        super.addMenus();
        fillMenu = new JMenu("Fill");
        fillGroup = new ButtonGroup();
        yesMenuItem = new JRadioButtonMenuItem("Yes");
        noMenuItem = new JRadioButtonMenuItem("No", true);
        fillGroup.add(yesMenuItem);
        fillGroup.add(noMenuItem);
        fillMenu.add(yesMenuItem);
        fillMenu.add(noMenuItem);
        menuBar.add(fillMenu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == yesMenuItem) {
            //fillFormWithData();
        } else if (e.getSource() == saveMenu) {
            if (yesMenuItem.isSelected()) {
                saveWithPlayerObject();
            } else {
                saveToFile();
            }
        } else if (e.getSource() == openMenu) {
            if (yesMenuItem.isSelected()) {
                openWithPlayerObject();
            } else {
                openFromFile();
            }
        } else {
            super.actionPerformed(e);
        }
    }

    // private void fillFormWithData() {
       
    // }

    private void saveWithPlayerObject() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showSaveDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(selectedFile))) {
                // Get values from form
                String name = nameField.getText();
                String nationality = nationField.getText();
                String dob = birthDateField.getText();
                String gender = (femaleRadio.isSelected()) ? "Female" : "Male";
                String playerType = (String) typesCombo.getSelectedItem();

                // Set hobbies
                // Set hobbies
                ArrayList<String> hobbies = new ArrayList<>();
                if (readingCheckBox.isSelected()) {
                    hobbies.add("Reading");
                }
                if (browsingCheckBox.isSelected()) {
                    hobbies.add("Browsing");
                }
                if (sleepingCheckBox.isSelected()) {
                    hobbies.add("Sleeping");
                }
                if (travellingCheckBox.isSelected()) {
                    hobbies.add("Traveling");
                }
                int year = yearSlider.getValue();


                // Set sports
                ArrayList<String> sports = new ArrayList<>(sportList.getSelectedValuesList());

                // Create Player object
                Player player = new Player(name, nationality, dob, playerType, gender, hobbies, sports, year);

                // Write object to file
                outputStream.writeObject(player);
                JOptionPane.showMessageDialog(this, "Saving in file " + selectedFile.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Failed to save player data!");
            }
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
        PlayerFormV14 msw = new PlayerFormV14("Player Form V14");
        msw.addComponents();
        msw.setFrameFeatures();
        msw.addMenus();
        msw.addListeners();
        msw.enableKeyboard();

    }

    private void openWithPlayerObject() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(selectedFile))) {
                Player player = (Player) inputStream.readObject();
                // Fill the form with attributes from the Player object
                fillFormWithPlayer(player);
                JOptionPane.showMessageDialog(this, "Opening file " + selectedFile.getAbsolutePath());
                StringBuilder fullMessage =   new StringBuilder();
                fullMessage.append("Data read from file " +selectedFile.getAbsolutePath()  + " is\n");
                fullMessage.append(player.getName() + " has " + "nationnality as " + player.getNationality() + " and was born on " + player.getDob()+ ", has gender as " + player.getGender() + ", is a " + player.getPlayerType() + ", has hobbies  as " + player.getHobbies() + "and plays " + player.getSports() + " and has experience " + player.getYear() + " year");
                JOptionPane.showMessageDialog(this, fullMessage);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Failed to open player data!");
            }
        }
    }

    private void fillFormWithPlayer(Player player) {
        // Set name
        nameField.setText(player.getName());

        // Set nationality
        nationField.setText(player.getNationality());

        // Set date of birth
        birthDateField.setText(player.getDob());

        // Set gender
        if (player.getGender().equals("Male")) {
            maleRadio.setSelected(true);
        } else if (player.getGender().equals("Female")) {
            femaleRadio.setSelected(true);
        }

        // Set player type
        typesCombo.setSelectedItem(player.getPlayerType());

        // Set hobbies
        List<String> hobbies = player.getHobbies();
        if (hobbies != null) {
            for (String hobby : hobbies) {
                switch (hobby) {
                    case "Reading":
                        readingCheckBox.setSelected(true);
                        break;
                    case "Browsing":
                        browsingCheckBox.setSelected(true);
                        break;
                    case "Sleeping":
                        sleepingCheckBox.setSelected(true);
                        break;
                    case "Traveling":
                        travellingCheckBox.setSelected(true);
                        break;
                    default:
                        // Handle unknown hobby
                }
            }
        }

        // // Set sports
        // List<String> sports = player.getSports();
        
        // if (sports != null) {
        //     for (String sport : sports) {
        //         sportList.setSelectedValue(sport, true);
        //     }
        // }

        List<String> sports = player.getSports();

if (sports != null) {
    ListModel<String> model = sportList.getModel();
    for (String sport : sports) {
        int index = -1;
        for (int i = 0; i < model.getSize(); i++) {
            if (sport.equals(model.getElementAt(i))) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            sportList.addSelectionInterval(index, index);
        }
    }
}



        
        


        yearSlider.setValue(player.getYear());

    }

    // private void openFromFile() {
    // // Implementation remains the same
    // }
}