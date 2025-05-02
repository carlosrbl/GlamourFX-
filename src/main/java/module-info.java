module com.example.glamourfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.glamourfx to javafx.fxml;
    exports com.example.glamourfx;
}