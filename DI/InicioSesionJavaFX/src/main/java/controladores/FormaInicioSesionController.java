package controladores;

import main.App;
import consultasBBDD.Login;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javax.persistence.EntityManager;
import metodos.Validaciones;

public class FormaInicioSesionController implements Initializable {

    @FXML
    private VBox panelInicioSesión;
    @FXML
    private PasswordField txtContraseñaIs;
    @FXML
    private TextField txtContraseñaIsM;
    @FXML
    private CheckBox checkVerContraseña;
    @FXML
    private Button btnLimpiar;
    @FXML
    private Button btnVolver;
    @FXML
    private Button btnEntrar;
    @FXML
    private TextField txtInicioSesion;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Validaciones v = new Validaciones();

        v.mContraseña(txtContraseñaIs, txtContraseñaIsM, checkVerContraseña);

    }

    @FXML
    private void clickLimpiar(ActionEvent event) {

        txtContraseñaIsM.setText("");
        txtInicioSesion.setText("");
    }

    @FXML
    private void clickVolver(ActionEvent event) {
        try {
            App.setRoot("primary");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void clickEntrar(ActionEvent event) {
        String alias = txtInicioSesion.getText();
        String contraseña = txtContraseñaIsM.getText();
        try {
            if (Validaciones.comprobarCampoVacio(txtInicioSesion) && Validaciones.comprobarCampoVacio(txtContraseñaIs)) {
                if (Login.ConsultarContraseña(alias, contraseña)) {
                    System.out.println("Inicio de sesión exitoso");

                    App.setRoot("PantallaInicial");

                } else {
                    System.out.println("Contraseña y alias incorrectos ");

                }

            } else {
                System.out.println("Por favor, complete todos los campos");

            }
        } catch (IOException ex) {
            Logger.getLogger(FormaInicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void CheckContraseña(ActionEvent event) {
    }
}
