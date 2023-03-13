package screens;

import feature.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class LoginScreen extends JPanel {

    public JTextField email;
    public JTextField password;
    MainFrame mainFrame;
    MainScreen mainScreen;

    LoginScreen(MainFrame mainFrame, MainScreen mainScreen){

        this.mainFrame = mainFrame;
        this.mainScreen = mainScreen;
        setPreferredSize(new Dimension(500,600));
        this.setBackground(Color.white);


        JPanel panel = new JPanel();
        panel.setBounds(0,0, 500, 600);
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(500,300));
        panel.setBackground(Color.white);


        email = new JTextField(50);
        email.setText(" Email");
        email.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                email.setText("");
            }
        });
        email.setBounds(25,10,450,50);


        password = new JTextField(50);
        password.setText(" Password");
        password.setBounds(25,110,450,50);
        password.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                password.setText("");
            }
        });


        panel.add(email);
        panel.add(password);
        this.add(panel);



        JButton login = new JButton("Start Shopping");
        login.addMouseListener( new lanelButtonMouseAdapter(this));
        login.setBackground(new Color(255,1,215));
        login.setForeground(Color.WHITE);
        login.setBorder(BorderFactory.createLineBorder(new Color(255,1,215)));
        login.setSize(100,50);
        login.setBounds(25,450,450,50);
        login.setFont(new Font("Arial", Font.PLAIN, 30));
        panel.add(login);
        this.setLayout(null);

    }



    private class lanelButtonMouseAdapter extends MouseAdapter {


        LoginScreen loginScreen;
        MainFrame mainFrame;
        MainScreen mainScreen;

        public lanelButtonMouseAdapter(LoginScreen loginScreen){
            this.loginScreen = loginScreen;
            this.mainFrame = loginScreen.mainFrame;
            this.mainScreen = loginScreen.mainScreen;
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

            String result = null;
            try {
                result = Login.login(loginScreen);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

            if(result.equals("Customer")){

                mainScreen.setVisible(false);
                mainFrame.add(new CustomerScreen(mainScreen, mainFrame));

            }

        }


        @Override
        public void mouseReleased (MouseEvent e)
        {

        }

    }

}


