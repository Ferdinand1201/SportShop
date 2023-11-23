module com.example.sportshop {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.sportshop to javafx.fxml;
    exports com.example.sportshop;
    exports com.example.sportshop.Controllers;
    opens com.example.sportshop.Controllers to javafx.fxml;
}