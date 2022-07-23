package com.example.momandpopspizzeria.ClassObjects;
//holds the constructor for the pizza crusts
public class Crusts {
    private String crust;
    private double price;

    //constructor
    public Crusts(String crust, double price){
        this.crust=crust;
        this.price=price;
    }

    //getters
    public double getPrice() {return price;}
    public String getCrust() {return crust;}

    //setters
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
