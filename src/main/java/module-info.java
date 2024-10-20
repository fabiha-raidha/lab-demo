module oop.lab {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.lab to javafx.fxml;
    exports oop.lab;
}