    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.iniciosesionjavafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
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
        
        Validaciones v = new Validaciones();
        
        v.validarUser(txtInicioSesion);
        
        
    }
    
}
