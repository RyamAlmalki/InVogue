package screens.customerscreencomponent;

import api.DatabaseConnection;
import models.Product;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardInformation extends JPanel {

    CardInformation(Product product){
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(100,80));

        JLabel productName = new JLabel(product.name);
        productName.setFont(new Font("Arial", Font.PLAIN, 15));

        productName.setBounds(2,2 ,100,20);
        JLabel productPrice = new JLabel(product.price + "SAR");
        productPrice.setFont(new Font("Arial", Font.PLAIN, 10));
        productPrice.setBounds(2, 20,100,20);
        JButton buy = new JButton("buy");
        buy.setBounds(170, 2,70,20);

        buy.setBackground(new Color(255,1,215));
        buy.setForeground(Color.WHITE);
        buy.setBorder(BorderFactory.createLineBorder(new Color(255,1,215)));
        buy.setFocusable(false);

        add(productName);
        add(buy);
        add(productPrice);

        setLayout(null);
        buy.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                DatabaseConnection.customer.cartProducts.add(product);
            }
        });

    }



}
