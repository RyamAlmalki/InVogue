package screens.customerscreencomponent;

import api.DatabaseConnection;
import models.Product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardInformation extends JPanel {

    CardInformation(Product product){
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(100,80));

        JLabel productName = new JLabel(product.name);
        productName.setBounds(2,2 ,100,20);
        JLabel productPrice = new JLabel(product.price + "SAR");
        productPrice.setBounds(2, 20,100,20);
        JButton buy = new JButton("buy");
        //buy.setSize(70,20);
        buy.setBounds(170, 2,70,20);



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
