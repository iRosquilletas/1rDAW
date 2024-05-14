import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class actualizar {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/reservas_vuelos";
        String user = "root";
        String password = "tu_password";

        try (Connection con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement()) {

            String query = "UPDATE Vuelos SET capacidad = 150 WHERE id_vuelo = 2"; // Actualizar la capacidad del vuelo
                                                                                   // con id_vuelo = 2

            int filasAfectadas = stmt.executeUpdate(query);

            if (filasAfectadas > 0) {
                System.out.println("Registro actualizado con éxito.");
            } else {
                System.out.println("No se encontró el registro a actualizar.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}