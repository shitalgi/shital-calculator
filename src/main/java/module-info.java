module com.example.shitalcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shitalcalculator to javafx.fxml;
    exports com.example.shitalcalculator;
}