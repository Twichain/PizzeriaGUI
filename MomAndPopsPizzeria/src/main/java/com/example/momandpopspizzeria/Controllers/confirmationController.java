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
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

//This class stores the functionalities for the confirmation page
public class confirmationController {
    //Attributes
    private Stage stage;
    private Scene scene;
    private Parent root;
    private ArrayList<Customer> customers;
    private ArrayList<String> orders;

    @FXML
    private ListView<String> order;
    @FXML
    private ListView<String> customerInformation;
    @FXML
    private Label subTotal;
    @FXML
    private Label tax;
    @FXML
    private Label total;
    @FXML
    private Label processed;

    //**EVENTS**//
    //Home Button//
    //Sets up the home page
    @FXML
    protected void onHomeButtonClick(ActionEvent actionEvent) throws IOException {
        processed.setVisible(false);
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
    //Submit Button//
    //Processes the order and clears the forms to allow another order to be processed.
    @FXML
    protected void onSubmitPress(){
        if(orders==null){
            orders = new ArrayList<>();
        }
        processed.setVisible(true);
        orders.add(String.valueOf(order.getItems()));
        order.getItems().clear();
        customerInformation.getItems().clear();
        subTotal.setText("$0");
        tax.setText("$0");
        total.setText("$0");

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
    //Setter for list view
    public void setListView2(ListView<String> list2){
        if(customerInformation==null){
            customerInformation = new ListView<>();
        }else{
            customerInformation.getItems().addAll(list2.getItems());
        }
    }
    //Setter for customers
    public void setCustomers(ArrayList<Customer> customersList){
        if(customers==null) {
            customers = customersList;
        }
    }
    //Setters for labels
    public void setTotals(){
        if(subTotal==null){
            subTotal = new Label();
        }
        if(tax==null){
            tax = new Label();
        }
        if(total==null){
            total = new Label();
        }
        //if and for loop to get the sum from the list view
        if(order!=null){
            double subTotalNum =0;
            for(int i=0; i<order.getItems().size();i++){
                String[] temp=order.getItems().get(i).split("\\$");
                if(temp.length>1){
                    subTotalNum +=Double.parseDouble(temp[1]);
                }
            }
            double taxNum= subTotalNum *0.05;
            double totalNum=subTotalNum+taxNum;
            subTotal.setText("$"+String.format("%.2f",subTotalNum));
            tax.setText("$"+String.format("%.2f",taxNum));
            total.setText("$"+String.format("%.2f",totalNum));

        }
    }
}