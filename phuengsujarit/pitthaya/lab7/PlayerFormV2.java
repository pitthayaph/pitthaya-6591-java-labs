package phuengsujarit.pitthaya.lab7;


import java.awt.*;
import javax.swing.*;

public class PlayerFormV2 extends PlayerFormV1 {

    protected JLabel playerLabel, noteLabel, typespace;
    protected String[] playerTypes = {"Beginner", "Amateur", "Professional"};
    protected JComboBox<String> typesCombo;
    protected JTextArea textArea;
    protected JLabel typeLabel;
    protected JPanel newtoPanel, newbottomPanel, tyPanel, notePanel;
    protected JScrollPane scrollPane;

   public PlayerFormV2(String title) { //create constructors.
        super(title);
        newtoPanel = new JPanel();  //create components.
        tyPanel = new JPanel();
        newbottomPanel = new JPanel();
        playerLabel = new JLabel("Player Type:");
        notePanel = new JPanel();
        typespace = new JLabel("                                                ");
        noteLabel = new JLabel("Note:");
        typesCombo = new JComboBox<>(playerTypes);
        textArea = new JTextArea("Thailand will face Oman at the Abdullah bin Khalifa Stadium in Doha, Qatar, on Sunday in their second match of the 2023 AFC Asian Cup, Group F.");
        textArea.setRows(3); //set row and column of textarea.
        textArea.setColumns(35);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        typeLabel = new JLabel("Player Type:");
        scrollPane = new JScrollPane(textArea); //add textarea to scrollpane
    }

    public static void createAndShowGUI() {
        PlayerFormV2 msw = new PlayerFormV2("Player Form V2");  //change title.
        msw.addComponents();
        msw.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    protected void addComponents() {
        super.addComponents();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); //set scrollpane in vertical.
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); //disable scrollpane in horizontal.
        notePanel.setLayout(new BorderLayout()); //set and add components to notepanel.
        notePanel.add(noteLabel, BorderLayout.NORTH);
        notePanel.add(scrollPane, BorderLayout.CENTER);
        tyPanel.setLayout(new FlowLayout()); //set and add components to typepanel.
        tyPanel.add(playerLabel);
        tyPanel.add(typespace);
        tyPanel.add(typesCombo);
        typesCombo.setEditable(false); // Make the combo box non-editable
        typesCombo.setSelectedItem("Amateur"); // Set default type to "Amateur"
        typesCombo.setPreferredSize(new Dimension(175,25));
        newtoPanel.setLayout(new BorderLayout());  //set and add components to newtoppanel.
        newtoPanel.add(toPanel, BorderLayout.NORTH);
        newtoPanel.add(bottomPanel, BorderLayout.CENTER);
        newbottomPanel.setLayout(new BorderLayout());  //set and add components to newbottompanel.
        newbottomPanel.add(tyPanel, BorderLayout.NORTH);
        newbottomPanel.add(notePanel, BorderLayout.CENTER);
        mainPanel.removeAll(); //remove allcomponents in mainpanel.
        mainPanel.setLayout(new BorderLayout()); //set and add components to mainpanel.
        mainPanel.add(newtoPanel, BorderLayout.NORTH);
        mainPanel.add(newbottomPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
    }
    
}
