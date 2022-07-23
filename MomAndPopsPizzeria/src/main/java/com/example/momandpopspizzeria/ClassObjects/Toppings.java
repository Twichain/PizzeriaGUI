package com.example.momandpopspizzeria.ClassObjects;
//holds the constructor for the pizza toppings
public class Toppings {
    //attributes
    String topping;
    double price;
    //constructor
    public Toppings(String topping, double price){
        this.topping=topping;
        this.price=price;
    }
    //getters
    public double getPrice() {return price;}
    public String getTopping() {return topping;}

    //setters
    public void setPrice(double price) {this.price = price;}
    public void setTopping(String topping) {this.topping = topping;}

    //toString
    @Override
    public String toString() {
        return "Toppings{" +
                "topping='" + topping + '\'' +
                ", price=" + price +
                '}';
    }
}
