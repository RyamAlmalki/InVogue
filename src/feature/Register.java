package feature;

import api.DatabaseConnection;
import screens.RegisterScreen;

import javax.swing.*;
import java.sql.SQLException;

public class Register {

    public static Boolean customerRegister(RegisterScreen registerScreen) throws SQLException {
        JTextField name = registerScreen.fName;

        JTextField age = registerScreen.lName;

        JTextField email = registerScreen.email;

        JTextField password = registerScreen.password;




        if(!name.getText().equals("") && !name.getText().equals(" First Name") && !age.getText().equals("") && !age.getText().equals(" Last Name") && !email.getText().equals("") && !email.getText().equals(" Email") && !password.getText().equals("") && !password.getText().equals(" Password"))
        {
            DatabaseConnection.addCustomer(name.getText(), age.getText(), email.getText(), password.getText());
            return true;
        }


        return false;
    }
}
