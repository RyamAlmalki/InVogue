package api;



import models.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {


    public static ArrayList<Product> products = new ArrayList<Product>();
    public static int numberOfProduct = 0;

    static private Connection connection;
    static private PreparedStatement selectAllPeople;
    static public ResultSet resultSet = null;



    public static void getProduct() throws SQLException {

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Lana@2020");
            selectAllPeople = connection.prepareStatement( "SELECT * FROM product");


        }catch(SQLException sqlException){
            sqlException.printStackTrace();
            System.exit(1);}



        try{


            resultSet = selectAllPeople.executeQuery();

            while(resultSet.next()){

                DatabaseConnection.products.add(new Product(resultSet.getInt("ProductID"), resultSet.getInt("AdmID"), resultSet.getString("Pname"), resultSet.getString("Price"), resultSet.getString("PDescription"),  resultSet.getString("Size"), resultSet.getString("PImage")));
                numberOfProduct++;
            }


        }catch (SQLException sqlException)
        {
            sqlException.printStackTrace();}
        finally{
            try
            {
                resultSet.close();
            }
            catch (SQLException sqlException){
                sqlException.printStackTrace();

            }
        }


    }


    public static int getNumber(){
        try {
            DatabaseConnection.getProduct();

        } catch (SQLException ex) {
            System.out.println("error");
        }

        int row = 0;
        int x = 0;
        for(int i = 0 ; i <DatabaseConnection.numberOfProduct; ++i )
        {
            x++;
            if(x == 2){
                row++;
                x=0;
            }
        }

        row++;
        return row;
    }




}
