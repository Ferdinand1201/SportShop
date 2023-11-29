package com.example.sportshop.Controllers;
import com.example.sportshop.utils.FormUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class AuthorController {
    @FXML
    private Button btn_back;

    @FXML
    void btn_backOnClicked(MouseEvent event) throws IOException {
        FormUtil.loadAndHide(btn_back,"/com/example/sportshop/shop.fxml","Спортивный магазин");

    }

}
