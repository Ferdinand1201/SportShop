package com.example.sportshop.Controllers;
import com.example.sportshop.Model.ProductItem;
import com.example.sportshop.Model.SportClothItem;
import com.example.sportshop.Model.SportFoodItem;
import com.example.sportshop.Model.SportInventoryItem;
import com.example.sportshop.utils.FormUtil;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.io.IOException;

public class ProductDetailsController {

    @FXML
    private ImageView img_Description;

    @FXML
    private Label lbl_1par;

    @FXML
    private Label lbl_1parName;

    @FXML
    private Label lbl_2par;

    @FXML
    private Label lbl_2parName;

    @FXML
    private Label lbl_3par;

    @FXML
    private Label lbl_3parName;

    @FXML
    private Label lbl_4par;

    @FXML
    private Label lbl_4parName;

    @FXML
    private Label lbl_Name;

    @FXML
    private Label lbl_Price;

    @FXML
    private TextFlow txt_flow;
    @FXML
    private Text txt_text;
    @FXML
    private Button btn_buy;
    @FXML
    private Button btn_back;
    @FXML
    private Text txt_textFlow;
    @FXML
    private Separator separator;




    public void setData(ProductItem productItem)
    {
        Image imgDetails = new Image(getClass().getResourceAsStream(productItem.getImg()));
        img_Description.setImage(imgDetails);
        lbl_Name.setText(productItem.getName());
        txt_text.setText(productItem.getDescription());
        lbl_Price.setText(productItem.getPrice() + "р");
        if(productItem instanceof SportFoodItem){
            lbl_1parName.setText("Тип продукта:");
            lbl_2parName.setText("Вес продукта:");
            lbl_3parName.setText("Состав продукта:");
            lbl_4parName.setText("БЖУ продукта:");
            lbl_1par.setText(((SportFoodItem) productItem).getType());
            lbl_2par.setText(((SportFoodItem) productItem).getWeight());
            txt_textFlow.setText(((SportFoodItem) productItem).getCompound());
            lbl_4par.setText(((SportFoodItem) productItem).getProtFatCarbs());

        }
        else if(productItem instanceof SportClothItem){
            lbl_1parName.setText("Цвет продукта:");
            lbl_2parName.setText("Размер продукта:");
            lbl_3parName.setText("Тип продукта:");
            lbl_4parName.setText("Материал продукта:");
            lbl_1par.setText(((SportClothItem) productItem).getColor());
            lbl_2par.setText(((SportClothItem) productItem).getSize());
            txt_textFlow.setText(((SportClothItem) productItem).getType());
            lbl_4par.setText(((SportClothItem) productItem).getMaterial());




        }
        else if (productItem instanceof SportInventoryItem){
            lbl_1parName.setText("Тип:");
            lbl_2parName.setText("Вес:");
            lbl_3parName.setText("Материал:");

            lbl_1par.setText(((SportInventoryItem) productItem).getType());
            lbl_2par.setText(((SportInventoryItem) productItem).getWeight());
            txt_textFlow.setText(((SportInventoryItem) productItem).getMaterial());
            separator.setVisible(false);
    }


    }
    @FXML
    void btn_buyOnClicked(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Успех!");
        alert.setHeaderText(null);
        alert.setContentText("Покупка совершена");
        alert.showAndWait();
    }





    }


