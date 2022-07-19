package com.example.momandpopspizzeria;
//this class is where all the information will be stored. im going to do arraylists for everything just because they are easy to work with.
//we are storing EVERYTHING in arraylists that way we can access every part of the solution the same way for efficiency.

import com.example.momandpopspizzeria.ClassObjects.*;

import java.util.ArrayList;

//maybe i can make this into a hash instead of an array list.
public class storage {
    //attributes
    //array list for customer accounts
    private static ArrayList<Customer> accounts= new ArrayList<>();

    //array list for employee accounts

    //array list for order
    private static ArrayList<Order> order = new ArrayList<>();

    //array list for main order menu items

    //array list for toppings
    private static ArrayList<Toppings> toppings = new ArrayList<>();

    //array list for sides
    private static ArrayList<Sides> sides = new ArrayList<>();

    //array list for pizza sizes
    private static ArrayList<PizzaSizes> sizes = new ArrayList<>();

    //array list for buttons

    //array list for beverage sizes

    //array list for beverages
    private static ArrayList<Beverages> beverages = new ArrayList<>();

    //getters
    public static ArrayList<Customer> getAccounts(){return accounts;}
    public static ArrayList<Beverages> getBeverages() {return beverages;}
    public static ArrayList<Order> getOrder() {return order;}
    public static ArrayList<PizzaSizes> getSizes() {return sizes;}
    public static ArrayList<Sides> getSides() {return sides;}
    public static ArrayList<Toppings> getToppings() {return toppings;}

    //setters
    public static void addCustomer(Customer customer){accounts.add(customer);}

}
