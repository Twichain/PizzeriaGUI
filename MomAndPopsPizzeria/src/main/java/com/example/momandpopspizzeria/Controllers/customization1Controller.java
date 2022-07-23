package com.example.momandpopspizzeria.Controllers;

import com.example.momandpopspizzeria.ClassObjects.Crusts;
import com.example.momandpopspizzeria.ClassObjects.Sizes;
import com.example.momandpopspizzeria.ClassObjects.Toppings;
import com.example.momandpopspizzeria.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//this stores all the functionalities of the pizza customization page
public class customization1Controller {
    //attributes
    private Stage stage;
    private Scene scene;
    private Parent root;
    private static double x=.50;
    private static ArrayList<Sizes> sizes = new ArrayList<>(List.of(new Sizes("Extra Large",10),new Sizes("Large",8),new Sizes("Medium",6),new Sizes("Small",4)));
    private static ArrayList<Crusts> crusts = new ArrayList<>(List.of(new Crusts(" -Thin Crust",1),new Crusts(" -Regular Crust",0),new Crusts(" -Pan Crust",2)));
    private static ArrayList<Toppings> toppings = new ArrayList<>(List.of(
            new Toppings("    -Cheese",x),new Toppings("    -Pepperoni",x),new Toppings("    -Sausage",x),
            new Toppings("    -Ham",x),new Toppings("    -Green Pepper",x),new Toppings("    -Onion",x),
            new Toppings("    -Tomato",x),new Toppings("    -Mushroom",x), new Toppings("    -Pineapple",x))
            );


    @FXML
    private Button extraLarge;
    @FXML
    private Button large;
    @FXML
    private Button medium;
    @FXML
    private Button small;
    @FXML
    private Button thinCrust;
    @FXML
    private Button regularCrust;
    @FXML
    private Button panCrust;
    @FXML
    private Button cheese;
    @FXML
    private Button pepperoni;
    @FXML
    private Button sausage;
    @FXML
    private Button ham;
    @FXML
    private Button greenPepper;
    @FXML
    private Button onion;
    @FXML
    private Button tomato;
    @FXML
    private Button mushroom;
    @FXML
    private Button pineapple;
    @FXML
    private Button home;
    @FXML
    private ListView<String> list;
    @FXML
    private Button home2;
    @FXML
    private ListView<String> list2;
    @FXML
    private Button home3;
    @FXML
    private ListView<String> list3;
    @FXML
    private Tab pizzaSizes;
    @FXML
    private Tab pizzaCrust;
    @FXML
    private Tab pizzaToppings;


    //**EVENTS**//
    //Button presses for tab 1//
    //Extra Large
    @FXML
    protected void onExtraLargePress(ActionEvent actionEvent){
        list.getItems().add(sizes.get(0).getSize()+"    +$"+sizes.get(0).getPrice());
        extraLarge.setDisable(true);
        large.setDisable(true);
        medium.setDisable(true);
        small.setDisable(true);
    }
    //Large
    @FXML
    protected void onLargePress(ActionEvent actionEvent){
        list.getItems().add(sizes.get(1).getSize()+"    +$"+sizes.get(1).getPrice());
        extraLarge.setDisable(true);
        large.setDisable(true);
        medium.setDisable(true);
        small.setDisable(true);
    }
    //Medium
    @FXML
    protected void onMediumPress(ActionEvent actionEvent){
        list.getItems().add(sizes.get(2).getSize()+"    +$"+sizes.get(2).getPrice());
        extraLarge.setDisable(true);
        large.setDisable(true);
        medium.setDisable(true);
        small.setDisable(true);
    }
    //Small
    @FXML
    protected void onSmallPress(ActionEvent actionEvent){
        list.getItems().add(sizes.get(3).getSize()+"    +$"+sizes.get(3).getPrice());
        extraLarge.setDisable(true);
        large.setDisable(true);
        medium.setDisable(true);
        small.setDisable(true);
    }

    //Button presses for tab 2//
    //Thin Crust
    @FXML
    protected void onThinCrustPress(ActionEvent actionEvent){
        list2.getItems().add(crusts.get(0).getCrust()+"    +$"+crusts.get(0).getPrice());
        thinCrust.setDisable(true);
        regularCrust.setDisable(true);
        panCrust.setDisable(true);
    }
    //Regular Crust
    @FXML
    protected void onRegularCrustPress(ActionEvent actionEvent){
        list2.getItems().add(crusts.get(1).getCrust()+"    +$"+crusts.get(1).getPrice());
        thinCrust.setDisable(true);
        regularCrust.setDisable(true);
        panCrust.setDisable(true);

    }
    //Pan Crust
    @FXML
    protected void onPanCrustPress(ActionEvent actionEvent){
        list2.getItems().add(crusts.get(2).getCrust()+"    +$"+crusts.get(2).getPrice());
        thinCrust.setDisable(true);
        regularCrust.setDisable(true);
        panCrust.setDisable(true);
    }

    //Button presses for tab 3//
    //Cheese
    @FXML
    protected void onCheesePress(ActionEvent actionEvent){list3.getItems().add(toppings.get(0).getTopping()+"    +$"+toppings.get(0).getPrice());}
    //Pepperoni
    @FXML
    protected void onPepperoniPress(ActionEvent actionEvent){list3.getItems().add(toppings.get(1).getTopping()+"    +$"+toppings.get(1).getPrice());}
    //Sausage
    @FXML
    protected void onSausagePress(ActionEvent actionEvent){list3.getItems().add(toppings.get(2).getTopping()+"    +$"+toppings.get(2).getPrice());}
    //Ham
    @FXML
    protected void onHamPress(ActionEvent actionEvent){list3.getItems().add(toppings.get(3).getTopping()+"    +$"+toppings.get(3).getPrice());}
    //Green Pepper
    @FXML
    protected void onGreenPepperPress(ActionEvent actionEvent){list3.getItems().add(toppings.get(4).getTopping()+"    +$"+toppings.get(4).getPrice());}
    //Onion
    @FXML
    protected void onOnionPress(ActionEvent actionEvent){list3.getItems().add(toppings.get(5).getTopping()+"    +$"+toppings.get(5).getPrice());}
    //Tomato
    @FXML
    protected void onTomatoPress(ActionEvent actionEvent){list3.getItems().add(toppings.get(6).getTopping()+"    +$"+toppings.get(6).getPrice());}
    //Mushroom
    @FXML
    protected void onMushroomPress(ActionEvent actionEvent){list3.getItems().add(toppings.get(7).getTopping()+"    +$"+toppings.get(7).getPrice());}
    //Pineapple
    @FXML
    protected void onPineapplePress(ActionEvent actionEvent){list3.getItems().add(toppings.get(8).getTopping()+"    +$"+toppings.get(8).getPrice());}
    //Home
    @FXML
    protected void onHomePress(ActionEvent actionEvent) throws IOException{
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("orderMenuPage.fxml"));
        root = loader.load();
        orderMenuController omc = loader.getController();
        if(list!=null){
            omc.setListView(list);
        }
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }

    //tab switching
    @FXML
    protected void onTab1Switch(){
        if(list!=null && list2!=null && list3!=null){
            list2.setItems(list.getItems());
            list3.setItems(list.getItems());
        }
    }
    @FXML
    protected void onTab2Switch(){
        if(list2!=null){
            list.setItems(list2.getItems());
            list3.setItems(list2.getItems());
        }
    }
    @FXML
    protected void onTab3Switch(){
        if(list3!=null){
            list.setItems(list3.getItems());
            list2.setItems(list3.getItems());

        }
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
}
