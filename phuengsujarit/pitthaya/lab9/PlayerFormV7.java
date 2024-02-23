package phuengsujarit.pitthaya.lab9;
import javax.swing.*;
import java.awt.event.*;


public class PlayerFormV7 extends PlayerFormV6 implements ItemListener {
    
    public PlayerFormV7 (String title) { // create constructors.
        super(title);
    }

    protected void addListeners() { //add itemlistener to component
        super.addListeners();
        femaleRadio.addItemListener(this);
        maleRadio.addItemListener(this);
        readingCheckBox.addItemListener(this);
        browsingCheckBox.addItemListener(this);
        sleepingCheckBox.addItemListener(this);
        travellingCheckBox.addItemListener(this);
    }
    
    public static void createAndShowGUI() {
        PlayerFormV7 msw = new PlayerFormV7("Player Form V7");  //create obj
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

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getItem();
        
        if (source == femaleRadio && e.getStateChange() == ItemEvent.SELECTED) { //if checkbox is changed show text
            showDialog("Gender is updated to Female");
        } else if (source == maleRadio && e.getStateChange() == ItemEvent.SELECTED) {
            showDialog("Gender is updated to Male");
        } else if (source == readingCheckBox) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                showDialog("Reading is one of the hobbies");
            } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                showDialog("Reading is no longer one of the hobbies");
            }
        } else if (source == browsingCheckBox) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                showDialog("Browsing is one of the hobbies");
            } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                showDialog("Browsing is no longer one of the hobbies");
            }
        } else if (source == sleepingCheckBox) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                showDialog("Sleeping is one of the hobbies");
            } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                showDialog("Sleeping is no longer one of the hobbies");
            }
        } else if (source == travellingCheckBox) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                showDialog("Travelling is one of the hobbies");
            } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                showDialog("Travelling is no longer one of the hobbies");
            }
        }
    }

    protected void showDialog(String message) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JOptionPane.showMessageDialog(PlayerFormV7.this, message);
            }
        });
    }
}
