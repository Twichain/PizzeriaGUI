package com.example.momandpopspizzeria.ClassObjects;
//Holds the constructor for the pizza toppings
public class Toppings {
    //Attributes
    String topping;
    double price;
    //Constructor
    public Toppings(String topping, double price){
        this.topping=topping;
        this.price=price;
    }
    //Getters
    public double getPrice() {return price;}
    public String getTopping() {return topping;}

    //Setters
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
