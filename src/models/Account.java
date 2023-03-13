package models;


public class Account {
    public int id = 0;
    public String fanme;
    public String lname;
    public String email;
    public String password;


    public Account(int id, String email, String fname, String lname, String password){
        this.email = email;
        this.fanme = fname;
        this.lname = lname;
        this.password = password;
        this.id = id;

    }

}