package models;

import screens.CustomerScreen;

import java.util.ArrayList;

public class Customer extends Account{

    public ArrayList<Product> cartProducts = new ArrayList<>();

    public Customer(int id, String email, String fname, String lname, String password) {
        super(id, email, fname, lname, password);
    }

    public  void calPayment(CustomerScreen customerScreen){
        double payment = 0;
        for(int i = 0 ;i < cartProducts.size();i++){
            payment += Double. parseDouble(cartProducts.get(i).price);
        }

        customerScreen.price.setText("Price = " + payment);
    }
}
