package com.example.momandpopspizzeria.ClassObjects;
//this class holds the constructor for the customer accounts.
public class Customer {
    //attributes
    private String phoneNumber;
    private String password;
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String state;
    private String city;
    private String zipCode;
    private String creditCardNumber;
    private String creditCardSecurityNumber;

    public Customer(String phoneNumber, String password, String firstName, String lastName, String streetAddress, String state, String city, String zipCode, String creditCardNumber, String creditCardSecurityNumber){
        this.phoneNumber=phoneNumber;
        this.password=password;
        this.firstName=firstName;
        this.lastName=lastName;
        this.streetAddress=streetAddress;
        this.state=state;
        this.city=city;
        this.zipCode=zipCode;
        this.creditCardNumber=creditCardNumber;
        this.creditCardSecurityNumber=creditCardSecurityNumber;

    }

    //getters
    public String getPhoneNumber(){return phoneNumber;}
    public String getPassword(){return password;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getStreetAddress(){return streetAddress;}
    public String getState(){return state;}
    public String getCity(){return city;}
    public String getZipCode(){return zipCode;}
    public String getCreditCardNumber(){return creditCardNumber;}
    public String getCreditCardSecurityNumber() {return creditCardSecurityNumber;}
    //setters

    public void setPhoneNumber(String input){this.phoneNumber=input;}
    public void setPassword(String input){this.password=input;}
    public void setFirstName(String input){this.firstName=input;}
    public void setLastName(String input){this.lastName=input;}
    public void setStreetAddress(String input){this.streetAddress=input;}
    public void setState(String input){this.state=input;}
    public void setCity(String input){this.city=input;}
    public void setZipCode(String input){this.zipCode=input;}
    public void setCreditCardNumber(String input){this.creditCardNumber=input;}
    public void setCreditCardSecurityNumber(String input){this.creditCardSecurityNumber=input;}

    //extra methods
    @Override
    public String toString() {
        return "Customer{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", creditCardSecurityNumber='" + creditCardSecurityNumber + '\'' +
                '}';
    }
}
