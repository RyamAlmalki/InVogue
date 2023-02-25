package screens;

import api.DatabaseConnection;
import screens.customerscreencomponent.NavBar;
import screens.customerscreencomponent.ProductCard;

import javax.swing.*;
import java.awt.*;

public class CustomerScreen extends JFrame {

    public int row = DatabaseConnection.getNumber();

    public CustomerScreen(){

        // Frame Set-up
        this.setSize(500,500);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NavBar navbar = new NavBar();

        JPanel cardholder = new JPanel();
        cardholder.setPreferredSize(new Dimension(500,15000));
        cardholder.setLayout(new GridLayout(row,4,5,5));


        int currentproduct = 0;

        for(int col = 0; col < 5; col++){
            for(int rows = 0; rows < row; rows++){

                if(DatabaseConnection.products.size() % 2 != 0){
                    if(currentproduct < DatabaseConnection.products.size()){
                        cardholder.add(new ProductCard(DatabaseConnection.products.get(currentproduct)));
                        currentproduct++;
                    }
                }

                else if(DatabaseConnection.products.size() % 2 == 0){

                    if(currentproduct < DatabaseConnection.products.size()){
                        cardholder.add(new ProductCard(DatabaseConnection.products.get(currentproduct)));
                        currentproduct++;
                    }

                }
            }
        }



        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));
        cardholder.add(new ProductCard(DatabaseConnection.products.get(0)));






        JPanel leftBorder = new JPanel();
        leftBorder.setBackground(Color.white);
        leftBorder.setPreferredSize(new Dimension(80,60));
        JPanel rightBorder = new JPanel();
        rightBorder.setBackground(Color.white);
        rightBorder.setPreferredSize(new Dimension(80,60));

        navbar.setPreferredSize(new Dimension(100,100));
        JScrollPane scroll = new JScrollPane(cardholder);
        scroll.setBackground(Color.white);
        scroll.setBorder(BorderFactory.createEmptyBorder());

        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setBackground(Color.WHITE);

        scroll.getViewport().setBorder(null);
        scroll.setViewportBorder(null);
        scroll.setBorder(null);


        this.add(navbar, BorderLayout.NORTH);
        this.add(scroll, BorderLayout.CENTER);
        this.add(leftBorder, BorderLayout.WEST);
        this.add(rightBorder, BorderLayout.EAST);
        this.getContentPane().setBackground(Color.WHITE);


    }
}