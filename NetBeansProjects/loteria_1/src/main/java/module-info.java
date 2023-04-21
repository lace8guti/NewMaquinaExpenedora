module com.mycompany.loteria_1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.loteria_1 to javafx.fxml;
    exports com.mycompany.loteria_1;
}
