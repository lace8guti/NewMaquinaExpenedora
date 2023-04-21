module com.mycompany.endevina_numero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.endevina_numero to javafx.fxml;
    exports com.mycompany.endevina_numero;
}
