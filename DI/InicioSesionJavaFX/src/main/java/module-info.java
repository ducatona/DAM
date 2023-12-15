    module com.mycompany.iniciosesionjavafx {
    requires javafx.controls;
    requires javafx.fxml;    
    requires java.persistence;
    requires javafx.graphics;
    requires java.logging;
    
    requires org.hibernate.orm.core;
    requires java.sql;
    requires java.base;
    opens main;
    opens modelo;
    opens metodos;
    opens controladores ;
    exports controladores;
}
