/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import modelo.Generos;
import java.util.ArrayList;
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

/**
 *
 * @author apena
 */
public class Validaciones {

    // Constructor por defecto
    /**
     *
     */
    public Validaciones() {
        // Puedes agregar lógica de inicialización aquí si es necesario
    }

    /**
     * Método para validar nombres/apellidos, admite mayúsculas, minúsculas,
     * acentos y espacios.
     *
     * @param campo Campo de texto a validar.
     * @return Devuelve FALSE si el texto dado como argumento NO pasa la
     * validación, TRUE en los demás casos.
     */
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

    /**
     * Método para validar nombres de usuario, admite mayúsculas, minúsculas,
     * números, puntos, guiones, guiones bajos y acentos.
     *
     * @param campo Campo de texto a validar.
     * @return Devuelve FALSE si el texto dado como argumento NO pasa la
     * validación, TRUE en los demás casos.
     */
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

  
  
    /**
     * Método para validar JComboBox, asegurándose de que se haya seleccionado
     * un elemento.
     *
     * @param cbox ComboBox a validar.
     * @return Devuelve FALSE si no se ha seleccionado ningún elemento, TRUE en
     * los demás casos.
     */
    public boolean validarCbox(ComboBox<String> cbox) {
        if (cbox.getSelectionModel().isEmpty()) {
            mostrarError("No ha seleccionado ningún " + cbox.getId());
            return false;
        }
        return true;
    }

    // Métodos auxiliares:
    /**
     * Método para comprobar si un campo de texto está vacío.
     *
     * @param campo Campo de texto a comprobar.
     * @return Devuelve TRUE si el campo está vacío, FALSE en los demás casos.
     */
    private boolean comprobarCampoVacio(TextField campo) {
        if (campo.getText().isBlank()) {
            mostrarError("Campo vacío");
            return true;
        }
        return false;
    }

    /**
     * Método para mostrar un mensaje de error usando un Alert de JavaFX.
     *
     * @param mensaje Mensaje de error a mostrar.
     */
    private void mostrarError(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Dato no válido");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    /**
     * Metodo para que no se vea la contraseña que estabamos añadiendo, y con el
     * que podemos ver al darle al checkbox, la contraseña introducida o por
     * introducir.
     *
     * @param pass
     * @param text
     * @param check
     */
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
        ArrayList<String> lista = new ArrayList();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_InicioSesionJavaFX_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        Query c1 = em.createNamedQuery(consulta);
        lista = (ArrayList<String>) c1.getResultList();

        ObservableList<String> items = FXCollections.observableArrayList();

        for (String elemento : lista) {

            items.add(elemento);

        }

        comboBox.setItems(items);
    }

    public static void rellenarCBX2(ComboBox<String> comboBox, ArrayList<Generos> lista) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_InicioSesionJavaFX_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        Query c1 = em.createNamedQuery("Generos.findAll");
        lista = (ArrayList<Generos>) c1.getResultList();

        ObservableList<String> items = FXCollections.observableArrayList();

        for (Generos elemento : lista) {

            System.out.println(elemento.getNombreGenero());
            items.add(elemento.getNombreGenero());

        }

        comboBox.setItems(items);
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

    public  <T extends TextInputControl> boolean comprobarFormularioBlanco(T... parametros) {
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
    
    
    public  boolean comprobarContraseña (TextField password, TextField confirmacion){
        if (!password.getText().equals(confirmacion.getText())) {
            alertasWarning("Error", null, "Las contraseñas no coinciden");
            return false;
        }
        return true;
    }
    
    public  boolean comprobarUsuario (TextField alias){
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
    
    public  boolean validarEmail(TextField email) {
        if (!email.getText().matches("[a-zA-Z0-9.\\-_]+@[a-z]+\\.[a-z]{2,4}")) {
            alertasWarning("Error de  formato", null, "Formato de email no valido");
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
    
    
    
}
