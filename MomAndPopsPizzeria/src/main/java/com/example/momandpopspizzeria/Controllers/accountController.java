package com.example.momandpopspizzeria.Controllers;

import com.example.momandpopspizzeria.ClassObjects.Customer;
import com.example.momandpopspizzeria.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.ArrayList;

//this class stores the functionalities for the account page
public class accountController{
    //attributes
    private Stage stage;
    private Scene scene;
    private Parent root;
    private static ArrayList<Customer> customers;

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
    private Label accountFailure;
    @FXML
    private Pane child;
    //events
    @FXML
    //home button click
    //changes scenes and sets the homepages' dynamics up that are related to this scene
    protected void onHomeButtonClick(ActionEvent actionEvent) throws IOException{
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("homePage.fxml"));
        root = loader.load();
        homePageController hpc = loader.getController();
        if(customers!=null){
            hpc.setLabel(customers.get(0).getFirstName());
        }else{
            hpc.setLabel("");
        }

        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();

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
        if(customers ==null&&!phoneNumberTextField.getText().equals("")&&!passwordTextField.getText().equals("")&&!firstNameTextField.getText().equals("")) {
            customers = new ArrayList<>();
            customers.add(new Customer(phoneNumberTextField.getText(), passwordTextField.getText(), firstNameTextField.getText(), lastNameTextField.getText(), streetAddressTextField.getText(), stateTextField.getText(), cityTextField.getText(), zipCodeTextField.getText(), creditCardNumberTextField.getText(), creditCardSecurityNumberTextField.getText()));
            accountSuccess.setVisible(true);
            System.out.println(customers.get(0).toString());
        }else if(!phoneNumberTextField.getText().equals("")&&!passwordTextField.getText().equals("")&&!firstNameTextField.getText().equals("")){
            customers.add(new Customer(phoneNumberTextField.getText(), passwordTextField.getText(), firstNameTextField.getText(), lastNameTextField.getText(), streetAddressTextField.getText(), stateTextField.getText(), cityTextField.getText(), zipCodeTextField.getText(), creditCardNumberTextField.getText(), creditCardSecurityNumberTextField.getText()));
            accountSuccess.setVisible(true);
        }else{
            accountFailure.setVisible(true);
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
    //getter for arraylist
    public static ArrayList<Customer> getCustomers(){return customers;}
}