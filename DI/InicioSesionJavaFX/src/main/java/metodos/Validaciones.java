package metodos;

import java.time.LocalDate;
import modelo.Generos;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import modelo.Nacionalidad;
import modelo.Perfil;

public class Validaciones {

    public Validaciones() {

    }

    public boolean validarNom_Ape(TextField campo) {
        if (comprobarCampoVacio(campo)) {
            return false;
        }
        // Expresión regular mejorada para admitir acentos y espacios.
        boolean valido = campo.getText().matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]{0,80}");
        if (!valido) {
            mostrarError("Nombre/Apellido no válido");
        }
        return valido;
    }

    public boolean validarUser(TextField campo) {
        if (comprobarCampoVacio(campo)) {
            return false;
        }
        // Expresión regular mejorada para nombres de usuario.
        boolean valido = campo.getText().matches("[a-zA-Z0-9.\\-_ñÑáéíóúÁÉÍÓÚ]{0,12}");
        if (!valido) {
            mostrarError("Nombre de usuario no válido");
        }
        return valido;
    }

    public boolean validarCbox(ComboBox<String> cbox) {
        if (cbox.getSelectionModel().isEmpty()) {
            mostrarError("No ha seleccionado ningún " + cbox.getId());
            return false;
        }
        return true;
    }

    private boolean comprobarCampoVacio(TextField campo) {
        if (campo.getText().isBlank()) {
            mostrarError("Campo vacío");
            return true;
        }
        return false;
    }

    private void mostrarError(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Dato no válido");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    public void mContraseña(PasswordField pass, TextField text, CheckBox check) {
        //dejamos de hacer vissible el texto
        text.setVisible(false);
        //le decimos que no tenga en cuenta el nodo y no lo haga visible
        text.setManaged(false);
        //propiedad del check
        text.managedProperty().bind(check.selectedProperty());
        //hacemos visible con la conexion
        text.visibleProperty().bind(check.selectedProperty());
        // con el metodo bind de unir , necesitariamos el bidireccional para que al darle a la propidad checkbox,
        //se junte todo y lo muestre a su vez
        text.textProperty().bindBidirectional(pass.textProperty());

    }

    public void InsertarRegistro(EntityManager em) {
        Query insercion = em.createNativeQuery("INSERT INTO Categoria (nombre) VALUES (:nombre);");
        em.getTransaction().begin();
        insercion.setParameter("nombre", "Videojuegos");
        insercion.executeUpdate();
        em.getTransaction().commit();

        System.out.println("Categoria nueva insertada correctamente");

    }

    public void Select1(EntityManager em) {
        Query c1 = em.createNamedQuery("Generos.findAll");
        ArrayList<Generos> listaProductos = (ArrayList<Generos>) c1.getResultList();
        for (Generos listaProducto : listaProductos) {

            System.out.println(listaProducto);

        }

    }

    public static void rellenarCBX(ComboBox<String> comboBox, String consulta) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_InicioSesionJavaFX_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        try {
            Query query = em.createNamedQuery(consulta);
            List<String> resultList = query.getResultList();

            ObservableList<String> items = FXCollections.observableArrayList(resultList);
            comboBox.setItems(items);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }

    public int obtenerPosicionSeleccion(ComboBox<String> comboBox) {
        // Obtiene la posición del ítem seleccionado en el ComboBox
        int posicion = comboBox.getSelectionModel().getSelectedIndex() + 1;
        System.out.println("el indice es " + posicion);

        // Retorna la posición
        return posicion;
    }

    public static <T extends TextInputControl> boolean comprobarCampoVacio(T Control) {
        if (Control.getText().isBlank()) {
            alertasWarning("Error", null, "Debe rellenar el campo " + Control.getId());
        } else {
            return true;
        }
        return false;
    }

    public static void alertasWarning(String titulo, String header, String contenido) {
        Alert alerta = new Alert(AlertType.WARNING);
        alerta.setTitle(titulo);
        alerta.setHeaderText(header); // Sin encabezado
        alerta.setContentText(contenido);
        alerta.showAndWait();
    }

    public <T extends TextInputControl> boolean comprobarFormularioBlanco(T... parametros) {
        for (T parametro : parametros) {
            if (parametro.getText().isBlank()) {
                alertasWarning("Error", null, "Debe rellenar el campo " + parametro.getId());
                return false;
            }
        }
        return true;
    }

    public boolean comprobarformulario(TextField alias, TextField email, TextField password, TextField confirmacion) {
        return comprobarUsuario(alias) && validarEmail(email) && comprobarContraseña(password, confirmacion);
    }

    public boolean comprobarContraseña(TextField password, TextField confirmacion) {
        if (!password.getText().equals(confirmacion.getText())) {
            alertasWarning("Error", null, "Las contraseñas no coinciden");
            return false;
        }
        return true;
    }

    public boolean comprobarUsuario(TextField alias) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_InicioSesionJavaFX_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Long> query = em.createQuery("SELECT COUNT(u) FROM Usuarios u WHERE u.alias = :alias", Long.class);
        query.setParameter("alias", alias.getText());
        Long resultado = query.getSingleResult();

        em.close();
        emf.close();

        if (resultado > 0) {
            alertasWarning("Error de creacion de cuenta", null, "El usuario ya existe");
            return false;
        }
        return true;
    }

    public boolean validarEmail(TextField email) {
        if (!email.getText().matches("[a-zA-Z0-9.\\-_]+@[a-z]+\\.[a-z]{2,4}")) {
            alertasWarning("Error de  formato", null, "Formato de email no valido");
            return false;
        }
        return true;
    }
    
    
}


