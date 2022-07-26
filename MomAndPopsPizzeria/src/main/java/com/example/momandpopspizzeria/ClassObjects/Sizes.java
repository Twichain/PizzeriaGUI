package com.example.momandpopspizzeria.ClassObjects;
//Holds the constructor for the pizza sizes
public class Sizes {
    //Attributes
    String size;
    double price;

    //Constructor
    public Sizes(String size, double price){
        this.size=size;
        this.price=price;
    }

    //Getters
    public double getPrice() {return price;}
    public String getSize() {return size;}

    //Setters
    public void setPrice(double price) {this.price = price;}
    public void setSize(String size) {this.size = size;}

    //toString
    @Override
    public String toString() {
        return "Sizes{" +
                "size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
