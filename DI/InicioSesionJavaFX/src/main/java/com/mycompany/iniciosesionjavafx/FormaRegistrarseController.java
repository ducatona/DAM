package com.mycompany.iniciosesionjavafx;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import metodos.Validaciones;
import modelo.Nacionalidad;
import static org.hibernate.criterion.Projections.alias;
import consultasBBDD.RegistrarUsuarios;
import java.util.List;
import modelo.Perfil;

public class FormaRegistrarseController implements Initializable {

    @FXML
    public VBox panelRegistrarse;
    @FXML
    public TextField txtCorreoElectronico;

    @FXML
    public TextField txtContraseña;
    @FXML
    public TextField txtConfirmacionContraseña;
    @FXML
    public Button btnRegistrar;
    @FXML
    public Button btnVolver;
    @FXML
    public Button btnLimpiarRegistro;
    @FXML
    public ComboBox<String> comboBox;
    @FXML
    public TextField txtAliasR;
    @FXML
    public TextField txtNombre;
    @FXML
    public TextField txtApellidos;
    @FXML
    private DatePicker fecha;
    @FXML
    public ComboBox<?> ComboBox2;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Validaciones.rellenarCBX(comboBox, "Nacionalidad.findAllNacionalidad");
        Validaciones.rellenarCBX((ComboBox<String>) ComboBox2, "Perfil.findAllPerfil");

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
    private void clickLimpiarR(ActionEvent event) {

        txtAliasR.setText("");
        txtCorreoElectronico.setText("");
        txtContraseña.setText("");
        txtConfirmacionContraseña.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");

    }

    @FXML
    private void clickRegistrar(ActionEvent event) {
        Validaciones v = new Validaciones();
        RegistrarUsuarios ru = new RegistrarUsuarios();
        int seleccion = v.obtenerPosicionSeleccion(comboBox);
        int seleccion1 = v.obtenerPosicionSeleccion((ComboBox<String>) ComboBox2);

        if (v.comprobarFormularioBlanco(txtAliasR, txtContraseña, txtConfirmacionContraseña, txtCorreoElectronico, txtNombre, txtApellidos)) {
            if (v.comprobarformulario(txtAliasR, txtCorreoElectronico, txtContraseña, txtConfirmacionContraseña)) {
                try {

                    ru.InsertarUsuario(txtNombre.getText(), txtApellidos.getText(), fecha.getValue(), txtAliasR.getText(), txtContraseña.getText(), txtCorreoElectronico.getText(),
                            seleccion, seleccion1);

                    App.setRoot("FormaInicioSesion");
                } catch (IOException ex) {
                    Logger.getLogger(FormaRegistrarseController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
