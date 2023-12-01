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
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import javafx.fxml.FXML;


import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
/**
 * FXML Controller class
 *
 * @author apena
 */
public class FormaRegistrarseController implements Initializable {


    @FXML
    private VBox panelRegistrarse;
    @FXML
    private TextField txtCorreoElectronico;
    @FXML
    private TextField txtUsuarioR;
    @FXML
    private TextField txtContraseña;
    @FXML
    private TextField txtConfirmacionContraseña;
    @FXML
    private Button btnRegistrar;
    @FXML
    private Button btnVolver;
    @FXML
    private Button btnLimpiarRegistro;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    
        
        
        txtUsuarioR.setText("");
        txtCorreoElectronico.setText("");
        txtContraseña.setText("");
        txtConfirmacionContraseña.setText("");
    
    }

}
