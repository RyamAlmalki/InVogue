package api;



import models.Customer;
import models.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {


    public static ArrayList<Product> products = new ArrayList<Product>();
    public static ArrayList<Product> productsFilter = new ArrayList<Product>();
    public static int numberOfProduct = 0;
    public static int numberOfProductFiltered = 0;
    public static PreparedStatement getCustomer;
    static private Connection connection;
    static private PreparedStatement getAllProduct;
    static private PreparedStatement getFilteredData;
    static public ResultSet resultSet = null;
    public static Customer customer;


    public static void getProduct() throws SQLException {

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Lana@2020");
            getAllProduct = connection.prepareStatement( "SELECT * FROM product");


        }catch(SQLException sqlException){
            sqlException.printStackTrace();
            System.exit(1);}



        try{

            DatabaseConnection.products.clear();
            DatabaseConnection.numberOfProduct = 0;
            resultSet = getAllProduct.executeQuery();

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


    public static void getFilteredData(String search) throws SQLException {

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Lana@2020");
            getFilteredData = connection.prepareStatement( "SELECT * FROM product WHERE Pname LIKE '%" + search + "%' ");


        }catch(SQLException sqlException){
            sqlException.printStackTrace();
            System.exit(1);}



        try{

            productsFilter.clear();
            numberOfProductFiltered = 0;
            resultSet = getFilteredData.executeQuery();

            while(resultSet.next()){

                DatabaseConnection.productsFilter.add(new Product(resultSet.getInt("ProductID"), resultSet.getInt("AdmID"), resultSet.getString("Pname"), resultSet.getString("Price"), resultSet.getString("PDescription"),  resultSet.getString("Size"), resultSet.getString("PImage")));
                numberOfProductFiltered++;
                System.out.println("found filter");
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


    public static String login(String email, String password) throws SQLException{



        try{

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Lana@2020");
            getCustomer = connection.prepareStatement( "SELECT * FROM customer WHERE Pass = ? AND Email = ?;" );



        }catch(SQLException sqlException){
            sqlException.printStackTrace();
            System.exit(1);}


        try{


            getCustomer.setString(1,password);
            getCustomer.setString(2,email);
            resultSet = getCustomer.executeQuery();

            while(resultSet.next()){
                DatabaseConnection.customer = new Customer(resultSet.getInt("CustID"), resultSet.getString("Email"), resultSet.getString("Pass"), resultSet.getString("FName"), resultSet.getString("Lname"), resultSet.getString("Country"), resultSet.getString("Phone"));
                return "Customer";
            }




        }catch(SQLException sqlException)
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


        return "";
    }




    public static int getNumberforfilter(String textFieldValue){

        try {
            DatabaseConnection.getFilteredData(textFieldValue);
            System.out.println(DatabaseConnection.numberOfProductFiltered);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        int row = 0;
        int x = 0;
        for(int i = 0 ; i <DatabaseConnection.numberOfProductFiltered; ++i )
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
