package com.example.sportshop.utils;

import com.example.sportshop.Controllers.ItemController;
import com.example.sportshop.Controllers.ProductDetailsController;
import com.example.sportshop.Model.ProductItem;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

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
    public static void loadProductDetails (Button btn, String title, ProductItem productItem) throws IOException {
        Stage oldStage = (Stage) btn.getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(ProductDetailsController.class.getResource("/com/example/sportshop/Controllers/ProductDetailsController.java"));
        Scene scene = new Scene(fxmlLoader.load());
        ((ProductDetailsController) fxmlLoader.getController()).setData(productItem);

        Stage stage = new Stage();
        stage.setWidth(oldStage.getWidth());
        stage.setHeight(oldStage.getHeight());
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();



    }


}
