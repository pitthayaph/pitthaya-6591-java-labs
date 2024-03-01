    package phuengsujarit.pitthaya.lab10;
    import javax.swing.event.*;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
import java.io.File;
import java.util.List;
    public class PlayerFormV11 extends PlayerFormV10 {

        protected JColorChooser customColor;
        
        protected JMenuItem customMenu;
        protected Color selectedColor;
    

        
    
        public PlayerFormV11(String title) {
            super(title);
            customColor = new JColorChooser();
            customColor.getSelectionModel().addChangeListener(this);
            
        
            

        }
        
        public static void createAndShowGUI() {
            PlayerFormV11 msw = new PlayerFormV11("Player Form V11");
            msw.addComponents();
            msw.setFrameFeatures();
            msw.addMenus();
            msw.addListeners();
            msw.enableKeyboard();
            
        }
    
        @Override
        public void stateChanged(ChangeEvent e) {
            if (e.getSource() == yearSlider) {
                JSlider source = (JSlider)e.getSource();
                if (!source.getValueIsAdjusting()) {
                    int value = source.getValue();
                    JOptionPane.showMessageDialog(this, "Year of experience in this sport is " + value);
                }
            } else if (e.getSource() == customColor.getSelectionModel()) {
                selectedColor = customColor.getColor();
                nameField.setForeground(selectedColor);
                nationField.setForeground(selectedColor);
                birthDateField.setForeground(selectedColor);

            }
        }
        
        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
        }

        @Override
        protected void addMenus(){
            super.addMenus();
            customMenu = new JMenuItem("Custom");
            colorMenu.add(customMenu);

        }

        protected void addComponents(){
            super.addComponents();
        }

        @Override
        protected void addListeners(){
            super.addListeners();
            customMenu.addActionListener(this);
            
            
        }
    
        
        

        public void actionPerformed(ActionEvent e) {
             Object inputMenu = e.getSource();
        
            if (inputMenu == customMenu) {
                openColorChooser();
            }

            if (inputMenu == openMenu){
                JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(this);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                String message = "Opening file " + selectedFile.getAbsolutePath();
                JOptionPane.showMessageDialog(this, message);
            }
        } else if (inputMenu == saveMenu) {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showSaveDialog(this);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                String message = "Saving in file " + selectedFile.getAbsolutePath();
                JOptionPane.showMessageDialog(this, message);
            }
            } else {
                super.actionPerformed(e);
            }
        }
        
        private void openColorChooser() {
            JDialog dialog = JColorChooser.createDialog(PlayerFormV11.this, "Choose Text Color", true, customColor, null, null);
            dialog.setVisible(true);
        }

        
        protected void enableKeyboard() {
            
                // Set mnemonic key for the file menu
                fileMenu.setMnemonic(KeyEvent.VK_F); // Set mnemonic key for the file menu

                
                // Set shortcut keys and mnemonic keys for the menus
                newMenu.setMnemonic(KeyEvent.VK_N);
                newMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, 0));
                
                openMenu.setMnemonic(KeyEvent.VK_O);
                openMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, 0));
                
                saveMenu.setMnemonic(KeyEvent.VK_S);
                saveMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, 0));
                
                exitMenu.setMnemonic(KeyEvent.VK_X);
                exitMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, 0));
            
            
        }
        
        

        
    }


        



