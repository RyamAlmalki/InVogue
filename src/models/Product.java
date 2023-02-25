package models;

public class Product {

    public int id;
    public int adminID;
    public String name;
    public String price;
    public String description;
    public String size;
    public String imagepath;



    public Product(int id, int adminID, String name, String price, String description, String size, String imagepath){
        this.id = id;
        this.adminID = adminID;
        this.name = name;
        this.price = price;
        this.description = description;
        this.size = size;
        this.imagepath = imagepath;
        //DatabaseConnection.addProduct(name, price, description, size, imagepath, material, quantity, color);
    }


}
