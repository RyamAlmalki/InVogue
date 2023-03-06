package screens;

import javax.swing.*;
import java.awt.*;

public class RegisterScreen extends JPanel {

    public JTextField email;
    public JTextField password;
    public JTextField fName;
    public JTextField lName;
    MainFrame mainFrame;
    MainScreen mainScreen;


    RegisterScreen(MainScreen mainScreen){

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


        lName = new JTextField(50);
        lName.setText(" Last Name");
        lName.setBounds(25,110,450,50);


        email = new JTextField(50);
        email.setText(" Email");
        email.setBounds(25,210,450,50);


        password = new JTextField(50);
        password.setText(" Password");
        password.setBounds(25,310,450,50);
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

        this.setLayout(null);




    }
}
