package phuengsujarit.pitthaya.lab10;

import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.*;

public class PlayerFormV9 extends PlayerFormV8 implements ChangeListener{
    public PlayerFormV9(String title) {
        super(title);
    }
    
    public static void createAndShowGUI() {
        PlayerFormV9 msw = new PlayerFormV9("Player Form V9");
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
        yearSlider.addChangeListener(this);
    }

    public void stateChanged (ChangeEvent e){
        JSlider source = (JSlider)e.getSource();
        if (!source.getValueIsAdjusting()) {
            int value = source.getValue();
            JOptionPane.showMessageDialog(this, "Year of experience in this sport is " + value);

            
        }


    }
}
