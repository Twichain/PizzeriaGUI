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
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

//this class stores the functionalities for the confirmation page
public class confirmationController {
    //attributes
    private Stage stage;
    private Scene scene;
    private Parent root;
    private ArrayList<Customer> customers;

    @FXML
    private Button home;
    @FXML
    private Button submit;
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

    //**EVENTS**//
    //home button
    @FXML
    protected void onHomeButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("homePage.fxml"));
        root = loader.load();
        homePageController hpc = loader.getController();
        if(order!=null){
            hpc.setListView(order);
        }
        if(customers!=null){
            hpc.setLabel(customers.get(0).getFirstName());
            hpc.setCustomers(customers);
        }
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }
    //submit button (idk returns to the home screen with an empty list)
    @FXML
    protected void onSubmitPress(ActionEvent actionEvent){

    }

    //algorithms
    public void setListView(ListView<String> list){
        if(order==null){
            order = new ListView<>();
        }else{
            order.getItems().addAll(list.getItems());
        }
    }
    public void setListView2(ListView<String> list2){
        if(customerInformation==null){
            customerInformation = new ListView<>();
        }else{
            customerInformation.getItems().addAll(list2.getItems());
        }
    }
    //setCustomers
    public void setCustomers(ArrayList<Customer> customersList){
        if(customers==null) {
            customers = customersList;
        }
    }
    //label setters
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
            subTotal.setText("$ "+String.format("%.2f",subTotalNum));
            tax.setText("$ "+String.format("%.2f",taxNum));
            total.setText("$ "+String.format("%.2f",totalNum));

        }
    }
}
