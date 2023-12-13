package consultasBBDD;

import java.util.ArrayList;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import modelo.Generos;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import modelo.Usuarios;
import org.hibernate.sql.Alias;

public class Login {

    public static boolean ConsultarContraseña(String alias, String password) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_InicioSesionJavaFX_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        try {
            String jpql = "SELECT u FROM Usuarios u WHERE u.alias = :alias AND u.password = :password";
            TypedQuery<Usuarios> query = em.createQuery(jpql, Usuarios.class);
            query.setParameter("alias", alias);
            query.setParameter("password", password);

            // Intenta obtener un resultado, si no hay resultados, significa que el usuario o la contraseña son incorrectos
            query.getSingleResult();
            em.close();
            emf.close();
            // Si no se lanza NoResultException, el usuario y la contraseña son correctos
            return true;
        } catch (NoResultException e) {
            em.close();
            emf.close();

            // No se encontró ningún usuario con ese nombre y contraseña
            return false;
        }
    }
}
