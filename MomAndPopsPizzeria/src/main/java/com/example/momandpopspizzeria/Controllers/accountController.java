package com.example.momandpopspizzeria.Controllers;

import com.example.momandpopspizzeria.ClassObjects.Customer;
import com.example.momandpopspizzeria.HelloApplication;
import com.example.momandpopspizzeria.storage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;


import java.io.IOException;

//this class stores the functionalities for the account page
public class accountController{
    //attributes

    @FXML
    private Button home;
    @FXML
    private Label accountInformation;
    @FXML
    private Line headerBorder;
    @FXML
    private Label phoneNumber;
    @FXML
    private TextField phoneNumberTextField;
    @FXML
    private Label password;
    @FXML
    private TextField passwordTextField;
    @FXML
    private Label firstName;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private Label lastName;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private Label streetAddress;
    @FXML
    private TextField streetAddressTextField;
    @FXML
    private Label state;
    @FXML
    private TextField stateTextField;
    @FXML
    private Label city;
    @FXML
    private TextField cityTextField;
    @FXML
    private Label zipCode;
    @FXML
    private TextField zipCodeTextField;
    @FXML
    private Label paymentType;
    @FXML
    private HBox box;
    @FXML
    private RadioButton cash;
    @FXML
    private RadioButton check;
    @FXML
    private RadioButton creditCard;
    @FXML
    private Label creditCardNumber;
    @FXML
    private TextField creditCardNumberTextField;
    @FXML
    private Label creditCardSecurityNumber;
    @FXML
    private TextField creditCardSecurityNumberTextField;
    @FXML
    private Button confirm;
    @FXML
    private Label accountSuccess;
    @FXML
    private Pane child;
    //events
    @FXML
    //home button click
    //still trying to set the home page's labels dynamically, failing
    protected void onHomeButtonClick(ActionEvent actionEvent){
        accountSuccess.setVisible(false);
        child.getChildren().clear();
        child.getChildren().addAll(loadFXML("homePage.fxml"));
        homePageController.getLabel("name").setText(storage.getAccounts().get(0).getFirstName());
    }
    @FXML
    //credit card payment selected (also not selected(?))
    protected void onCreditCardRadioSelected(ActionEvent actionEvent){
        if(creditCard.isSelected()){
            cash.setSelected(false);
            check.setSelected(false);
            creditCardNumber.setVisible(true);
            creditCardNumberTextField.setVisible(true);
            creditCardSecurityNumber.setVisible(true);
            creditCardSecurityNumberTextField.setVisible(true);
        }
        if(!creditCard.isSelected()){
            creditCardNumber.setVisible(false);
            creditCardNumberTextField.setVisible(false);
            creditCardSecurityNumber.setVisible(false);
            creditCardSecurityNumberTextField.setVisible(false);
        }
    }
    @FXML
    //on confirm button click
    protected void onConfirmButtonClick(ActionEvent actionEvent){
        if(storage.getAccounts().isEmpty()&&!phoneNumberTextField.getText().equals("")&&!passwordTextField.getText().equals("")&&!firstNameTextField.getText().equals("")) {
            storage.addCustomer(new Customer(phoneNumberTextField.getText(), passwordTextField.getText(), firstNameTextField.getText(), lastNameTextField.getText(), streetAddressTextField.getText(), stateTextField.getText(), cityTextField.getText(), zipCodeTextField.getText(), creditCardNumberTextField.getText(), creditCardSecurityNumberTextField.getText()));
            accountSuccess.setVisible(true);
        }else if(!storage.getAccounts().isEmpty()){
            storage.getAccounts().get(0).setPhoneNumber(passwordTextField.getText());
            storage.getAccounts().get(0).setPassword(passwordTextField.getText());
            storage.getAccounts().get(0).setFirstName(firstNameTextField.getText());
            storage.getAccounts().get(0).setLastName(lastNameTextField.getText());
            storage.getAccounts().get(0).setStreetAddress(streetAddressTextField.getText());
            storage.getAccounts().get(0).setState(stateTextField.getText());
            storage.getAccounts().get(0).setCity(cityTextField.getText());
            storage.getAccounts().get(0).setZipCode(zipCodeTextField.getText());
            storage.getAccounts().get(0).setCreditCardNumber(creditCardNumberTextField.getText());
            storage.getAccounts().get(0).setCreditCardSecurityNumber(creditCardSecurityNumberTextField.getText());
            accountSuccess.setVisible(true);
        }
    }
    @FXML
    //on radio button selection
    protected void onRadioButtonSelected(ActionEvent actionEvent){
        if(cash.isSelected()){
            check.setSelected(false);
            creditCard.setSelected(false);
            creditCardNumber.setVisible(false);
            creditCardNumberTextField.setVisible(false);
            creditCardSecurityNumber.setVisible(false);
            creditCardSecurityNumberTextField.setVisible(false);
        }else if(check.isSelected()){
            cash.setSelected(false);
            creditCard.setSelected(false);
            creditCardNumber.setVisible(false);
            creditCardNumberTextField.setVisible(false);
            creditCardSecurityNumber.setVisible(false);
            creditCardSecurityNumberTextField.setVisible(false);
        }
    }
    //algorithms
    public Parent loadFXML(String name){
        try{
            return FXMLLoader.load(HelloApplication.class.getResource(name));
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

}
