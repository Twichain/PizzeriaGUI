package com.example.momandpopspizzeria.ClassObjects;
//Holds the constructor for the pizza crusts
public class Crusts {
   //Attributes
    private String crust;
    private double price;

    //Constructor
    public Crusts(String crust, double price){
        this.crust=crust;
        this.price=price;
    }

    //Getters
    public double getPrice() {return price;}
    public String getCrust() {return crust;}

    //Setters
    public void setCrust(String crust) {this.crust = crust;}
    public void setPrice(double price) {this.price = price;}

    @Override
    public String toString() {
        return "Crusts{" +
                "crust='" + crust + '\'' +
                ", price=" + price +
                '}';
    }
}
