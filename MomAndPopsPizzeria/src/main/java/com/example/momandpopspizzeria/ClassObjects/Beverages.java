package com.example.momandpopspizzeria.ClassObjects;
//this holds the constructor for the beverages
public class Beverages {
    private String drinkName;

    public Beverages(String drinkName){
        this.drinkName=drinkName;
    }

    //getters
    public String getDrinkName() {return drinkName;}

    //setters
    public void setDrinkName(String drinkName) {this.drinkName = drinkName;}

    //toString
    @Override
    public String toString() {
        return "Beverages{" +
                "drinkName='" + drinkName + '\'' +
                '}';
    }
}
