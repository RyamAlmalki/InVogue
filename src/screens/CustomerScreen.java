package screens;

import api.DatabaseConnection;
import screens.customerscreencomponent.EmptyCard;
import screens.customerscreencomponent.NavBar;
import screens.customerscreencomponent.ProductCard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;


public class CustomerScreen extends JPanel {

    public int row = DatabaseConnection.getNumber();
    public JPanel leftBorder;
    public JPanel rightBorder;
    public JPanel cardholder;
    public JPanel bottomBorder;
    public JLabel price;

    public CustomerScreen(MainScreen mainScreen, MainFrame mainFrame){

        // Frame Set-up
        this.setSize(500,500);
        this.setVisible(true);
        this.setLayout(new BorderLayout());




        cardholder = new JPanel();



        cardholder.setPreferredSize(new Dimension(500,32000));
        cardholder.setLayout(new GridLayout(row,4,5,5));


        int currentproduct = 0;
        Collections.shuffle(DatabaseConnection.products);
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


        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());
        cardholder.add(new EmptyCard());


        JScrollPane scroll = new JScrollPane(cardholder);
        scroll.getVerticalScrollBar().setBorder(null);
        scroll.setBorder(null);
        scroll.setOpaque(false);
        scroll.setBorder(null);
        scroll.getViewport().setBorder(null);
        scroll.getViewport().setOpaque(false);
        scroll.setBackground(Color.white);
        scroll.setBorder(BorderFactory.createEmptyBorder());

        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setBackground(Color.WHITE);

        scroll.getViewport().setBorder(null);
        scroll.setViewportBorder(null);
        scroll.setBorder(null);

        NavBar navbar = new NavBar(cardholder, scroll, this, mainScreen, mainFrame);

        leftBorder = new JPanel();
        leftBorder.setBackground(Color.white);
        leftBorder.setPreferredSize(new Dimension(80,60));

        rightBorder = new JPanel();
        rightBorder.setBackground(Color.white);
        rightBorder.setPreferredSize(new Dimension(80,60));


        bottomBorder = new JPanel();
        bottomBorder.setBackground(Color.white);
        bottomBorder.setPreferredSize(new Dimension(80,200));
        bottomBorder.setVisible(false);
        bottomBorder.setLayout(new GridLayout());


        JButton delete = new JButton("Clear Cart");
        delete.setBackground(Color.white);
        delete.setForeground(Color.black);
        delete.setBorder(BorderFactory.createLineBorder(new Color(255,1,215)));
        delete.setFocusable(false);
        delete.setBounds(230, 20, 200,50);
        delete.setPreferredSize(new Dimension(110,50));
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseConnection.customer.cartProducts.clear();
                cardholder.removeAll();
                price.setText("Price = 0.0");
                cardholder.revalidate();
                cardholder.repaint();
            }
        });

        JButton pay = new JButton("Pay");
        pay.setBackground(new Color(255,1,215));
        pay.setForeground(Color.WHITE);
        pay.setBorder(BorderFactory.createLineBorder(new Color(255,1,215)));
        pay.setFocusable(false);
        pay.setBounds(430, 20, 200,50);
        pay.setPreferredSize(new Dimension(100,50));
        pay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseConnection.customer.cartProducts.clear();
                cardholder.removeAll();
                price.setText("Price = 0.0");
                cardholder.revalidate();
                cardholder.repaint();
            }
        });

        JPanel action = new JPanel();
        action.setBackground(Color.white);

        action.add(delete);
        action.add(pay);
        action.setLayout(null);
        JPanel total = new JPanel();
        total.setBackground(Color.white);
        total.setLayout(null);
        price = new JLabel();
        total.add(price);
        price.setBounds(80, 20, 100,50);
        bottomBorder.add(total);
        bottomBorder.add(action);

        navbar.setPreferredSize(new Dimension(100,100));
        this.add(navbar, BorderLayout.NORTH);
        this.add(scroll, BorderLayout.CENTER);
        this.add(leftBorder, BorderLayout.WEST);
        this.add(rightBorder, BorderLayout.EAST);
        this.add(bottomBorder, BorderLayout.SOUTH);
        this.setBackground(Color.WHITE);


    }
}