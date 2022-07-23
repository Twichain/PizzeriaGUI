package com.example.momandpopspizzeria.Controllers;


import com.example.momandpopspizzeria.ClassObjects.Customer;
import com.example.momandpopspizzeria.HelloApplication;
//import com.example.momandpopspizzeria.storage;
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
import java.util.ArrayList;

//this class stores the functionalities of the home page
public class homePageController {


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
    private ListView<String> orderSummary;
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

    //some getters (shorthands) for specific labels
    public Label getLabel(String name){
        Label label = null;
        switch(name){
            case "name" -> {label= dynamicName;}
            case "pickup" ->{label= dynamicPickup;}
            case "subTotal" ->{label= dynamicSubtotal;}
            case "tax" ->{label= dynamicTax;}
            case "total" ->{label= dynamicTotal;}
        }
        return label;
    }
    public FXMLLoader getController(String name){
        return new FXMLLoader(getClass().getResource(name));
    }

    //setters for private labels
    public void setLabel(String name){
        if(dynamicName==null){
            dynamicName=new Label();
        }
        if(name!=null){
            dynamicName.setText(name);
        }
    }
    //setListView items method for other controllers
    public void setListView(ListView<String> order){
        if(orderSummary==null){
            orderSummary = new ListView<>();
        }else if(order!=null){
            orderSummary.getItems().addAll(order.getItems());
        }

    }
}