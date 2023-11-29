package com.example.sportshop.Controllers;

import com.example.sportshop.Model.ProductItem;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ItemController {



    @FXML
    private ImageView img_item;

    @FXML
    private Label lbl_description;

    @FXML
    private Label lbl_name;

    @FXML
    private Label lbl_price;

    public void setData (ProductItem productItem){
        Image imgItem = new Image(getClass().getResourceAsStream(productItem.getImg()));
        img_item.setImage(imgItem);

        lbl_name.setText(productItem.getName());

        lbl_description.setText(productItem.getDescription());

        lbl_price.setText(productItem.getPrice());

    }


}
