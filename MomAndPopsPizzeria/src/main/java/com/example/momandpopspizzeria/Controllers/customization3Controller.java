package com.example.momandpopspizzeria.Controllers;

import com.example.momandpopspizzeria.ClassObjects.Customer;
import com.example.momandpopspizzeria.ClassObjects.Sides;
import com.example.momandpopspizzeria.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class customization3Controller {
    //attributes
    private Stage stage;
    private Scene scene;
    private Parent root;
    private ArrayList<Customer> customers;

    private static ArrayList<Sides> sides=new ArrayList<>(List.of(new Sides("Breadsticks",4),new Sides("Breadstick Bites",2),new Sides("Big Chocolate Chip Cookie",4)));

    @FXML
    private Button breadsticks;
    @FXML
    private Button breadstickBites;
    @FXML
    private Button bigChocolateChipCookie;
    @FXML
    private Button home;
    @FXML
    private ListView<String> list;

    //**EVENTS**//
    //Button presses//
    //Breadsticks
    @FXML
    protected void onBreadSticksPress(ActionEvent actionEvent){list.getItems().add(sides.get(0).getSide()+"    +$"+sides.get(0).getPrice());}
    //Breadstick Bites
    @FXML
    protected void onBreadstickBitesPress(ActionEvent actionEvent){list.getItems().add(sides.get(1).getSide()+"    +$"+sides.get(1).getPrice());}
    //Big Chocolate Chip Cookie
    @FXML
    protected void onBigChocolateChipCookiePress(ActionEvent actionEvent){list.getItems().add(sides.get(2).getSide()+"    +$"+sides.get(2).getPrice());}

    @FXML
    protected void onHomePress(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("orderMenuPage.fxml"));
        root = loader.load();
        orderMenuController omc = loader.getController();
        if(list!=null){
            omc.setListView(list);
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

    //algorithms
    //setListView items method for other controllers
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
