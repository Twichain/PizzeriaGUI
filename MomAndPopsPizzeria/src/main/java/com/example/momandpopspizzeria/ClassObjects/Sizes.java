package com.example.momandpopspizzeria.ClassObjects;
//holds the constructor for the pizza sizes
public class Sizes {
    //attributes
    String size;
    double price;

    //constructor
    public Sizes(String size, double price){
        this.size=size;
        this.price=price;
    }

    //getters
    public double getPrice() {return price;}
    public String getSize() {return size;}

    //setters
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
