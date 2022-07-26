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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

//This class stores the functionalities for the login/signup pages
public class loginController {
    //Attributes
    private Stage stage;
    private Scene scene;
    private Parent root;
    private ArrayList<Customer> customers;

    @FXML
    private TextField phoneNumber;
    @FXML
    private ListView<String> list;
    @FXML
    private Label error;
    @FXML
    private Label success;


    //**EVENTS**//
    //Log-in Button//
    //Checks to see if the user is registered with the system
    @FXML
    protected void onLoginPress() {
        if(customers!=null && customers.get(0).getPhoneNumber().equals(phoneNumber.getText())){
            success.setVisible(true);
        }else{
            error.setVisible(true);
        }
    }
    //Sign-Up Button//
    //Sets up the account information page
    @FXML
    protected void onSignUpPress(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(MomAndPopsPizzeria.class.getResource("accountPage.fxml"));
        root = loader.load();
        accountController ac = loader.getController();
        if(list!=null){
            ac.setListView(list);
        }
        if(customers!=null){
            ac.setCustomers(customers);
        }
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }

    //Home Button//
    //Sets up the home page
    @FXML
    protected void onHomePress(ActionEvent actionEvent) throws IOException{
        FXMLLoader loader = new FXMLLoader(MomAndPopsPizzeria.class.getResource("homePage.fxml"));
        root = loader.load();
        homePageController hpc = loader.getController();
        if(list!=null){
            hpc.setListView(list);
        }
        if(customers!=null){
            hpc.setCustomers(customers);
            hpc.setLabel2(customers.get(0).getProductRetrievalMethod());
            hpc.setLabel(customers.get(0).getFirstName());
        }
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }
    //Setter for list view
    public void setListView(ListView<String> order){
        if(list==null){
            list = new ListView<>();
        }else if(order!=null){
            list.getItems().addAll(order.getItems());
        }
    }
}