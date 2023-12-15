package controladores;

import main.App;
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
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import modelo.Perfil;
import modelo.Usuarios;

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

        int seleccion = v.obtenerPosicionSeleccion(comboBox);
        int seleccion1 = v.obtenerPosicionSeleccion((ComboBox<String>) ComboBox2);

        if (v.comprobarFormularioBlanco(txtAliasR, txtContraseña, txtConfirmacionContraseña, txtCorreoElectronico, txtNombre, txtApellidos)) {
            if (v.comprobarformulario(txtAliasR, txtCorreoElectronico, txtContraseña, txtConfirmacionContraseña)) {
                try {

                    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_InicioSesionJavaFX_jar_1.0-SNAPSHOTPU");
                    EntityManager em = emf.createEntityManager();

                    try {
                        Usuarios u = new Usuarios();
                        u.setNombre(txtNombre.getText());
                        u.setApellidos(txtApellidos.getText());
                        u.setFechaNac(Date.from(fecha.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant()));
                        u.setAlias(txtAliasR.getText());
                        u.setPassword(txtContraseña.getText());
                        u.setEmail(txtCorreoElectronico.getText());

                        em.getTransaction().begin();

                        // Obtener el objeto Perfil según la opción seleccionada
                        Perfil perfilSeleccionado = em.find(Perfil.class, seleccion1);
                        u.setIdPerfil(perfilSeleccionado);

                        // Obtener el objeto Nacionalidad según la opción seleccionada
                        Nacionalidad nacionalidadSeleccionada = em.find(Nacionalidad.class, seleccion);
                        u.setIdNacionalidad(nacionalidadSeleccionada);

                        em.persist(u);
                        em.getTransaction().commit();
                    } catch (Exception e) {
                        if (em.getTransaction().isActive()) {
                            em.getTransaction().rollback();
                        }
                        e.printStackTrace();
                    } finally {
                        em.close();
                    }

                    App.setRoot("FormaInicioSesion");
                } catch (IOException ex) {
                    Logger.getLogger(FormaRegistrarseController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
