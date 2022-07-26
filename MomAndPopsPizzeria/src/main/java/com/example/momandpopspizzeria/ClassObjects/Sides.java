package com.example.momandpopspizzeria.ClassObjects;
//This holds the constructor for the sides **** may not be used? ****
public class Sides {
    //Attributes
    String side;
    double price;

    //Constructor
    public Sides(String side, double price){
        this.side = side;
        this.price = price;
    }

    //Getters
    public double getPrice() {return price;}
    public String getSide() {return side;}

    //Setters
    public void setSide(String side) {this.side = side;}
    public void setPrice(double price) {this.price = price;}

    //toString
    @Override
    public String toString() {
        return "Sides{" +
                "side='" + side + '\'' +
                ", price=" + price +
                '}';
    }
}
