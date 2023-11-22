module com.mycompany.primerproyectojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.primerproyectojavafx to javafx.fxml;
    exports com.mycompany.primerproyectojavafx;
}
