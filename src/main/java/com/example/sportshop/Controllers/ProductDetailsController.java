package com.example.sportshop.Controllers;
import com.example.sportshop.Model.ProductItem;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
public class ProductDetailsController {

    @FXML
    private HBox pn_details;


    public void setData(ProductItem productItem){
        System.out.println(productItem);

    }

}
