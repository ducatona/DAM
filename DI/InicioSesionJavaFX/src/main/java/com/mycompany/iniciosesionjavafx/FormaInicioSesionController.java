/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.iniciosesionjavafx;

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

/**
 * FXML Controller class
 *
 * @author apena
 */
public class FormaInicioSesionController implements Initializable {

    @FXML
    private VBox panelInicioSesión;
    @FXML
    private TextField txtInicioSesion;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Validaciones v = new Validaciones();

        v.mContraseña(txtContraseñaIs, txtContraseñaIsM, checkVerContraseña);

    }

    @FXML
    private void CheckContraseña(ActionEvent event) {
        /* 
      String contraseña = txtContraseñaIsM.getText();
        
        txtContraseñaIsM.setText(contraseña);
         */
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

        String nombreUsuario = txtInicioSesion.getText();
        String contraseña = txtContraseñaIsM.getText();
        try {
            if (Validaciones.comprobarCampoVacio(txtInicioSesion) && Validaciones.comprobarCampoVacio(txtContraseñaIs)) {

                if (Login.ConsultarContraseña(nombreUsuario, contraseña)) {
                    System.out.println("Inicio de sesión exitoso para el usuario: " + nombreUsuario);
                    // Realiza acciones adicionales después de un inicio de sesión exitoso

                    App.setRoot("PantallaInicial");

                } else {
                    System.out.println("Contraseña y usuario incorrectos ");
                    // Puedes manejar el caso en el que la contraseña no coincide
                }

            } else {
                System.out.println("Por favor, complete todos los campos");
                // Puedes manejar el caso en el que algunos campos están vacíos
            }
        } catch (IOException ex) {
            Logger.getLogger(FormaInicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
