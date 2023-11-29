package com.example.sportshop.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class FormUtil {
    public static void loadAndHide  (Button btn, String newFormPatch, String title ) throws IOException {
        Stage oldStage = (Stage) btn.getScene().getWindow();
        // do what you have to do
        oldStage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(FormUtil.class.getResource(newFormPatch));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setWidth(oldStage.getWidth());
        stage.setHeight(oldStage.getHeight());
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(title);
        stage.setScene(new Scene(root1));
        stage.show();
    }

}
