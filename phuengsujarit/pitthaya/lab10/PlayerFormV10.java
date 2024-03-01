package phuengsujarit.pitthaya.lab10;

import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.List;



public class PlayerFormV10 extends PlayerFormV9 {

     public PlayerFormV10(String title) {
        super(title);
    }
    
    public static void createAndShowGUI() {
        PlayerFormV10 msw = new PlayerFormV10("Player Form V10");
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
    protected void addListeners(){
        super.addListeners();
        newMenu.addActionListener(this);
        openMenu.addActionListener(this);
        saveMenu.addActionListener(this);
        exitMenu.addActionListener(this);
        redMenuItem.addActionListener(this);
        greenMenuItem.addActionListener(this);
        blueMenuItem.addActionListener(this);
        size16MenuItem.addActionListener(this);
        size20MenuItem.addActionListener(this);
        size24MenuItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        Object input = e.getSource();
        if (input == newMenu){
            showMenuDialog("New");
        }
        if (input == openMenu){
            showMenuDialog("Open");
        }
        if (input == saveMenu){
            showMenuDialog("Save");
        }
        if (input == exitMenu){
            System.exit(0);
        }
        if (input == redMenuItem){
            changeFontColor(Color.red);
        }
        if (input == greenMenuItem){
            changeFontColor(Color.green);
        }
        if (input == blueMenuItem){
            changeFontColor(Color.blue);
        }
        if (input == size16MenuItem){
            changeFont(16);
        }
        if (input == size20MenuItem){
            changeFont(20);
        }
        if (input == size24MenuItem){
            changeFont(24);
        }
      

    }

    protected void showMenuDialog (String inputMenu){
        JOptionPane.showMessageDialog(PlayerFormV10.this,"You click menu "+ inputMenu);

}

    protected void changeFontColor (Color inputColor){
        nameField.setForeground(inputColor);
        nationField.setForeground(inputColor);
        birthDateField.setForeground(inputColor);
    }

    protected void changeFont(int size){
        Font boldFont = new Font("Serif", Font.BOLD, size);
        noteText.setFont(boldFont);
    }

    
}
