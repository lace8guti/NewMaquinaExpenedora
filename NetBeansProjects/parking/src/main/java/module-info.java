module com.mycompany.parking {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.parking to javafx.fxml;
    exports com.mycompany.parking;
}
