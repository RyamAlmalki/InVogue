package screens.customerscreencomponent;

import models.Product;

import javax.swing.*;
import java.awt.*;

public class ImageCard extends JPanel {


    ImageCard(Product product){

        ImageIcon icon;
        Image image = new ImageIcon(product.imagepath).getImage();
        icon = new ImageIcon(image);




        JLabel imagelabel = new JLabel();
        imagelabel.setIcon(icon);
        imagelabel.setPreferredSize(new Dimension(400, 250));
        imagelabel.setBounds(30, 25, 400,250);


        this.setBackground(Color.white);
        this.add(imagelabel);
        this.setLayout(null);
        this.setVisible(true);
    }


}
