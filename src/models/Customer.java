package models;

import api.DatabaseConnection;
import screens.CustomerScreen;
import screens.customerscreencomponent.ProductCard;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Customer extends Account{

    public ArrayList<Product> cartProducts = new ArrayList<>();

    public Customer(int id, String email, String password, String fname, String lname, String country, String phone) {
        super(id, email, password, fname, lname, country, phone);
    }



}
