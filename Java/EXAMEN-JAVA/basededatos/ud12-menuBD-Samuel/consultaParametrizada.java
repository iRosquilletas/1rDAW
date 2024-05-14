import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class consultaParametrizada {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/reservas_vuelos";
        String user = "root";
        String password = "tu_password";

        String origen = "Paris";
        String destino = "Londres";
        String fecha = "2023-05-15";
        int capacidad = 180;

        String query = "INSERT INTO Vuelos (origen, destino, fecha, capacidad) VALUES (?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = con.prepareStatement(query)) {

            pstmt.setString(1, origen);
            pstmt.setString(2, destino);
            pstmt.setString(3, fecha);
            pstmt.setInt(4, capacidad);

            int filasAfectadas = pstmt.executeUpdate();

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