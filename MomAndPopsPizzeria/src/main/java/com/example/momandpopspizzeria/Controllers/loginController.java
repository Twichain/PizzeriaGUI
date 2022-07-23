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
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

//this class stores the functionalities for the login/signup pages
public class loginController {
    //attributes
    private Stage stage;
    private Scene scene;
    private Parent root;
    private ArrayList<Customer> customers;

    @FXML
    private Button login;
    @FXML
    private Button signUp;
    @FXML
    private Button home;
    @FXML
    private TextField phoneNumber;
    @FXML
    private TextField password;
    @FXML
    private ListView<String> list;
    @FXML
    private Label error;
    @FXML
    private Label success;


    //**EVENTS**//
    //Log-in button
    @FXML
    protected void onLoginPress(ActionEvent actionEvent) {
        if(customers!=null && customers.get(0).getPhoneNumber().equals(phoneNumber.getText())){
            success.setVisible(true);
        }else{
            error.setVisible(true);
        }
    }

    //Sign up button
    @FXML
    protected void onSignUpPress(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("accountPage.fxml"));
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

    //Home button
    @FXML
    protected void onHomePress(ActionEvent actionEvent) throws IOException{
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("homePage.fxml"));
        root = loader.load();
        homePageController hpc = loader.getController();
        if(list!=null){
            hpc.setListView(list);
        }
        if(customers!=null){
            hpc.setCustomers(customers);
        }
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }

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