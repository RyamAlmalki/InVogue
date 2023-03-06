package screens.customerscreencomponent;

import api.DatabaseConnection;
import models.Product;

import javax.swing.*;
import java.awt.*;

public class ProductCard extends JPanel {


    public ProductCard(Product product){
        setLayout(new BorderLayout());
        ImageCard image = new ImageCard(product);
        image.setPreferredSize(new Dimension(120,250));

        CardInformation cardInformation = new CardInformation(product);




        add(image, BorderLayout.NORTH);
        add(cardInformation, BorderLayout.SOUTH);

        this.setBackground(Color.white);
    }
}
