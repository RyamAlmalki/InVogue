package models;

import api.DatabaseConnection;

public class Account {
    public int id = 0;
    public String phone;
    public String fanme;
    public String lname;
    public String email;
    public String password;
    public String country;


    public Account(int id, String email, String password, String fname, String lname, String country, String phone){
        this.email = email;
        this.fanme = fname;
        this.lname = lname;
        this.password = password;
        this.country = country;
        this.phone = phone;
        this.id = id;

    }




}