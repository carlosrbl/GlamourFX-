module com.example.glamourfx
{
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.glamourfx to javafx.fxml;
    exports com.example.glamourfx.controllers;
    opens com.example.glamourfx.controllers to javafx.fxml;
    exports com.example.glamourfx.main;
    opens com.example.glamourfx.main to javafx.fxml;
}
