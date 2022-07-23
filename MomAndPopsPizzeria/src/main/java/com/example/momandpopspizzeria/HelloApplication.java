package com.example.momandpopspizzeria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("homePage.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add("style.css");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //potentially deprecated
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("homePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1052, 720);
        scene.getStylesheets().add("style.css");
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/
    }

    public static void main(String[] args) {
        launch();
    }
}