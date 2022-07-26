package com.example.momandpopspizzeria.ClassObjects;
//This holds the constructor for the beverages
public class Beverages {
    //Attributes
    private String drinkName;
    //Constructor
    public Beverages(String drinkName){
        this.drinkName=drinkName;
    }

    //Getters
    public String getDrinkName() {return drinkName;}

    //Setters
    public void setDrinkName(String drinkName) {this.drinkName = drinkName;}

    //toString
    @Override
    public String toString() {
        return "Beverages{" +
                "drinkName='" + drinkName + '\'' +
                '}';
    }
}
