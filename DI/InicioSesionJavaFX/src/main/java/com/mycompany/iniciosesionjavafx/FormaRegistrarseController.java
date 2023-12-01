/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.iniciosesionjavafx;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
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
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import metodos.Validaciones;
import modelo.Nacionalidad;

/**
 * FXML Controller class
 *
 * @author apena
 */
public class FormaRegistrarseController implements Initializable {

    @FXML
    public VBox panelRegistrarse;
    @FXML
    public TextField txtCorreoElectronico;
    @FXML
    public TextField txtUsuarioR;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<Nacionalidad> lista = null;
        Validaciones.rellenarCBX(comboBox, lista);
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

    @FXML
    private void clickRegistrar(ActionEvent event) {

        Validaciones v = new Validaciones();
        v.validarEmail(txtCorreoElectronico);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_InicioSesionJavaFX_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        v.InsertarRegistro(em);

    }

}
