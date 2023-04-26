module com.mycompany.projectecaixerautomlucas {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.projectecaixerautomlucas to javafx.fxml;
    exports com.mycompany.projectecaixerautomlucas;
}
