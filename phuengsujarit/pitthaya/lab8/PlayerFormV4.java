package phuengsujarit.pitthaya.lab8;

import java.awt.*;
import javax.swing.*;

public class PlayerFormV4 extends PlayerFormV3 {

    protected JLabel hobbieLabel, sportLabel, yearLabel;
    protected JCheckBox readingCheckBox,browsingCheckBox, sleepingCheckBox, travellingCheckBox;
    protected JSlider yearSlider;
    protected JPanel hobbiePanel, checkBoxPanel, sportListPanel, sportPanel, topPanel, genderPanel, yearPanel, midPanel;
    protected JList<String> sportList;
    protected JScrollPane noteScrollPane;
    
        public PlayerFormV4 (String title){  // create constructors.
        super(title);
        hobbieLabel = new JLabel("Hobbies:");
        sportLabel = new JLabel("Sport:");
        yearLabel = new JLabel("Year of experience in this sport:");
        readingCheckBox = new JCheckBox("Reading");
        browsingCheckBox = new JCheckBox("Browsing");
        sleepingCheckBox = new JCheckBox("Sleeping");
        travellingCheckBox = new JCheckBox("Traveling");
        String[] sports = {"Badminton", "Boxing", "Football", "Running"};
        sportList = new JList<>(sports);
        sportList.setSelectedIndex(2);
        yearSlider = new JSlider(0, 20, 0);
        yearSlider.setMajorTickSpacing(5);
        yearSlider.setPaintTicks(true);
        yearSlider.setPaintLabels(true);
    }

    public static void createAndShowGUI() {
        PlayerFormV4 msw = new PlayerFormV4("Player Form V4");   //create obj.
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

    protected void addComponents() {  //set panel and add component to it.
        super.addComponents();
        JPanel genderPanel = new JPanel(new FlowLayout());
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        JPanel yearPanel = new JPanel(new BorderLayout());
        yearPanel.add(yearLabel,BorderLayout.NORTH);
        yearPanel.add(yearSlider,BorderLayout.CENTER);
        yearPanel.setPreferredSize(new Dimension(100,100));
        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.add(genderLabel,BorderLayout.WEST);
        bottomPanel.add(genderPanel,BorderLayout.EAST);
        tyPanel.setLayout(new BorderLayout());
        tyPanel.add(playerLabel,BorderLayout.WEST);
        tyPanel.add(typesCombo,BorderLayout.EAST);
        JPanel checkBoxPanel = new JPanel(new FlowLayout());
        checkBoxPanel.add(readingCheckBox);
        checkBoxPanel.add(browsingCheckBox);
        checkBoxPanel.add(sleepingCheckBox);
        checkBoxPanel.add(travellingCheckBox);
        JPanel hobbiePanel = new JPanel(new BorderLayout());
        hobbiePanel.add(hobbieLabel,BorderLayout.NORTH);
        hobbiePanel.add(checkBoxPanel,BorderLayout.CENTER);
        JPanel sportPanel = new JPanel(new BorderLayout());
        sportPanel.add(sportLabel,BorderLayout.WEST);
        sportPanel.add(sportList,BorderLayout.EAST);
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(newtoPanel,BorderLayout.NORTH);
        topPanel.add(tyPanel,BorderLayout.CENTER);
        topPanel.add(hobbiePanel,BorderLayout.SOUTH);
        JPanel midPanel = new JPanel(new BorderLayout());
        midPanel.add(sportPanel,BorderLayout.NORTH);
        midPanel.add(yearPanel,BorderLayout.CENTER);
        midPanel.add(notePanel,BorderLayout.SOUTH);
        mainPanel.add(topPanel,BorderLayout.NORTH);
        mainPanel.add(midPanel,BorderLayout.CENTER);
    } 
}
