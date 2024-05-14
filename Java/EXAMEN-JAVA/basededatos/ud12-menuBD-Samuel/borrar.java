import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class borrar {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/reservas_vuelos";
        String user = "root";
        String password = "tu_password";

        try (Connection con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement()) {

            String query = "DELETE FROM Vuelos WHERE id_vuelo = 1"; // Borrar el vuelo con id_vuelo = 1

            int filasAfectadas = stmt.executeUpdate(query);

            if (filasAfectadas > 0) {
                System.out.println("Registro borrado con éxito.");
            } else {
                System.out.println("No se encontró el registro a borrar.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}