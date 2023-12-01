    module com.mycompany.iniciosesionjavafx {
    requires javafx.controls;
    requires javafx.fxml;    
    requires java.persistence;
    requires javafx.graphics;
    requires java.logging;
    
    requires org.hibernate.orm.core;
    requires java.sql;

    opens modelo;
    opens metodos;
    opens com.mycompany.iniciosesionjavafx to javafx.fxml;
    exports com.mycompany.iniciosesionjavafx;
}
