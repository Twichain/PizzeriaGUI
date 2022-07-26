package com.example.momandpopspizzeria.Controllers;


import com.example.momandpopspizzeria.ClassObjects.Customer;
import com.example.momandpopspizzeria.MomAndPopsPizzeria;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

//This class stores the functionalities of the home page
public class homePageController {
    //Attributes//
    private Stage stage;
    private Scene scene;
    private Parent root;
    private ArrayList<Customer> customers;
    @FXML
    private Label dynamicName;

    @FXML
    private Label dynamicPickup;
    @FXML
    private ListView<String> orderSummary;

    //**Events**//
    //Order Button Click//
    //Sets up the menu page
    @FXML
    protected void onOrderButtonClick(ActionEvent actionEvent) throws IOException{
        FXMLLoader loader = new FXMLLoader(MomAndPopsPizzeria.class.getResource("orderMenuPage.fxml"));
        root = loader.load();
        orderMenuController omc = loader.getController();
        if(orderSummary!=null){
            omc.setListView(orderSummary);
        }
        if(customers!=null){
            omc.setCustomers(customers);
        }
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }
    //Account Button//
    //If the customer is logged in go directly to account page
    //else go to login page
    @FXML
    protected void onAccountButtonClick(ActionEvent actionEvent) throws IOException{
        if(customers!=null){
            FXMLLoader loader = new FXMLLoader(MomAndPopsPizzeria.class.getResource("accountPage.fxml"));
            root = loader.load();
            accountController ac = loader.getController();
            if(orderSummary!=null){
                ac.setListView(orderSummary);
            }
            if(customers!=null){
                ac.setCustomers(customers);
            }
        }else{
            FXMLLoader loader = new FXMLLoader(MomAndPopsPizzeria.class.getResource("loginPage.fxml"));
            root = loader.load();
            loginController lc = loader.getController();
            if(orderSummary!=null){
                lc.setListView(orderSummary);
            }
        }
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }
    //Clear Button//
    //Clears the current order
    @FXML
    protected void onClearButtonClick(){
        orderSummary.getItems().clear();
    }
    //Sets up the final page
    @FXML
    protected void onConfirmButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(MomAndPopsPizzeria.class.getResource("confirmationPage.fxml"));
        root = loader.load();
        confirmationController cc = loader.getController();
        //Gets the order information and sets it to the list
        if(orderSummary!=null) {
            cc.setListView(orderSummary);
            cc.setTotals();
        }
        //Gets the customer information and sets it to the list
        if(customers!=null){
            ListView<String> tempList = new ListView<>();
            for(int i=0; i<customers.size() ;i++){
                tempList.getItems().add("Name: "+customers.get(i).getFirstName()+" "+customers.get(i).getLastName());
                tempList.getItems().add("Phone number: "+customers.get(i).getPhoneNumber());
                tempList.getItems().add("Payment Type: "+customers.get(i).getPaymentType());
                tempList.getItems().add("Address: "+customers.get(i).getStreetAddress());
                tempList.getItems().add("             "+customers.get(i).getCity()+", "+customers.get(i).getState()+"  "+customers.get(i).getZipCode());
                tempList.getItems().add("");
                tempList.getItems().add("Product Retrieval Method: "+customers.get(i).getProductRetrievalMethod());
            }

            cc.setCustomers(customers);
            cc.setListView2(tempList);
        }

        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }
    //Algorithms//
    //Setters for private labels
    public void setLabel(String name) {
        if(dynamicName==null) {
            dynamicName=new Label();
        }
        if(name!=null) {
            dynamicName.setText(name);
        }
    }
    public void setLabel2(String name) {
        if(dynamicPickup==null) {
            dynamicPickup=new Label();
        }
        if(name!=null) {
            dynamicPickup.setText(name);
        }
    }
    //Setter for list view
    public void setListView(ListView<String> order) {
        if(orderSummary==null) {
            orderSummary = new ListView<>();
        }else if(order!=null) {
            orderSummary.getItems().addAll(order.getItems());
        }
    }
    //Getter for list view
    public ListView<String> getListView(){return orderSummary;}

    //Setter for customer
    public void setCustomers(ArrayList<Customer> customersList){
        if(customers==null) {
            customers = customersList;
        }
    }
}