module com.benja.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.benja.controlador to javafx.fxml;
    exports com.benja.controlador;
}