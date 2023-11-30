module com.mycompany.iniciosesionjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.iniciosesionjavafx to javafx.fxml;
    exports com.mycompany.iniciosesionjavafx;
}
