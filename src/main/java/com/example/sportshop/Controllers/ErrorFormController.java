package com.example.sportshop.Controllers;

import com.example.sportshop.utils.FormUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;


import java.io.IOException;


public class ErrorFormController {
    @FXML
    private Button btn_cancel;

    @FXML
    private TextArea inpt_message;

    @FXML
    private TextField inpt_email;

    public String a = "ewfrwef";
    @FXML
    private Button btn_submit;

    @FXML
    void btn_cancelOnClicked(MouseEvent event) throws IOException {
        FormUtil.loadAndHide(btn_cancel, "/com/example/sportshop/shop.fxml", "Sport Shop");
    }

    @FXML
    void btn_submitOnClicked(MouseEvent event) throws IOException {
        if (!inpt_email.getText().isEmpty() && !inpt_message.getText().isEmpty()) {

            if (inpt_email.getText().matches("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$")) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);

                alert.setTitle("Informații");
                alert.setHeaderText(null);
                alert.setContentText("Mesaj trimis");

                alert.showAndWait();
                FormUtil.loadAndHide(btn_submit, "/com/example/sportshop/shop.fxml", "Sport Shop");
            }
            else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);

                alert.setTitle("Informații");
                alert.setHeaderText(null);
                alert.setContentText("E-mail incorect");
                alert.showAndWait();
            }


        }
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Informații");
            alert.setHeaderText(null);
            alert.setContentText("Nu sunt completate toate câmpurile");
            alert.showAndWait();
        }


    }
}
