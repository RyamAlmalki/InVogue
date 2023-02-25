package screens.customerscreencomponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NavBar extends JPanel {


    public NavBar(){
        JLabel logo = new JLabel();
        ImageIcon icon = new ImageIcon("C:\\Development\\OOP2\\InVogue\\resources\\dashboardlogo.png");
        logo.setIcon(icon);
        logo.setBounds(100,0,300,100);

        JTextField searchbar = new JTextField();
        searchbar.setBounds(530,35,400,30);
        searchbar.setFocusable(false);

        searchbar.addActionListener(e -> System.out.println(e.getActionCommand()));



        add(logo);
        add(searchbar);
        setLayout(null);
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
