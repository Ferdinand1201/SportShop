package com.example.sportshop.Controllers;

import com.example.sportshop.utils.FormUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;


public class ErrorFormController {
    @FXML
    private Button btn_cancel;

    @FXML
    private Button btn_submit;

    @FXML
    void btn_cancelOnClicked(MouseEvent event) throws IOException {
        FormUtil.loadAndHide(btn_cancel,"/com/example/sportshop/shop.fxml","Спортивный магазин");
    }

    @FXML
    void btn_submitOnClicked(MouseEvent event) throws IOException {
        FormUtil.loadAndHide(btn_submit,"/com/example/sportshop/shop.fxml","Спортивный магазин");
    }

}
