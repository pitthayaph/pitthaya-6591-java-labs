package phuengsujarit.pitthaya.lab8;

import java.awt.*;
import javax.swing.*;

public class PlayerFormV5 extends PlayerFormV4 {

    protected ImageIcon newIcon, openIcon, saveIcon;
    protected JPanel bottomPanel;
    
    public PlayerFormV5 (String title) { // create constructors.
        super(title);
    }
    
    public static void createAndShowGUI() {
        PlayerFormV5 msw = new PlayerFormV5("Player Form V5");  //create obj
        msw.addComponents();
        msw.setFrameFeatures();
        msw.addMenus();
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
        ReadImage imagePanel = new ReadImage(); //create image.
        JPanel bottomPanel = new JPanel(new BorderLayout());  //set image to panel.
        bottomPanel.add(imagePanel,BorderLayout.NORTH);
        bottomPanel.add(buttonPanel,BorderLayout.CENTER);
        mainPanel.add(bottomPanel,BorderLayout.SOUTH);
    }

    protected void addMenus(){
        super.addMenus();
        setMenuIcon();
    }

    protected void setMenuIcon(){ //set icon image.
        newIcon = new ImageIcon("images/New-icon.png"); // set New-icon.png to newIcon
        newMenu.setIcon(newIcon);                                // set newIcon to newMenu
        openIcon = new ImageIcon("images/Open-icon.png");
        openMenu.setIcon(openIcon);
        saveIcon = new ImageIcon("images/Save-icon.png");
        saveMenu.setIcon(saveIcon);
    }
}
