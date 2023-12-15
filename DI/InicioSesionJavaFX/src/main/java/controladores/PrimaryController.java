package controladores;

import main.App;
import consultasBBDD.Login;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class PrimaryController {

    @FXML
    private Button btnInicioSesion;
    @FXML
    private Button btnRegistrarse;
    @FXML
    private StackPane containerForm;

    @FXML
    private void ClickInicioSesion(ActionEvent event) {

        try {
            App.setRoot("FormaInicioSesion");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    private void ClickRegistrarse(ActionEvent event) {

        try {
            App.setRoot("FormaRegistrarse");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
