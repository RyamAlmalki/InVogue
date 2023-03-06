package screens;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(){
        setLayout(new BorderLayout());
        add(new MainScreen(this), BorderLayout.CENTER);
        setVisible(true);
        setSize(500,500);
    }
}
