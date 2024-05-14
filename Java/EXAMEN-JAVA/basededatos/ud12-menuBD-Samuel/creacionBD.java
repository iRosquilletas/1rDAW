import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class creacionBD {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:33006/";
        String user = "root";
        String password = "dbrootpass";

        try (Connection con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement()) {

            creacionBD(stmt);
            System.out.println("Base de datos y tablas creadas con éxito.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void creacionBD(Statement stmt) throws SQLException {

        String vuelos = "CREATE DATABASE IF NOT EXISTS reservas_vuelos";
        String useDB = "USE reservas_vuelos";

        String vuelosTable = "CREATE TABLE IF NOT EXISTS Vuelos " +
                "(id_vuelo INT AUTO_INCREMENT PRIMARY KEY, " +
                "numero_vuelo INT, " +
                "origen VARCHAR(255), " +
                "destino VARCHAR(255), " +
                "fecha DATE, " +
                "capacidad INT)";

        String pasajerosTable = "CREATE TABLE IF NOT EXISTS Pasajeros " +
                "(id_pasajero INT AUTO_INCREMENT PRIMARY KEY, " +
                "numero_pasaporte INT, " +
                "nombre_pasajero VARCHAR(255))";

        String vuelosPasajeroTable = "CREATE TABLE IF NOT EXISTS Vuelos_Pasajeros " +
                "(id_vuelo INT, " +
                "id_pasajero INT, " +
                "n_asiento INT, " +
                "PRIMARY KEY (id_vuelo, id_pasajero), " +
                "FOREIGN KEY (id_vuelo) REFERENCES Vuelos(id_vuelo), " +
                "FOREIGN KEY (id_pasajero) REFERENCES Pasajeros(id_pasajero))";

        stmt.executeUpdate(vuelos);
        stmt.executeUpdate(useDB);
        stmt.executeUpdate(vuelosTable);
        stmt.executeUpdate(pasajerosTable);
        stmt.executeUpdate(vuelosPasajeroTable);
    }
}