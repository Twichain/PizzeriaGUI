package com.example.momandpopspizzeria.Controllers;

import com.example.momandpopspizzeria.ClassObjects.Customer;
import com.example.momandpopspizzeria.MomAndPopsPizzeria;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

//This class is going to store all the functionality of the base ordering system
public class orderMenuController {
    //Attributes
    private Stage stage;
    private Scene scene;
    private Parent root;
    private ArrayList<Customer> customers;

    @FXML
    private ListView<String> order;

    //**Events**//
    //Pizza Button//
    //Sets up the pizza customization page
    @FXML
    protected void onPizzasButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(MomAndPopsPizzeria.class.getResource("customizationPage1.fxml"));
        root = loader.load();
        customization1Controller c1c = loader.getController();
        if(order!=null){
            c1c.setListView(order);
        }
        if(customers!=null){
            c1c.setCustomers(customers);
        }
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }
    //Sides Button//
    //Sets up the sides' customization page
    @FXML
    protected void onSidesButtonClick(ActionEvent actionEvent) throws IOException{
        FXMLLoader loader = new FXMLLoader(MomAndPopsPizzeria.class.getResource("customizationPage3.fxml"));
        root = loader.load();
        customization3Controller c3c = loader.getController();
        if(order!=null){
            c3c.setListView(order);
        }
        if(customers!=null){
            c3c.setCustomers(customers);
        }
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }
    //Drinks Button//
    //Sets up the drinks' customization page
    @FXML
    protected void onDrinksButtonClick(ActionEvent actionEvent) throws IOException{
        FXMLLoader loader = new FXMLLoader(MomAndPopsPizzeria.class.getResource("customizationPage2.fxml"));
        root = loader.load();
        customization2Controller c2c = loader.getController();
        if(order!=null){
            c2c.setListView(order);
        }
        if(customers!=null){
            c2c.setCustomers(customers);
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
    protected void onHomeButtonClick(ActionEvent actionEvent) throws IOException{
        FXMLLoader loader = new FXMLLoader(MomAndPopsPizzeria.class.getResource("homePage.fxml"));
        root = loader.load();
        homePageController hpc = loader.getController();
        if(order!=null){
            hpc.setListView(order);
        }
        if(customers!=null){
            hpc.setLabel(customers.get(0).getFirstName());
            hpc.setCustomers(customers);
            hpc.setLabel2(customers.get(0).getProductRetrievalMethod());
        }
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }
    //Clears the order
    @FXML
    protected void onClearButtonClick(){
        if(!order.getItems().isEmpty()) {
            order.getItems().clear();
        }
    }
    //Algorithms//
    //Setter for list view
    public void setListView(ListView<String> list){
        if(order==null){
            order = new ListView<>();
        }else{
            order.getItems().addAll(list.getItems());
        }
    }
    //Setter for customers
    public void setCustomers(ArrayList<Customer> customersList){
        if(customers==null) {
            customers = customersList;
        }
    }
}
