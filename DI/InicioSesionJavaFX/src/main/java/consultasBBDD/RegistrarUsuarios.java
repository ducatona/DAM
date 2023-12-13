package consultasBBDD;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javafx.scene.control.DatePicker;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import modelo.Usuarios;

public class RegistrarUsuarios {

    public static void InsertarUsuario(String nombreUsuario, String apellidosUsuario, LocalDate fechaNacimiento,
            String aliasUsuario, String passwordUsuario, String emailUsuario, int id_nacionalidad, int id_perfil) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_InicioSesionJavaFX_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        Query insercion = em.createNativeQuery("INSERT INTO Usuarios (nombre, apellidos, fecha_nac, alias, password, email,id_nacionalidad, id_perfil) "
                + "VALUES (:nombre, :apellidos, :fechaNac, :alias, :password, :email, :id_nacionalidad, :id_perfil)");

        // Establecer los parámetros
        insercion.setParameter("nombre", nombreUsuario);
        insercion.setParameter("apellidos", apellidosUsuario);
        insercion.setParameter("fechaNac", java.sql.Date.valueOf(fechaNacimiento)); // Convertir LocalDate a java.sql.Date
        insercion.setParameter("alias", aliasUsuario);
        insercion.setParameter("password", passwordUsuario);
        insercion.setParameter("email", emailUsuario);
        insercion.setParameter("id_nacionalidad", id_nacionalidad);
        insercion.setParameter("id_perfil", id_perfil);

        // Iniciar la transacción
        em.getTransaction().begin();

        // Ejecutar la consulta de inserción
        insercion.executeUpdate();

        // Commit de la transacción
        em.getTransaction().commit();

        System.out.println("Nuevo usuario insertado correctamente");
    }
}
