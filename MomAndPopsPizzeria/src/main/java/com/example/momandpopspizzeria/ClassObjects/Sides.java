package com.example.momandpopspizzeria.ClassObjects;
//this holds the constructor for the sides **** may not be used? ****
public class Sides {
    //attributes
    String side;
    double price;

    //constructor
    Sides(String side, double price){
        this.side = side;
        this.price = price;
    }

    //getters
    public double getPrice() {return price;}
    public String getSide() {return side;}

    //setters
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
