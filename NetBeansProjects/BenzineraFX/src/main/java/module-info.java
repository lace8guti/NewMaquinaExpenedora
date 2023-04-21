module com.mycompany.benzinerafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.benzinerafx to javafx.fxml;
    exports com.mycompany.benzinerafx;
}
