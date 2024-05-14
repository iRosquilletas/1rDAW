import java.sql.*;
import java.util.Scanner;

public class ReservaAvion {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // Añado cj porque si no me sale que está deprecated
    static final String DB_URL = "jdbc:mysql://localhost:33006/reservas_vuelos";
    static final String USER = "root";
    static final String PASS = "dbrootpass";

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = con.createStatement();

            crecionBD(stmt);
            int opcion;
            do {
                System.out.println("-------- Menú --------");
                System.out.println("1. Alta Vuelo");
                System.out.println("2. Alta Pasajero");
                System.out.println("3. Reserva Vuelo");
                System.out.println("4. Modificar reserva");
                System.out.println("5. Baja reserva");
                System.out.println("6. Salir");

                System.out.print("Introduce una opción: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        altaVuelo(con);
                        break;
                    case 2:
                        altaPasajero(con);
                        break;
                    case 3:
                        reservaVuelo(con);
                        break;
                    case 4:
                        modificarReserva(con);
                        break;
                    case 5:
                        bajaReserva(con);
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Esa opción no es valida");
                        break;
                }
            } while (opcion != 6);

            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // CREAR DB -->
    public static void crecionBD(Statement stmt) throws SQLException {

        String vuelos = "CREATE TABLE IF NOT EXISTS Vuelos " + "(id_vuelo INT AUTO_INCREMENT PRIMARY KEY, "
                + "numero_vuelo INT, " + "origen VARCHAR(255), " + "destino VARCHAR(255), " + "fecha DATE, "
                + "capacidad INT)";

        String pasajeros = "CREATE TABLE IF NOT EXISTS Pasajeros " + "(id_pasajero INT AUTO_INCREMENT PRIMARY KEY, " +
                "numero_pasaporte INT, " +
                "nombre_pasajero VARCHAR(255))";

        String vuelosPasajero = "CREATE TABLE IF NOT EXISTS Vuelos_Pasajeros "
                +
                "(id_vuelo INT, " +
                "id_pasajero INT, " +
                "n_asiento INT, " +
                "PRIMARY KEY (id_vuelo, id_pasajero), " +
                "FOREIGN KEY (id_vuelo) REFERENCES Vuelos(id_vuelo), " +
                "FOREIGN KEY (id_pasajero) REFERENCES Pasajeros(id_pasajero))";

        stmt.executeUpdate(vuelos);
        stmt.executeUpdate(pasajeros);
        stmt.executeUpdate(vuelosPasajero);
    }

    // MENU -->
    public static void altaVuelo(Connection con) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Número de vuelo:");
            int numeroVuelo = sc.nextInt();
            sc.nextLine();
            System.out.println("Origen del vuelo:");
            String origen = sc.nextLine();
            System.out.println("Destino del vuelo:");
            String destino = sc.nextLine();
            System.out.println("Fecha del vuelo:");
            String fechaStr = sc.nextLine();
            Date fecha = Date.valueOf(fechaStr);
            System.out.println("¿Cuánta capacidad tiene el vuelo?:");
            int capacidad = sc.nextInt();

            PreparedStatement pstmt = con.prepareStatement(
                    "INSERT INTO Vuelos (numero_vuelo, origen, destino, fecha, capacidad) VALUES (?, ?, ?, ?, ?)");
            pstmt.setInt(1, numeroVuelo);
            pstmt.setString(2, origen);
            pstmt.setString(3, destino);
            pstmt.setDate(4, fecha);
            pstmt.setInt(5, capacidad);
            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("El vuelo se ha creado");
            } else {
                System.out.println("Error al crear el vuelo");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void altaPasajero(Connection con) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Número de pasaporte de la persona: ");
            int numeroPasaporte = sc.nextInt();
            sc.nextLine();
            System.out.println("Nombre de la persona: ");
            String nombre = sc.nextLine();

            PreparedStatement pstmt = con
                    .prepareStatement("INSERT INTO Pasajeros (numero_pasaporte, nombre_pasajero) VALUES (?, ?)");
            pstmt.setInt(1, numeroPasaporte);
            pstmt.setString(2, nombre);
            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("El pasajero se creó");
            } else {
                System.out.println("Error al crear al pasajero");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void reservaVuelo(Connection con) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("ID del vuelo:");

            int idVuelo = sc.nextInt();
            System.out.println("ID del pasajero:");
            int idPasajero = sc.nextInt();
            System.out.println("Cual número de asiento quieres?: ");
            int numAsiento = sc.nextInt();

            PreparedStatement pstmt = con.prepareStatement(
                    "INSERT INTO Vuelos_Pasajeros (id_vuelo, id_pasajero, n_asiento) VALUES (?, ?, ?)");
            pstmt.setInt(1, idVuelo);
            pstmt.setInt(2, idPasajero);
            pstmt.setInt(3, numAsiento);

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("La reserva se ha realizado correctamente.");
            } else {
                System.out.println("Error al realizar la reserva.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void modificarReserva(Connection con) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el número de asiento de la reserva que desea modificar:");
            int numAsiento = sc.nextInt();
            System.out.println("Introduce el nuevo número de asiento:");
            int nuevoNumAsiento = sc.nextInt();

            PreparedStatement pstmt = con
                    .prepareStatement("UPDATE Vuelos_Pasajeros SET n_asiento = ? WHERE n_asiento = ?");
            pstmt.setInt(1, nuevoNumAsiento);
            pstmt.setInt(2, numAsiento);

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Se ha modificado");
            } else {
                System.out.println("Hubo algún error");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void bajaReserva(Connection con) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el número de asiento de la reserva que quieres cancelar: ");
            int numAsiento = sc.nextInt();

            PreparedStatement pstmt = con.prepareStatement(
                    "DELETE FROM Vuelos_Pasajeros WHERE n_asiento = ?");
            pstmt.setInt(1, numAsiento);

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("La reserva se canceló");
            } else {
                System.out.println("Error al cancelar la reserva");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
