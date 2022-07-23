package com.example.momandpopspizzeria.Controllers;

import com.example.momandpopspizzeria.ClassObjects.Customer;
import com.example.momandpopspizzeria.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
    private String paymentType;
    private String productRetrieval;
    private ArrayList<Customer> customers;

    @FXML
    private Button home;
    @FXML
    private Label accountInformation;
    @FXML
    private RadioButton pickUp;
    @FXML
    private RadioButton delivery;
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
/*
    @FXML
    private Label paymentType;
*/
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
     @FXML
    private ListView<String> list;
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
            hpc.setCustomers(customers);
        }else{
            hpc.setLabel("");
        }
        if(hpc.getListView()!=null){
            hpc.setListView(list);
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
            paymentType="Credit Card";
        }
        if(!creditCard.isSelected()){
            creditCardNumber.setVisible(false);
            creditCardNumberTextField.setVisible(false);
            creditCardSecurityNumber.setVisible(false);
            creditCardSecurityNumberTextField.setVisible(false);
        }
    }
    //pick-up or delivery radio buttons selected
    @FXML
    protected void onProductRetrievalSelected(ActionEvent actionEvent){
        if(pickUp.isSelected()){
            delivery.setSelected(false);
            productRetrieval="Pick-up";
        }else if(delivery.isSelected()){
            pickUp.setSelected(false);
            productRetrieval="Delivery";
        }
    }
    @FXML
    //on confirm button click
    protected void onConfirmButtonClick(ActionEvent actionEvent){
        if(customers ==null&&!phoneNumberTextField.getText().equals("")&&!passwordTextField.getText().equals("")&&!firstNameTextField.getText().equals("")&&!paymentType.equals("")&&!productRetrieval.equals("")) {
            customers = new ArrayList<>();
            customers.add(new Customer(phoneNumberTextField.getText(), passwordTextField.getText(), firstNameTextField.getText(), lastNameTextField.getText(), streetAddressTextField.getText(), stateTextField.getText(), cityTextField.getText(), zipCodeTextField.getText(), creditCardNumberTextField.getText(), creditCardSecurityNumberTextField.getText(),paymentType,productRetrieval));
            accountSuccess.setVisible(true);
        }else if(!phoneNumberTextField.getText().equals("")&&!passwordTextField.getText().equals("")&&!firstNameTextField.getText().equals("")&&!paymentType.equals("")&&!productRetrieval.equals("")){
            customers.add(new Customer(phoneNumberTextField.getText(), passwordTextField.getText(), firstNameTextField.getText(), lastNameTextField.getText(), streetAddressTextField.getText(), stateTextField.getText(), cityTextField.getText(), zipCodeTextField.getText(), creditCardNumberTextField.getText(), creditCardSecurityNumberTextField.getText(),paymentType,productRetrieval));
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
            paymentType="Cash";
        }else if(check.isSelected()){
            cash.setSelected(false);
            creditCard.setSelected(false);
            creditCardNumber.setVisible(false);
            creditCardNumberTextField.setVisible(false);
            creditCardSecurityNumber.setVisible(false);
            creditCardSecurityNumberTextField.setVisible(false);
            paymentType="Check";
        }
    }
    //algorithms
    //getter for arraylist
    public ArrayList<Customer> getCustomers(){return customers;}

    //setter for listview
    public void setListView(ListView<String> order){
        if(list==null){
            list = new ListView<>();
        }else if(order!=null){
            list.getItems().addAll(order.getItems());
        }

    }
    //setCustomers
    public void setCustomers(ArrayList<Customer> customersList){
        if(customers==null) {
            customers = customersList;
        }
    }
}