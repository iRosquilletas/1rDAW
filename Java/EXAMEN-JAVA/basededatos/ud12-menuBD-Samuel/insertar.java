import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertar {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/reservas_vuelos";
        String user = "root";
        String password = "tu_password";

        try (Connection con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement()) {

            String query = "INSERT INTO Vuelos (origen, destino, fecha, capacidad) VALUES ('Madrid', 'Barcelona', '2022-12-01', 200)";

            int filasAfectadas = stmt.executeUpdate(query);

            if (filasAfectadas > 0) {
                System.out.println("Nuevo registro insertado con éxito.");
            } else {
                System.out.println("No se pudo insertar el nuevo registro.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}