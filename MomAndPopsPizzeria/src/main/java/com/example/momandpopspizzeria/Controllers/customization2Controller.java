package com.example.momandpopspizzeria.Controllers;

import com.example.momandpopspizzeria.ClassObjects.Beverages;
import com.example.momandpopspizzeria.ClassObjects.Customer;
import com.example.momandpopspizzeria.ClassObjects.Sizes;
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

//Stores all the functionalities of the beverages' customization page
public class customization2Controller {
    //Attributes
    private Stage stage;
    private Scene scene;
    private Parent root;
    private ArrayList<Customer> customers;
    private static ArrayList<Sizes> sizes = new ArrayList<>(List.of(new Sizes("Extra Large",1),new Sizes("Large",1),new Sizes("Medium",1),new Sizes("Small",1),new Sizes("Kids",1)));
    private static ArrayList<Beverages> beverages = new ArrayList<>(List.of(
            new Beverages(" -Pepsi"),new Beverages(" -Diet Pepsi"),new Beverages(" -Sunkist"),new Beverages(" -Diet Sunkist"),
            new Beverages(" -Root Beer"),new Beverages(" -Diet Root Beer"),new Beverages(" -Sierra Mist"),new Beverages(" -Lemonade"))
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
    private Button kids;
    @FXML
    private ListView<String> list;
    @FXML
    private ListView<String> list2;
    @FXML
    private Button pepsi;
    @FXML
    private Button dietPepsi;
    @FXML
    private Button sunkist;
    @FXML
    private Button dietSunkist;
    @FXML
    private Button rootBeer;
    @FXML
    private Button dietRootBeer;
    @FXML
    private Button sierraMist;
    @FXML
    private Button lemonade;

    //**EVENTS**//
    //Button presses for tab 1//
    //Adds the size of the drink to the order
    //Extra Large//
    @FXML
    protected void onExtraLargePress(){
        list.getItems().add(sizes.get(0).getSize()+"    +$"+sizes.get(0).getPrice());
        extraLarge.setDisable(true);
        large.setDisable(true);
        medium.setDisable(true);
        small.setDisable(true);
        kids.setDisable(true);
    }
    //Large//
    @FXML
    protected void onLargePress(){
        list.getItems().add(sizes.get(1).getSize()+"    +$"+sizes.get(1).getPrice());
        extraLarge.setDisable(true);
        large.setDisable(true);
        medium.setDisable(true);
        small.setDisable(true);
        kids.setDisable(true);
    }
    //Medium//
    @FXML
    protected void onMediumPress(){
        list.getItems().add(sizes.get(2).getSize()+"    +$"+sizes.get(2).getPrice());
        extraLarge.setDisable(true);
        large.setDisable(true);
        medium.setDisable(true);
        small.setDisable(true);
        kids.setDisable(true);
    }
    //Small//
    @FXML
    protected void onSmallPress(){
        list.getItems().add(sizes.get(3).getSize()+"    +$"+sizes.get(3).getPrice());
        extraLarge.setDisable(true);
        large.setDisable(true);
        medium.setDisable(true);
        small.setDisable(true);
        kids.setDisable(true);
    }
    //Kids//
    @FXML
    protected void onKidsPress(){
        list.getItems().add(sizes.get(4).getSize()+"    +$"+sizes.get(4).getPrice());
        extraLarge.setDisable(true);
        large.setDisable(true);
        medium.setDisable(true);
        small.setDisable(true);
        kids.setDisable(true);
    }

    //Button presses for tab 2//
    //Pepsi//
    @FXML
    protected void onPepsiPress(){
        list.getItems().add(beverages.get(0).getDrinkName());
        pepsi.setDisable(true);
        dietPepsi.setDisable(true);
        sunkist.setDisable(true);
        dietSunkist.setDisable(true);
        rootBeer.setDisable(true);
        dietRootBeer.setDisable(true);
        sierraMist.setDisable(true);
        lemonade.setDisable(true);
    }
    //DietPepsi//
    @FXML
    protected void onDietPepsiPress(){
        list.getItems().add(beverages.get(1).getDrinkName());
        pepsi.setDisable(true);
        dietPepsi.setDisable(true);
        sunkist.setDisable(true);
        dietSunkist.setDisable(true);
        rootBeer.setDisable(true);
        dietRootBeer.setDisable(true);
        sierraMist.setDisable(true);
        lemonade.setDisable(true);
    }
    //Sunkist//
    @FXML
    protected void onSunkistPress(){
        list.getItems().add(beverages.get(2).getDrinkName());
        pepsi.setDisable(true);
        dietPepsi.setDisable(true);
        sunkist.setDisable(true);
        dietSunkist.setDisable(true);
        rootBeer.setDisable(true);
        dietRootBeer.setDisable(true);
        sierraMist.setDisable(true);
        lemonade.setDisable(true);
    }
    //Diet Sunkist//
    @FXML
    protected void onDietSunkistPress(){
        list.getItems().add(beverages.get(3).getDrinkName());
        pepsi.setDisable(true);
        dietPepsi.setDisable(true);
        sunkist.setDisable(true);
        dietSunkist.setDisable(true);
        rootBeer.setDisable(true);
        dietRootBeer.setDisable(true);
        sierraMist.setDisable(true);
        lemonade.setDisable(true);
    }
    //Root Beer//
    @FXML
    protected void onRootBeerPress(){
        list.getItems().add(beverages.get(4).getDrinkName());
        pepsi.setDisable(true);
        dietPepsi.setDisable(true);
        sunkist.setDisable(true);
        dietSunkist.setDisable(true);
        rootBeer.setDisable(true);
        dietRootBeer.setDisable(true);
        sierraMist.setDisable(true);
        lemonade.setDisable(true);
    }
    //Diet Root Beer//
    @FXML
    protected void onDietRootBeerPress(){
        list.getItems().add(beverages.get(5).getDrinkName());
        pepsi.setDisable(true);
        dietPepsi.setDisable(true);
        sunkist.setDisable(true);
        dietSunkist.setDisable(true);
        rootBeer.setDisable(true);
        dietRootBeer.setDisable(true);
        sierraMist.setDisable(true);
        lemonade.setDisable(true);
    }
    //Sierra Mist//
    @FXML
    protected void onSierraMistPress(){
        list.getItems().add(beverages.get(6).getDrinkName());
        pepsi.setDisable(true);
        dietPepsi.setDisable(true);
        sunkist.setDisable(true);
        dietSunkist.setDisable(true);
        rootBeer.setDisable(true);
        dietRootBeer.setDisable(true);
        sierraMist.setDisable(true);
        lemonade.setDisable(true);
    }
    //Lemonade//
    @FXML
    protected void onLemonadePress(){
        list.getItems().add(beverages.get(7).getDrinkName());
        pepsi.setDisable(true);
        dietPepsi.setDisable(true);
        sunkist.setDisable(true);
        dietSunkist.setDisable(true);
        rootBeer.setDisable(true);
        dietRootBeer.setDisable(true);
        sierraMist.setDisable(true);
        lemonade.setDisable(true);
    }
    //Tab Switching//
    @FXML
    protected void onTab1Switch(){
        if(list!=null && list2!=null){
            list2.setItems(list.getItems());
        }
    }
    @FXML
    protected void onTab2Switch(){
        if(list2!=null){
            list.setItems(list2.getItems());
        }
    }
    //Sets up the home page
    @FXML
    protected void onHomePress(ActionEvent actionEvent) throws IOException {
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

    //Algorithms//
    //Setter for the list view
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
