package com.example.sportshop.Controllers;

import com.example.sportshop.Model.ProductItem;
import com.example.sportshop.utils.FormUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;

import java.io.IOException;


public class ItemController {



    @FXML
    private ImageView img_item;
    @FXML
    private Button btn_details;

    @FXML
    private Label lbl_description;

    @FXML
    private Label lbl_name;

    @FXML
    private Label lbl_price;

    private ProductItem productItem;



    public void setData (ProductItem productItem){
        this.productItem = productItem;
        Image imgItem = new Image(getClass().getResourceAsStream(productItem.getImg()));

        img_item.setImage(imgItem);

        lbl_name.setText(productItem.getName());

        lbl_description.setText(productItem.getDescription());

        lbl_price.setText(productItem.getPrice());

    }

    @FXML
    void btn_detailsOnClicked(MouseEvent event) throws IOException {

        FormUtil.loadProductDetails(btn_details, "Подробнее", this.productItem);

    }






}
