package com.example.momandpopspizzeria.Controllers;

import com.example.momandpopspizzeria.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import java.io.IOException;

//this class stores the functionalities of the home page
public class homePageController {
    //attributes
    @FXML
    private Button account;
    @FXML
    private Button order;
    @FXML
    private Button clear;
    @FXML
    private Button confirm;
    @FXML
    private Label name;
    @FXML
    private Label dynamicName;
    @FXML
    private Label pickupOrDelivery;
    @FXML
    private Label dynamicPickup;
    @FXML
    private Label subtotal;
    @FXML
    private Label dynamicSubtotal;
    @FXML
    private Label tax;
    @FXML
    private Label dynamicTax;
    @FXML
    private Label total;
    @FXML
    private Label dynamicTotal;
    @FXML
    private Label summary;
    @FXML
    private ImageView icon;
    @FXML
    private ListView<String> orderSummary = new ListView<>();
    @FXML
    private Pane child;

    //events
    @FXML
    protected void onOrderButtonClick(ActionEvent actionEvent){
        child.getChildren().clear();
        child.getChildren().addAll(loadFXML("orderMenuPage.fxml"));
    }
    @FXML
    protected void onAccountButtonClick(ActionEvent actionEvent){
        child.getChildren().clear();
        child.getChildren().addAll(loadFXML("accountPage.fxml"));
    }
    @FXML
    protected void onClearButtonClick(ActionEvent actionEvent){
        orderSummary.getItems().removeAll();
    }
    @FXML
    protected void onConfirmButtonClick(ActionEvent actionEvent){
        child.getChildren().clear();
        child.getChildren().addAll(loadFXML("confirmationPage.fxml"));
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