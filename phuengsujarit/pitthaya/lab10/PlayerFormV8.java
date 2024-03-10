package phuengsujarit.pitthaya.lab10;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.List;
import phuengsujarit.pitthaya.lab9.PlayerFormV7;

public class PlayerFormV8 extends PlayerFormV7 implements ListSelectionListener {


    public PlayerFormV8(String title) {
        super(title);
    }

    @Override
    protected void addListeners() {
        super.addListeners();
        sportList.addListSelectionListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            // Get selected values from the list
            List<String> selectedValuesList = sportList.getSelectedValuesList();
            
                StringBuilder sportsSelected = new StringBuilder("Selected sports are ");
                for (String value : selectedValuesList) {
                    sportsSelected.append(value).append(" ");
                }
                // showDialog(sportsSelected.toString());
                JOptionPane.showMessageDialog(this, sportsSelected);

            }
        }
    

    public static void createAndShowGUI() {
        PlayerFormV8 msw = new PlayerFormV8("Player Form V8");
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
}    