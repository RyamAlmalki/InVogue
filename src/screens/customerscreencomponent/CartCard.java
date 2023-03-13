package screens.customerscreencomponent;

import models.Product;

import javax.swing.*;
import java.awt.*;

public class CartCard extends JPanel {

    CartCard(Product product){
        setLayout(new BorderLayout());


        Image image = new ImageIcon(product.imagepath).getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon icon = new ImageIcon(image);
        JLabel imagelabel = new JLabel();
        imagelabel.setIcon(icon);

        imagelabel.setPreferredSize(new Dimension(250,50));
        imagelabel.setBounds(50, 0, 400,50);



        JLabel productName = new JLabel(product.name);
        JLabel productDes = new JLabel(product.description);
        JLabel productSize = new JLabel(product.size);

        JLabel productPrice = new JLabel(product.price + "SAR");

        JPanel panel = new JPanel();
        panel.add(productName);
        panel.add(productDes);
        panel.add(productSize);
        panel.add(productPrice);
        panel.setBackground(Color.WHITE);
        panel.setLayout(new GridLayout(1, 4,10,10));





        //panel.setLayout(new FlowLayout(FlowLayout.CENTER, 150, 50));
        panel.setPreferredSize(new Dimension(900,50));



        add(panel, BorderLayout.EAST);

        add(imagelabel, BorderLayout.WEST);
        this.setBackground(Color.white);
    }


}
