package metodos;
import conexion.ConexionBBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Timestamp;
public class Metodos {
    private Connection conexion;

    public Metodos() {
       
        ConexionBBDD dañe = new ConexionBBDD();
        conexion = dañe.obtenerConexion();
    }

    public void DatosClientes() {
    try {
        String consulta = "SELECT * FROM cliente";
        PreparedStatement statement = conexion.prepareStatement(consulta);
        ResultSet resultado = statement.executeQuery();

        while (resultado.next()) {
            int id = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            String apellido1 = resultado.getString("apellido1");
            String apellido2 = resultado.getString("apellido2");
            String ciudad = resultado.getString("ciudad");
            int categoria = resultado.getInt("categoría");

            System.out.println("ID Cliente: " + id + ", Nombre: " + nombre +
                               ", Apellido1: " + apellido1 + ", Apellido2: " + apellido2 +
                               ", Ciudad: " + ciudad + ", Categoría: " + categoria);
        }

      
        resultado.close();
        statement.close();
    } catch (SQLException ex) {
        Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
    }
}


    public void DatosComerciales() {
    try {
        String consulta = "SELECT * FROM comercial";
        PreparedStatement statement = conexion.prepareStatement(consulta);
        ResultSet resultado = statement.executeQuery();

        while (resultado.next()) {
            int idComercial = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            String apellido1 = resultado.getString("apellido1");
            String apellido2 = resultado.getString("apellido2");
            float comision = resultado.getFloat("comisión");

            System.out.println("ID Comercial: " + idComercial + ", Nombre: " + nombre +
                               ", Apellido1: " + apellido1 + ", Apellido2: " + apellido2 +
                               ", Comisión: " + comision);
        }

       
        resultado.close();
        statement.close();
    } catch (SQLException ex) {
        Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
    }
}


public void DatosPedidosOrdenadosPorFecha() {
    try {
        String consulta = "SELECT * FROM pedido ORDER BY fecha DESC";
        PreparedStatement statement = conexion.prepareStatement(consulta);
        ResultSet resultado = statement.executeQuery();

        while (resultado.next()) {
            int idPedido = resultado.getInt("id");
            double total = resultado.getDouble("total");
            Timestamp fecha = resultado.getTimestamp("fecha");
            int idCliente = resultado.getInt("id_cliente");
            int idComercial = resultado.getInt("id_comercial");

            System.out.println("ID Pedido: " + idPedido + ", Total: " + total +
                               ", Fecha: " + fecha + ", ID Cliente: " + idCliente +
                               ", ID Comercial: " + idComercial);
        }

     
        resultado.close();
        statement.close();
    } catch (SQLException ex) {
        Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
    }
}


    public void listarClientes() {
    try {
        String consulta = "SELECT cliente.*, pedido.*, comercial.* " +
                          "FROM cliente " +
                          "JOIN pedido ON cliente.id = pedido.id_cliente " +
                          "JOIN comercial ON pedido.id_comercial = comercial.id";
        PreparedStatement statement = conexion.prepareStatement(consulta);
        ResultSet resultado = statement.executeQuery();

        while (resultado.next()) {
            //Datos de Cliente
            int idCliente = resultado.getInt("cliente.id");
            String nombreCliente = resultado.getString("cliente.nombre");
            String apellido1Cliente = resultado.getString("cliente.apellido1");
            String apellido2Cliente = resultado.getString("cliente.apellido2");
            String ciudadCliente = resultado.getString("cliente.ciudad");
            int categoriaCliente = resultado.getInt("cliente.categoría");
            //Datos de pediido
            int idPedido = resultado.getInt("pedido.id");
            double totalPedido = resultado.getDouble("pedido.total");
            Timestamp fechaPedido = resultado.getTimestamp("pedido.fecha");
            int idComercial = resultado.getInt("pedido.id_comercial");
            //Datos de Comercial
            int idComercialResultado = resultado.getInt("comercial.id");
            String nombreComercial = resultado.getString("comercial.nombre");
            String apellido1Comercial = resultado.getString("comercial.apellido1");
            String apellido2Comercial = resultado.getString("comercial.apellido2");
            float comisionComercial = resultado.getFloat("comercial.comisión");

            System.out.println("ID Cliente: " + idCliente + ", Nombre Cliente: " + nombreCliente +
                               ", Apellido1 Cliente: " + apellido1Cliente + ", Apellido2 Cliente: " + apellido2Cliente +
                               ", Ciudad Cliente: " + ciudadCliente + ", Categoría Cliente: " + categoriaCliente +
                               ", ID Pedido: " + idPedido + ", Total Pedido: " + totalPedido +
                               ", Fecha Pedido: " + fechaPedido + ", ID Comercial: " + idComercial +
                               ", ID Comercial Resultado: " + idComercialResultado +
                               ", Nombre Comercial: " + nombreComercial +
                               ", Apellido1 Comercial: " + apellido1Comercial +
                               ", Apellido2 Comercial: " + apellido2Comercial +
                               ", Comisión Comercial: " + comisionComercial);
        }

       
        resultado.close();
        statement.close();
    } catch (SQLException ex) {
        Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
    }
}
 public void insertar() {
    try {
        double total = 500.0; 
        java.sql.Date fecha = java.sql.Date.valueOf("2023-01-01"); 
        int idCliente = 1; 
        int idComercial = 1; 

       
        String consulta = "INSERT INTO pedido (total, fecha, id_cliente, id_comercial) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = conexion.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
        statement.setDouble(1, total);
        statement.setDate(2, fecha);
        statement.setInt(3, idCliente);
        statement.setInt(4, idComercial);

       
        statement.executeUpdate();

        
        ResultSet generatedKeys = statement.getGeneratedKeys();
        if (generatedKeys.next()) {
            int idPedidoGenerado = generatedKeys.getInt(1);
            System.out.println("Pedido insertado con éxito. ID generado: " + idPedidoGenerado);
        }

      
        generatedKeys.close();
        statement.close();
    } catch (SQLException ex) {
        Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
    }
}
 
 public void Autocommit(boolean autocommit) {
        try {
            conexion.setAutoCommit(autocommit);
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void commit() {
        try {
           
            conexion.commit();
            System.out.println("Commit realizado con éxito.");
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

