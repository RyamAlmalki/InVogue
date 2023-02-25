package screens.customerscreencomponent;

import models.Product;

import javax.swing.*;
import java.awt.*;

public class ProductCard extends JPanel {


    public ProductCard(Product product){
        setLayout(new BorderLayout());
        ImageCard image = new ImageCard(product);
        image.setPreferredSize(new Dimension(120,250));

        JButton button = new JButton();
        button.setBackground(Color.gray);
        button.setPreferredSize(new Dimension(100,80));

        add(image, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);

        this.setBackground(Color.white);
    }
}
