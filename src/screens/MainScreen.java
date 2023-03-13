package screens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
    Main screen handles the login and registration
 */
public class MainScreen extends JPanel {

    public LoginScreen loginScreen;
    public RegisterScreen registerScreen;
    public JButton register;
    public JButton login;
    JPanel loginPanel;

    public MainScreen(MainFrame mainFrame){


        // create the logo label and give it an Icon
        JLabel mainLogo = new JLabel();
        ImageIcon iconLogo = new ImageIcon("resources\\InVogueMain.png");
        mainLogo.setIcon(iconLogo);


        // place the logo label into a panel and set to FlowLayout to place logo in the center
        JPanel logoPanel = new JPanel();
        logoPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0,25));
        logoPanel.add(mainLogo);
        logoPanel.setBounds(0,0,500,100);
        logoPanel.setBackground(Color.white);


        loginScreen = new LoginScreen(mainFrame, this);
        loginScreen.setVisible(false);
        registerScreen = new RegisterScreen(this, mainFrame);
        registerScreen.setVisible(false);


        // create a panel and place two buttons for the user to pick
        JPanel choice = new JPanel();
        login = new JButton("Login");
        login.setFont(new Font("Arial", Font.PLAIN, 30));
        login.setForeground(Color.white);
        login.setFocusable(false);
        login.setBackground(new Color(255,1,215));
        login.setBorder(BorderFactory.createEmptyBorder());
        login.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                registerScreen.email.setText(" Email");
                registerScreen.password.setText(" Password");
                registerScreen.fName.setText(" First Name");
                registerScreen.lName.setText(" Last Name");

                choiceClicked(loginScreen);
                login.setForeground(Color.white);
                login.setBackground(new Color(255,1,215));
                register.setForeground(Color.black);
                register.setBackground(Color.white);

            }
        });


        register = new JButton("Register");
        register.setFont(new Font("Arial", Font.PLAIN, 30));
        register.setForeground(Color.black);
        register.setBackground(Color.white);
        register.setFocusable(false);
        register.setBorder(BorderFactory.createLineBorder(new Color(255,1,215)));
        register.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loginScreen.email.setText(" Email");
                loginScreen.password.setText(" Password");

                choiceClicked(registerScreen);
                register.setForeground(Color.white);
                register.setBackground(new Color(255,1,215));
                login.setForeground(Color.black);
                login.setBackground(Color.white);
                login.setBorder(BorderFactory.createLineBorder(new Color(255,1,215)));
            }
        });
        choice.setLayout(new GridLayout(1,2,0,0));
        choice.setBounds(0,100,500,50);
        choice.add(login);
        choice.add(register);


        // change depending on the choice of login or register
        JPanel choicePanel = new JPanel();
        choicePanel.setBounds(0, 150, 500,600);
        choicePanel.setBackground(Color.white);
        choicePanel.add(registerScreen);
        choicePanel.add(loginScreen);
        choicePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 2,2));


        loginPanel = new JPanel();
        loginPanel.setBackground(Color.white);
        loginPanel.setPreferredSize(new Dimension(500,700));
        loginPanel.setLayout(null);
        loginPanel.add(logoPanel);
        loginPanel.add(choice);
        loginPanel.add(choicePanel);
        add(loginPanel);



        choiceClicked(loginScreen);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 60));
        setVisible(true);
    }

    public void choiceClicked(JPanel panel){
        loginScreen.setVisible(false);
        registerScreen.setVisible(false);

        panel.setVisible(true);
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
