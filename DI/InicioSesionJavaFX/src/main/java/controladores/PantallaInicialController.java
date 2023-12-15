/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controladores;

import main.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author apena
 */
public class PantallaInicialController implements Initializable {

    @FXML
    private BorderPane bp;
    @FXML
    private AnchorPane ap;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void home(MouseEvent event) {
        bp.setCenter(ap);
        loadPage("/vistas/home");
    }

    @FXML
    private void descargas(MouseEvent event) {
        bp.setCenter(ap);
         loadPage("/vistas/descargas");
    }

    @FXML
    private void bilbioteca(MouseEvent event) {
        bp.setCenter(ap);
         loadPage("/vistas/biblioteca");
    }

    @FXML
    private void ajustes(MouseEvent event) {
        bp.setCenter(ap);
         loadPage("/vistas/ajustes");
    }

    @FXML
    private void registrar(MouseEvent event) {
        bp.setCenter(ap);
    }

    @FXML
    private void cerrarsesion(MouseEvent event) {

    }

    private void loadPage(String page) {

        Parent root = null;

        try {

            root = FXMLLoader.load(getClass().getResource(page + ".fxml"));

        } catch (IOException ex) {

            //Logger.getLogger(InicioController.class.getName()).log(Level.SEVERE, null, ex);
        }

        bp.setCenter(root);

    }
}
