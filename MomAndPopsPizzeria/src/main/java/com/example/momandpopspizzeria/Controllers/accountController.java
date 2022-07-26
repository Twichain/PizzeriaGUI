package com.example.momandpopspizzeria.Controllers;

import com.example.momandpopspizzeria.ClassObjects.Customer;
import com.example.momandpopspizzeria.MomAndPopsPizzeria;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.ArrayList;

//This class stores the functionalities for the account page
public class accountController{
    //Attributes
    private Stage stage;
    private Scene scene;
    private Parent root;
    private String productRetrieval;
    private ArrayList<Customer> customers;

    @FXML
    private String paymentType;
    @FXML
    private RadioButton pickUp;
    @FXML
    private RadioButton delivery;
    @FXML
    private TextField phoneNumberTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private TextField streetAddressTextField;
    @FXML
    private TextField stateTextField;
    @FXML
    private TextField cityTextField;
    @FXML
    private TextField zipCodeTextField;
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
    private Label accountSuccess;
    @FXML
    private Label accountFailure;
     @FXML
    private ListView<String> list;

    //**Events**//
    //Home Button Click//
    //Once this button is pressed the page switches to the home page, and sets the homepages' dynamics up.
    @FXML
    protected void onHomeButtonClick(ActionEvent actionEvent) throws IOException{
        FXMLLoader loader = new FXMLLoader(MomAndPopsPizzeria.class.getResource("homePage.fxml"));
        root = loader.load();
        homePageController hpc = loader.getController();
        if(customers!=null){
            hpc.setLabel(customers.get(0).getFirstName());
            hpc.setCustomers(customers);
            hpc.setLabel2(customers.get(0).getProductRetrievalMethod());
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
    //Credit Card Payment Selected//
    //De-selects any of the other buttons if they are selected and shows the fields related to credit card for the user.
    @FXML
    protected void onCreditCardRadioSelected(){
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
    //Pick-up / Delivery Radio Buttons Selected//
    //Sets up a string depending on which radio button is selected out of the group.
    @FXML
    protected void onProductRetrievalSelected(){
        if(pickUp.isSelected()){
            delivery.setSelected(false);
            productRetrieval="Pick-up";
        }else if(delivery.isSelected()){
            pickUp.setSelected(false);
            productRetrieval="Delivery";
        }
    }
    //Confirm Button Click
    //Creates the customer account and stores it.
    @FXML
    protected void onConfirmButtonClick(){
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
    //Radio Button Selection
    //De-selected the other radio button if they are selected and sets the credit card fields to invisible if they are showing.
    @FXML
    protected void onRadioButtonSelected(){
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
    //Algorithms//
    //Getter for arraylist
    public ArrayList<Customer> getCustomers(){return customers;}

    //Setter for listview
    public void setListView(ListView<String> order){
        if(list==null){
            list = new ListView<>();
        }else if(order!=null){
            list.getItems().addAll(order.getItems());
        }

    }
    //Setter for customers
    public void setCustomers(ArrayList<Customer> customersList){
        if(customers==null) {
            customers = customersList;
        }
    }
}