module com.example.unidad8_ejerciciolayouts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.unidad8_ejerciciolayouts to javafx.fxml;
    exports com.example.unidad8_ejerciciolayouts;
}