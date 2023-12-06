package com.example.sportshop.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import com.example.sportshop.Model.ProductItem;
import com.example.sportshop.Model.SportFoodItem;
import com.example.sportshop.utils.FormUtil;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ShopController implements Initializable {
    private List<ProductItem> sportInventoryList = new ArrayList<>(Arrays.asList(
            new ProductItem("/com/example/images/itemImg/dumbells.PNG", "Гантели по 8 кг", "Набор гантелей DFC DB001-4 (2шт)", "100" )

    ));

    private List<ProductItem> sportClothList = new ArrayList<>(Arrays.asList(
            new ProductItem("/com/example/images/itemImg/dumbells.PNG", "Беговые кроссовки 44 размера", "Кроссовки adidas", "300" )
    ));

    private List<SportFoodItem> sportPitList = new ArrayList<>(Arrays.asList(
            new SportFoodItem("/com/example/images/itemImg/wheyProtein.PNG", "Сывороточный протеин 90 г", "Whey protein ", "90", "Протеин", "90", "сывороточный протеин", "90, 0, 10")

    ));

    private List <ProductItem> mainProductsList = new ArrayList<>();

    @FXML
    private Button btn_auth;

    @FXML
    private Button btn_cloth;

    @FXML
    private Button btn_inventory;

    @FXML
    private Button btn_problem;

    @FXML
    private Button btn_sportPit;

    @FXML
    private VBox itemList;

    @FXML
    private Label lbl_title;


    @FXML
    void btn_authOnClicked(MouseEvent event)throws IOException  {
        FormUtil.loadAndHide(btn_auth,"/com/example/sportshop/author.fxml","Информация об авторе");


    }

    @FXML
    void btn_clothOnClicked(MouseEvent event) {
        lbl_title.setText("Одежда");
        mainProductsList.clear();
        mainProductsList.addAll(sportClothList);
        loadListItems();
    }

    @FXML
    void btn_inventoryOnClicked(MouseEvent event) {
        lbl_title.setText("Инвентарь");
        mainProductsList.clear();
        mainProductsList.addAll(sportInventoryList);
        loadListItems();
    }

    @FXML
    void btn_problemOnClicked(MouseEvent event) throws IOException {
        FormUtil.loadAndHide(btn_problem,"/com/example/sportshop/error-form.fxml","Сообщить о проблеме");
    }

    @FXML
    void btn_sportPitOnClicked(MouseEvent event) {
        lbl_title.setText("Спортивное питание");
        mainProductsList.clear();
        mainProductsList.addAll(sportPitList);
        loadListItems();
    }

    private void loadListItems (){
        itemList.getChildren().clear();
        List<ProductItem> productItems = new ArrayList<>(mainProductsList);
        for (int i = 0; i < productItems.size(); i++){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/com/example/sportshop/product-item.fxml"));


            try {
                VBox vBox = fxmlLoader.load();
                ItemController ic = fxmlLoader.getController();
                ic.setData(productItems.get(i));
                itemList.getChildren().add(vBox);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {

       mainProductsList.addAll(sportPitList);
       loadListItems();


    }
}
