package com.example.momandpopspizzeria.Controllers;

import com.example.momandpopspizzeria.ClassObjects.Crusts;
import com.example.momandpopspizzeria.ClassObjects.Customer;
import com.example.momandpopspizzeria.ClassObjects.Sizes;
import com.example.momandpopspizzeria.ClassObjects.Toppings;
import com.example.momandpopspizzeria.MomAndPopsPizzeria;
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

//This stores all the functionalities of the pizza customization page
public class customization1Controller {
    //Attributes
    private Stage stage;
    private Scene scene;
    private Parent root;
    private ArrayList<Customer> customers;
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
    private ListView<String> list;
    @FXML
    private ListView<String> list2;
    @FXML
    private ListView<String> list3;

    //**EVENTS**//
    //Button presses for tab 1//
    //Adds the name and cost for the pizza sizes
    //Extra Large//
    @FXML
    protected void onExtraLargePress(){
        list.getItems().add(sizes.get(0).getSize()+"    +$"+sizes.get(0).getPrice());
        extraLarge.setDisable(true);
        large.setDisable(true);
        medium.setDisable(true);
        small.setDisable(true);
    }
    //Large//
    @FXML
    protected void onLargePress(){
        list.getItems().add(sizes.get(1).getSize()+"    +$"+sizes.get(1).getPrice());
        extraLarge.setDisable(true);
        large.setDisable(true);
        medium.setDisable(true);
        small.setDisable(true);
    }
    //Medium//
    @FXML
    protected void onMediumPress(){
        list.getItems().add(sizes.get(2).getSize()+"    +$"+sizes.get(2).getPrice());
        extraLarge.setDisable(true);
        large.setDisable(true);
        medium.setDisable(true);
        small.setDisable(true);
    }
    //Small//
    @FXML
    protected void onSmallPress(){
        list.getItems().add(sizes.get(3).getSize()+"    +$"+sizes.get(3).getPrice());
        extraLarge.setDisable(true);
        large.setDisable(true);
        medium.setDisable(true);
        small.setDisable(true);
    }

    //Button presses for tab 2//
    //Adds the name and cost for the pizza crusts
    //Thin Crust//
    @FXML
    protected void onThinCrustPress(){
        list2.getItems().add(crusts.get(0).getCrust()+"    +$"+crusts.get(0).getPrice());
        thinCrust.setDisable(true);
        regularCrust.setDisable(true);
        panCrust.setDisable(true);
    }
    //Regular Crust//
    @FXML
    protected void onRegularCrustPress(){
        list2.getItems().add(crusts.get(1).getCrust()+"    +$"+crusts.get(1).getPrice());
        thinCrust.setDisable(true);
        regularCrust.setDisable(true);
        panCrust.setDisable(true);

    }
    //Pan Crust//
    @FXML
    protected void onPanCrustPress(){
        list2.getItems().add(crusts.get(2).getCrust()+"    +$"+crusts.get(2).getPrice());
        thinCrust.setDisable(true);
        regularCrust.setDisable(true);
        panCrust.setDisable(true);
    }

    //Button presses for tab 3//
    //Adds the name and cost for the pizza toppings
    //Cheese//
    @FXML
    protected void onCheesePress(){list3.getItems().add(toppings.get(0).getTopping()+"    +$"+toppings.get(0).getPrice());}
    //Pepperoni//
    @FXML
    protected void onPepperoniPress(){list3.getItems().add(toppings.get(1).getTopping()+"    +$"+toppings.get(1).getPrice());}
    //Sausage//
    @FXML
    protected void onSausagePress(){list3.getItems().add(toppings.get(2).getTopping()+"    +$"+toppings.get(2).getPrice());}
    //Ham//
    @FXML
    protected void onHamPress(){list3.getItems().add(toppings.get(3).getTopping()+"    +$"+toppings.get(3).getPrice());}
    //Green Pepper//
    @FXML
    protected void onGreenPepperPress(){list3.getItems().add(toppings.get(4).getTopping()+"    +$"+toppings.get(4).getPrice());}
    //Onion//
    @FXML
    protected void onOnionPress(){list3.getItems().add(toppings.get(5).getTopping()+"    +$"+toppings.get(5).getPrice());}
    //Tomato//
    @FXML
    protected void onTomatoPress(){list3.getItems().add(toppings.get(6).getTopping()+"    +$"+toppings.get(6).getPrice());}
    //Mushroom//
    @FXML
    protected void onMushroomPress(){list3.getItems().add(toppings.get(7).getTopping()+"    +$"+toppings.get(7).getPrice());}
    //Pineapple//
    @FXML
    protected void onPineapplePress(){list3.getItems().add(toppings.get(8).getTopping()+"    +$"+toppings.get(8).getPrice());}
    //Home//
    //Sets up the home page
    @FXML
    protected void onHomePress(ActionEvent actionEvent) throws IOException{
        FXMLLoader loader = new FXMLLoader(MomAndPopsPizzeria.class.getResource("orderMenuPage.fxml"));
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
    //Tab Switching//
    //transfers list views in-between tabs
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
    //Algorithms//
    //Setter for list view
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
