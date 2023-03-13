package feature;

import api.DatabaseConnection;
import screens.LoginScreen;
import javax.swing.*;
import java.sql.SQLException;

public class Login {


    public static String login(LoginScreen loginScreen) throws SQLException {
        JTextField email = loginScreen.email;
        JTextField password = loginScreen.password;


        return DatabaseConnection.login(email.getText(), password.getText());
    }


}
