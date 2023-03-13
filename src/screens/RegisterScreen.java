package screens;

import feature.Register;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class RegisterScreen extends JPanel {

    public JTextField email;
    public JTextField password;
    public JTextField fName;
    public JTextField lName;
    MainFrame mainFrame;
    MainScreen mainScreen;


    RegisterScreen(MainScreen mainScreen, MainFrame mainFrame){

        this.mainFrame = mainFrame;
        this.mainScreen = mainScreen;
        setPreferredSize(new Dimension(500,600));
        this.setBackground(Color.white);
        JPanel panel = new JPanel();
        panel.setBounds(0,0, 500, 600);
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(500,600));
        panel.setBackground(Color.white);


        fName = new JTextField(50);
        fName.setText(" First Name");
        fName.setBounds(25,10,450,50);
        fName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fName.setText("");
            }
        });


        lName = new JTextField(50);
        lName.setText(" Last Name");
        lName.setBounds(25,110,450,50);
        lName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lName.setText("");
            }
        });

        email = new JTextField(50);
        email.setText(" Email");
        email.setBounds(25,210,450,50);
        email.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                email.setText("");
            }
        });

        password = new JTextField(50);
        password.setText(" Password");
        password.setBounds(25,310,450,50);
        password.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                password.setText("");
            }
        });

        panel.add(fName);
        panel.add(lName);
        panel.add(email);
        panel.add(password);
        this.add(panel);



        JButton login = new JButton("Start Shopping");
        login.setBackground(new Color(255,1,215));
        login.setForeground(Color.WHITE);
        login.setBorder(BorderFactory.createLineBorder(new Color(255,1,215)));
        login.setSize(100,50);
        login.setBounds(25,450,450,50);
        login.setFont(new Font("Arial", Font.PLAIN, 30));
        panel.add(login);
        login.addMouseListener(new lanelButtonMouseAdapter(this));
        this.setLayout(null);
    }


    private class lanelButtonMouseAdapter extends MouseAdapter{
        RegisterScreen registerScreen;
        Register register;
        public lanelButtonMouseAdapter(RegisterScreen registerScreen){
            this.registerScreen =registerScreen;
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
            register = new Register();

            try {
                if (register.customerRegister(registerScreen)) {

                    mainFrame.add(new CustomerScreen(mainScreen, mainFrame));
                    mainScreen.setVisible(false);

                }else{
                    System.out.println("problem");
                }
            }catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }


        @Override
        public void mouseReleased (MouseEvent e)
        {

        }

    }



}
