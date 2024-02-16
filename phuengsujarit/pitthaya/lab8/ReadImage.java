package phuengsujarit.pitthaya.lab8;

import java.awt.*;
import javax.swing.*;

public class ReadImage extends JPanel {
    
    protected ImageIcon sportImage;
    
    public ReadImage() {
        sportImage = new ImageIcon("images/Football.jpg"); //set Football.jpg to sportImage.
        setPreferredSize(new Dimension(sportImage.getIconWidth(), sportImage.getIconHeight())); // set panel to add picture.
    }

    protected void paintComponent(Graphics g) { //draw image.
        super.paintComponent(g);
        g.drawImage(sportImage.getImage(), 0, 0, this);
    }
}
