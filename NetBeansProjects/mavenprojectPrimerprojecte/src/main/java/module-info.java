module com.mycompany.mavenprojectprimerprojecte {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.mavenprojectprimerprojecte to javafx.fxml;
    exports com.mycompany.mavenprojectprimerprojecte;
}
