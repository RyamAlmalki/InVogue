package screens.customerscreencomponent;

import api.DatabaseConnection;
import screens.CustomerScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NavBar extends JPanel {

    public String textFieldValue;
    public int row;
    public JPanel cardholder;
    public JScrollPane scroll;
    public CustomerScreen customerScreen;

    public NavBar(JPanel cardholder, JScrollPane scroll, CustomerScreen customerScreen){
        JLabel logo = new JLabel();
        ImageIcon icon = new ImageIcon("C:\\Development\\OOP2\\InVogue\\resources\\dashboardlogo.png");
        logo.setIcon(icon);
        this.cardholder = cardholder;
        this.scroll = scroll;
        this.customerScreen = customerScreen;






        JLabel shoppingCart = new JLabel();
        ImageIcon shoppingCarticon = new ImageIcon("C:\\Development\\OOP2\\InVogue\\resources\\cart.png");
        shoppingCart.setIcon(shoppingCarticon);
        shoppingCart.setVisible(true);
        shoppingCart.addMouseListener(new buttonMouseAdapter(customerScreen));


        JTextField searchbar = new JTextField(60);

        //searchbar.setBounds(530,35,400,30);
        searchbar.setEditable(true);
        searchbar.addActionListener(ae -> {
            textFieldValue = searchbar.getText();





                    if(textFieldValue.equals("short dress")){
                        row = DatabaseConnection.getNumberforfilter(textFieldValue);
                        cardholder.setLayout(new GridLayout(row,4,5,5));
                        customerScreen.bottomBorder.setVisible(false);
                        customerScreen.rightBorder.setPreferredSize(new Dimension(80,60));
                        customerScreen.leftBorder.setPreferredSize(new Dimension(80,60));


                        System.out.println("found");
                        cardholder.removeAll();
                        cardholder.setPreferredSize(new Dimension(500,1950));




                        int currentproduct = 0;
                        for(int col = 0; col < 5; col++){
                            for(int rows = 0; rows < row; rows++){

                                if(DatabaseConnection.productsFilter.size() % 2 != 0){
                                    if(currentproduct < DatabaseConnection.productsFilter.size()){
                                        cardholder.add(new ProductCard(DatabaseConnection.productsFilter.get(currentproduct)));
                                        currentproduct++;
                                    }
                                }

                                else if(DatabaseConnection.productsFilter.size() % 2 == 0){

                                    if(currentproduct < DatabaseConnection.productsFilter.size()){
                                        cardholder.add(new ProductCard(DatabaseConnection.productsFilter.get(currentproduct)));
                                        currentproduct++;
                                    }

                                }
                            }
                        }


                        cardholder.add(new ProductCard(DatabaseConnection.productsFilter.get(0)));
                        cardholder.add(new ProductCard(DatabaseConnection.productsFilter.get(0)));
                        cardholder.add(new ProductCard(DatabaseConnection.productsFilter.get(0)));
                        cardholder.add(new ProductCard(DatabaseConnection.productsFilter.get(0)));
                        cardholder.add(new ProductCard(DatabaseConnection.productsFilter.get(0)));
                        cardholder.add(new ProductCard(DatabaseConnection.productsFilter.get(0)));
                        cardholder.add(new ProductCard(DatabaseConnection.productsFilter.get(0)));
                        cardholder.add(new ProductCard(DatabaseConnection.productsFilter.get(0)));
                        cardholder.add(new ProductCard(DatabaseConnection.productsFilter.get(0)));
                        cardholder.add(new ProductCard(DatabaseConnection.productsFilter.get(0)));
                        cardholder.add(new ProductCard(DatabaseConnection.productsFilter.get(0)));
                        cardholder.add(new ProductCard(DatabaseConnection.productsFilter.get(0)));
                        cardholder.add(new ProductCard(DatabaseConnection.productsFilter.get(0)));






                        cardholder.revalidate();
                        cardholder.repaint();

                    }


                    if(textFieldValue.equals("")){

                        customerScreen.bottomBorder.setVisible(false);
                        customerScreen.rightBorder.setPreferredSize(new Dimension(80,60));
                        customerScreen.leftBorder.setPreferredSize(new Dimension(80,60));
                        row = DatabaseConnection.getNumber();
                        int currentproductnumber = 0;
                        cardholder.removeAll();

                        cardholder.setLayout(new GridLayout(row,4,5,5));
                        cardholder.setPreferredSize(new Dimension(500,14000));
                        for(int col = 0; col < 5; col++){
                            for(int rows = 0; rows < row; rows++){

                                if(DatabaseConnection.products.size() % 2 != 0){
                                    if(currentproductnumber < DatabaseConnection.products.size()){
                                        cardholder.add(new ProductCard(DatabaseConnection.products.get(currentproductnumber)));
                                        currentproductnumber++;
                                    }
                                }

                                else if(DatabaseConnection.products.size() % 2 == 0){

                                    if(currentproductnumber < DatabaseConnection.products.size()){
                                        cardholder.add(new ProductCard(DatabaseConnection.products.get(currentproductnumber)));
                                        currentproductnumber++;
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

                        cardholder.revalidate();
                        cardholder.repaint();
                    }






        });

        JPanel iconSection = new JPanel();
        iconSection.setOpaque(false);
        iconSection.add(shoppingCart);
        shoppingCart.setBounds(330,30,100,30);
        iconSection.setLayout(null);
        JPanel textSection = new JPanel();
        textSection.setOpaque(false);
        searchbar.setBounds(30,30,700,30);
        textSection.add(searchbar);
        textSection.setLayout(null);
        JPanel logoSection = new JPanel();
        logoSection.setOpaque(false);
        logo.setBounds(70,20,300,60);
        logoSection.setLayout(null);
        logoSection.add(logo);
        //logo.setBounds(100,0,300,100);

        add(logoSection);
        add(textSection);
        add(iconSection);
        setLayout(new GridLayout(1, 3, 10,10));
        //setLayout(new FlowLayout(FlowLayout.LEFT, 100, 3));
    }



    private class buttonMouseAdapter extends MouseAdapter{

        CustomerScreen customerScreen;


        public buttonMouseAdapter( CustomerScreen customerScreen){

            this.customerScreen = customerScreen;


        }


        @Override
        public void mouseEntered (MouseEvent e)
        {

        }

        @Override
        public void mouseExited (MouseEvent e)
        {

        }

        @Override
        public void mousePressed(MouseEvent e)
        {


            cardholder.removeAll();

            cardholder.setLayout(new GridLayout(20,1,5,5));
            cardholder.setPreferredSize(new Dimension(1000,3000));




            for(int i = 0 ; i < DatabaseConnection.customer.cartProducts.size(); i++){
                customerScreen.cardholder.add(new CartCard(DatabaseConnection.customer.cartProducts.get(i)));
            }

            cardholder.revalidate();
            cardholder.repaint();





            customerScreen.bottomBorder.setVisible(true);



        }




        @Override
        public void mouseReleased (MouseEvent e)
        {

        }




    }




    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        this.setBackground(new Color(0x1F1E31));
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth(), h = getHeight();
        Color color1 = new Color(0xFF00D7);
        Color color2 = new Color(0x1E202F);
        GradientPaint gp = new GradientPaint(0, 0, color1, w, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }



}
