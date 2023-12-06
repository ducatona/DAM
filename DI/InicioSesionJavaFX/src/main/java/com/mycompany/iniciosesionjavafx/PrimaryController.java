/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iniciosesionjavafx;

import consultasBBDD.Login;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

/**
 *
 * @author apena
 */
public class PrimaryController {

    @FXML
    private Button btnInicioSesion;
    @FXML
    private Button btnRegistrarse;
    @FXML
    private StackPane containerForm;

    @FXML
    private void ClickInicioSesion(ActionEvent event)  {
        
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
