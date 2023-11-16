
package principal;

import conexion.ConexionBBDD;
import java.util.Scanner;
import metodos.Metodos;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Metodos m = new Metodos();
    private static final ConexionBBDD conexionBBDD = new ConexionBBDD();

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            procesarOpcion(opcion);
        } while (opcion != 7);

        // Cerrar la conexión al salir
        conexionBBDD.cerrarConexion();
    }

    private static void mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Consultar datos de los clientes");
        System.out.println("2. Consultar datos de los comerciales");
        System.out.println("3. Consultar datos de los pedidos (ordenados por fecha)");
        System.out.println("4. Listado de clientes con pedidos y comerciales asociados");
        System.out.println("5. Insertar pedido");
        System.out.println("6. Confirmar cambios");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                m.setConexion(conexionBBDD.obtenerConexion());
                m.DatosClientes();
                break;
            case 2:
                m.setConexion(conexionBBDD.obtenerConexion());
                m.DatosComerciales();
                break;
            case 3:
                m.setConexion(conexionBBDD.obtenerConexion());
                m.DatosPedidosOrdenadosPorFecha();
                break;
            case 4:
                m.setConexion(conexionBBDD.obtenerConexion());
                m.listarClientes();
                break;
            case 5:
                m.Autocommit(false);
                m.insertar();
                break;
            case 6:
                m.commit();
                break;
            case 7:
                System.out.println("Adiós");
                break;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
    }
}
