

package com.example.sportshop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SportShopApp extends Application {
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SportShopApp.class.getResource("shop.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1050, 640);
            stage.setTitle("Magazin de sport");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }


    public static void main(String[] args) {
        launch();
    }
}