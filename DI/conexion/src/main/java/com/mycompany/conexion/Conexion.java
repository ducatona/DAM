import java.sql.*;

public class Main {

    public static void main(String[] args) {
        ConexionBBDD conexionBBDD = new ConexionBBDD();
        Connection connection = conexionBBDD.conexionMySQL();

        if (connection != null) {
            try {
                // Método para consultar datos de clientes
                consultarDatosClientes(connection);

                // Método para consultar datos de pedidos ordenados por fecha
                consultarDatosPedidos(connection);

                // Método para listar clientes con pedidos y datos de comerciales
                listarClientesConPedidos(connection);

                // Método para insertar un nuevo pedido
                // insertarPedido(connection);

                // Método para confirmar cambios
                // confirmarCambios(connection); // No necesitas confirmar cambios en este contexto
            } finally {
                try {
                    connection.close(); // Cierra la conexión cuando hayas terminado
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void consultarDatosClientes(Connection connection) {
        String query = "SELECT * FROM cliente";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") +
                        ", Nombre: " + resultSet.getString("nombre") +
                        ", Apellido1: " + resultSet.getString("apellido1") +
                        ", Apellido2: " + resultSet.getString("apellido2") +
                        ", Ciudad: " + resultSet.getString("ciudad") +
                        ", Categoría: " + resultSet.getInt("categoría"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void consultarDatosPedidos(Connection connection) {
        String query = "SELECT * FROM pedido ORDER BY fecha DESC";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                System.out.println("ID Pedido: " + resultSet.getInt("id") +
                        ", Total: " + resultSet.getDouble("total") +
                        ", Fecha: " + resultSet.getDate("fecha") +
                        ", ID Cliente: " + resultSet.getInt("id_cliente") +
                        ", ID Comercial: " + resultSet.getInt("id_comercial"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void listarClientesConPedidos(Connection connection) {
        // Implementa el método para listar clientes con pedidos y datos de comerciales
        // Puedes realizar una consulta JOIN para obtener la información necesaria
        // y luego imprimir los resultados
        String query = "SELECT c.id, c.nombre, c.apellido1, c.apellido2, c.ciudad, c.categoría, " +
                "p.id AS id_pedido, p.total, p.fecha, p.id_comercial " +
                "FROM cliente c " +
                "INNER JOIN pedido p ON c.id = p.id_cliente";

        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                System.out.println("Cliente ID: " + resultSet.getInt("id") +
                        ", Nombre: " + resultSet.getString("nombre") +
                        ", Apellido1: " + resultSet.getString("apellido1") +
                        ", Apellido2: " + resultSet.getString("apellido2") +
                        ", Ciudad: " + resultSet.getString("ciudad") +
                        ", Categoría: " + resultSet.getInt("categoría") +
                        ", ID Pedido: " + resultSet.getInt("id_pedido") +
                        ", Total: " + resultSet.getDouble("total") +
                        ", Fecha: " + resultSet.getDate("fecha") +
                        ", ID Comercial: " + resultSet.getInt("id_comercial"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertarPedido(Connection connection) {
        // Implementa el método para insertar un nuevo pedido
        // Puedes utilizar PreparedStatement para evitar la inyección SQL
        String insertQuery = "INSERT INTO pedido (total, fecha, id_cliente, id_comercial) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setDouble(1, 500.0);
            preparedStatement.setDate(2, Date.valueOf("2023-
