package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author stanl
 */
public class Conexion {
    private static final String URL = "jdbc:oracle:thin:@192.168.137.72:1521:xe";
    private static final String USUARIO = "SYSTEM";
    private static final String CONTRASENA = "fakedrips";
    public static Connection getConexion() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            return conexion;
        } catch (SQLException e) {
            System.out.println("Hubo un error" + e);
              return null;
        } catch (ClassNotFoundException ex) {
            System.out.println("La clase presentó un error" + ex);
              return null;
        }
    }
}
