package com.example.momandpopspizzeria.Controllers;

import com.example.momandpopspizzeria.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

import java.io.IOException;

//this class is going to store all the functionality of the base ordering system
public class orderMenuController {
    //attributes
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button home;
    @FXML
    private Label menu;
    @FXML
    private Button pizzas;
    @FXML
    private Button sides;
    @FXML
    private Button drinks;
    @FXML
    private ListView<String> order;
    @FXML
    private Button clear;
    @FXML
    private Pane child;

    //events
    //onPizzaButton
    @FXML
    protected void onPizzasButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("customizationPage1.fxml"));
        root = loader.load();
        customization1Controller c1c = loader.getController();
        if(order!=null){
            c1c.setListView(order);
        }

        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }

    //onSidesButton
    @FXML
    protected void onSidesButtonClick(ActionEvent actionEvent) throws IOException{
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("customizationPage3.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }

    //onDrinksButton
    @FXML
    protected void onDrinksButtonClick(ActionEvent actionEvent) throws IOException{
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("customizationPage2.fxml"));
        root = loader.load();
        customization2Controller c2c = loader.getController();
        if(order!=null){
            c2c.setListView(order);
        }
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }

    //OnSubmitButton
    @FXML
    protected void onSubmitButtonClick(ActionEvent actionEvent){}

    //OnHomeButton
    @FXML
    protected void onHomeButtonClick(ActionEvent actionEvent) throws IOException{
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("homePage.fxml"));
        root = loader.load();
        homePageController hpc = loader.getController();
        if(order!=null){
            hpc.setListView(order);
        }
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onClearButtonClick(ActionEvent actionEvent){
        if(!order.getItems().isEmpty()) {
            order.getItems().clear();
        }
    }
    //methods
    //setListView items method for other controllers
    public void setListView(ListView<String> list){
        if(order==null){
            order = new ListView<>();
        }else{
            order.getItems().addAll(list.getItems());
        }
    }
}
