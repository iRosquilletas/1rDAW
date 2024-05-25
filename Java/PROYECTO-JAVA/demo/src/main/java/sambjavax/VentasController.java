/*package sambjavax;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
public class VentasController implements Initializable {

    @FXML
    private TableView<Ventas> tablaVentas;

    @FXML
    private TableColumn<Ventas, String> nombre;
    @FXML
    private TableColumn<Ventas, String> correo;
    @FXML
    private TableColumn<Ventas, String> telefono;
    @FXML
    private TableColumn<Ventas, String> direccion;
    @FXML
    private TableColumn<Ventas, String> dni;
    @FXML
    private TableColumn<Ventas, Integer> id_venta;
    @FXML
    private TableColumn<Ventas, Integer> id_usuario;
    @FXML
    private TableColumn<Ventas, Integer> id_moto;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nombre.setCellValueFactory(new PropertyValueFactory<>("cliente"));
        correo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        telefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        direccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        dni.setCellValueFactory(new PropertyValueFactory<>("dni"));
        id_venta.setCellValueFactory(new PropertyValueFactory<>("idVenta"));
        id_usuario.setCellValueFactory(new PropertyValueFactory<>("idUsuario"));
        id_moto.setCellValueFactory(new PropertyValueFactory<>("idMoto"));

        try {
            ObservableList<Ventas> ventas = getVentas();
            tablaVentas.setItems(ventas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Ventas> getVentas() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cesdb2022";
        String user = "root";
        String password = "dbrootpass";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Ventas");

        ObservableList<Ventas> ventas = FXCollections.observableArrayList();
        while (rs.next()) {
            int idVenta = rs.getInt("id_venta");
            int idUsuario = rs.getInt("id_usuario");
            String cliente = rs.getString("cliente");
            String correo = rs.getString("correo");
            String telefono = rs.getString("telefono");
            String direccion = rs.getString("direccion");
            String dni = rs.getString("dni");
            int idMoto = rs.getInt("id_moto");

            Ventas venta = new Ventas(idVenta, idUsuario, cliente, correo, telefono, direccion, idMoto);

            ventas.add(venta);
        }
        tablaVentas.setItems(ventas);

        rs.close();
        stmt.close();
        conn.close();
        return ventas;
    }
}
*/

package sambjavax;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class VentasController implements Initializable {

    @FXML
    private TableView<Ventas> tablaVentas;

    @FXML
    private TableView<MotocicletaVentas> tablaRegistro;

    // Columnas para la tabla de ventas
    @FXML
    private TableColumn<Ventas, String> nombre;
    @FXML
    private TableColumn<Ventas, String> correo;
    @FXML
    private TableColumn<Ventas, String> telefono;
    @FXML
    private TableColumn<Ventas, String> direccion;
    @FXML
    private TableColumn<Ventas, String> dni;
    @FXML
    private TableColumn<Ventas, Integer> id_venta;
    @FXML
    private TableColumn<Ventas, Integer> id_usuario;
    @FXML
    private TableColumn<Ventas, Integer> id_moto;

    // Columnas para la tabla de motocicletas
    @FXML
    private TableColumn<MotocicletaVentas, String> marca;
    @FXML
    private TableColumn<MotocicletaVentas, String> modelo;
    @FXML
    private TableColumn<MotocicletaVentas, String> matricula;
    @FXML
    private TableColumn<MotocicletaVentas, String> bastidor;
    @FXML
    private TableColumn<MotocicletaVentas, Integer> id;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Configurar columnas para la tabla de ventas
        nombre.setCellValueFactory(new PropertyValueFactory<>("cliente"));
        correo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        telefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        direccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        dni.setCellValueFactory(new PropertyValueFactory<>("dni"));
        id_venta.setCellValueFactory(new PropertyValueFactory<>("idVenta"));
        id_usuario.setCellValueFactory(new PropertyValueFactory<>("idUsuario"));
        id_moto.setCellValueFactory(new PropertyValueFactory<>("idMoto"));

        // Configurar columnas para la tabla de motocicletas
        marca.setCellValueFactory(new PropertyValueFactory<>("marca"));
        modelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        matricula.setCellValueFactory(new PropertyValueFactory<>("matricula"));
        bastidor.setCellValueFactory(new PropertyValueFactory<>("bastidor"));
        id.setCellValueFactory(new PropertyValueFactory<>("id"));

        try {
            ObservableList<Ventas> ventas = getVentas();
            tablaVentas.setItems(ventas);

            ObservableList<MotocicletaVentas> motocicletas = getMotocicletas();
            tablaRegistro.setItems(motocicletas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Ventas> getVentas() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cesdb2022";
        String user = "root";
        String password = "dbrootpass";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Ventas");

        ObservableList<Ventas> ventas = FXCollections.observableArrayList();
        while (rs.next()) {
            int idVenta = rs.getInt("id_venta");
            int idUsuario = rs.getInt("id_usuario");
            String cliente = rs.getString("cliente");
            String correo = rs.getString("correo");
            String telefono = rs.getString("telefono");
            String direccion = rs.getString("direccion");
            String dni = rs.getString("dni");
            int idMoto = rs.getInt("id_moto");

            Ventas venta = new Ventas(idVenta, idUsuario, cliente, correo, telefono, direccion, idMoto);
            ventas.add(venta);
        }

        rs.close();
        stmt.close();
        conn.close();
        return ventas;
    }

    public ObservableList<MotocicletaVentas> getMotocicletas() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cesdb2022";
        String user = "root";
        String password = "dbrootpass";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Motocicletas");

        ObservableList<MotocicletaVentas> motocicletas = FXCollections.observableArrayList();
        while (rs.next()) {
            int id = rs.getInt("id_moto");
            String marca = rs.getString("marca");
            String modelo = rs.getString("modelo");
            String matricula = rs.getString("matricula");
            String bastidor = rs.getString("numero_bastidor");

            MotocicletaVentas moto = new MotocicletaVentas(id, marca, modelo, matricula, bastidor);
            motocicletas.add(moto);
        }

        rs.close();
        stmt.close();
        conn.close();
        return motocicletas;
    }
}
