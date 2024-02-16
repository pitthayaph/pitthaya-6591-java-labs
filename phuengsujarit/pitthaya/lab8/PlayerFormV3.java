package phuengsujarit.pitthaya.lab8;

import java.awt.*;
import javax.swing.*;
import phuengsujarit.pitthaya.lab7.*;

public class PlayerFormV3 extends PlayerFormV2 {

    protected JMenuItem newMenu, openMenu, saveMenu, exitMenu;
    protected JMenuBar menuBar;
    protected JMenu fileMenu, configMenu, colorMenu, sizeMenu;
    protected JMenuItem redMenuItem, greenMenuItem, blueMenuItem;
    protected JMenuItem size16MenuItem, size20MenuItem, size24MenuItem;
    protected JTextArea noteText;
    protected JScrollPane noteScrollPane;

    public PlayerFormV3(String title) { // create constructors.
        super(title);
        noteText = new JTextArea("Doha, Qatar, on Sunday in their second match of the 2023 AFC Asian Cup, Group F.");  //set new text.
        noteText.setLineWrap(true);
        noteText.setWrapStyleWord(true);
        noteScrollPane = new JScrollPane(noteText);
    }

    public static void createAndShowGUI() {
        PlayerFormV3 msw = new PlayerFormV3("Player Form V3");  //create obj.
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

    protected void addMenus() {  //add menu to menubar.
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        newMenu = new JMenuItem("New");
        openMenu = new JMenuItem("Open");
        saveMenu = new JMenuItem("Save");
        exitMenu = new JMenuItem("Exit");
        fileMenu.add(newMenu);
        fileMenu.add(openMenu);
        fileMenu.add(saveMenu);
        fileMenu.addSeparator();
        fileMenu.add(exitMenu);
        configMenu = new JMenu("Config");
        colorMenu = new JMenu("Color");
        redMenuItem = new JMenuItem("Red");
        greenMenuItem = new JMenuItem("Green");
        blueMenuItem = new JMenuItem("Blue");
        colorMenu.add(redMenuItem);
        colorMenu.add(greenMenuItem);
        colorMenu.add(blueMenuItem);
        configMenu.add(colorMenu);
        sizeMenu = new JMenu("Size");
        size16MenuItem = new JMenuItem("16");
        size20MenuItem = new JMenuItem("20");
        size24MenuItem = new JMenuItem("24");
        sizeMenu.add(size16MenuItem);
        sizeMenu.add(size20MenuItem);
        sizeMenu.add(size24MenuItem);
        configMenu.add(sizeMenu);
        menuBar.add(fileMenu);
        menuBar.add(configMenu);
        setJMenuBar(menuBar);
    }

    protected void addComponents() { //add new text.
        super.addComponents();
        notePanel.add(noteLabel, BorderLayout.NORTH);
        notePanel.add(noteScrollPane, BorderLayout.CENTER);
    }
}
