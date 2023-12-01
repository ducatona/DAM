/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Validaciones {

    // Constructor por defecto
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
     * Método para validar correos electrónicos, admite mayúsculas, minúsculas,
     * números, puntos, guiones, guiones bajos y acentos.
     *
     * @param campo Campo de texto a validar.
     * @return Devuelve FALSE si el correo electrónico dado como argumento NO es
     * válido, TRUE en los demás casos.
     */
    public boolean validarEmail(TextField campo) {
        if (comprobarCampoVacio(campo)) {
            return false;
        }
        // Expresión regular para validar correos electrónicos.
        boolean valido = campo.getText().matches("[a-zA-Z0-9.\\-_]+@[a-z]+\\.[a-z]{2,4}");
        if (!valido) {
            mostrarError("Correo electrónico no válido");
        }
        return valido;
    }

    /**
     * Método para validar JComboBox, asegurándose de que se haya seleccionado
     * un elemento.
     *
     * @param cbox ComboBox a validar.
     * @return Devuelve FALSE si no se ha seleccionado ningún elemento, TRUE
     * en los demás casos.
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
}
