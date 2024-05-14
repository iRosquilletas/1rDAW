import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class leer {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:33006/reservas_vuelos";
        String user = "root";
        String password = "dbrootpass";

        try (Connection con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement()) {

            String query = "SELECT * FROM Vuelos";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id_vuelo = rs.getInt("id_vuelo");
                int numero_vuelo = rs.getInt("numero_vuelo");
                String origen = rs.getString("origen");
                String destino = rs.getString("destino");
                String fecha = rs.getString("fecha");
                int capacidad = rs.getInt("capacidad");

                System.out.println("ID Vuelo: " + id_vuelo);
                System.out.println("Número de Vuelo: " + numero_vuelo);
                System.out.println("Origen: " + origen);
                System.out.println("Destino: " + destino);
                System.out.println("Fecha: " + fecha);
                System.out.println("Capacidad: " + capacidad);
                System.out.println("--------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}