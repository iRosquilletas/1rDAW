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

public class RegistroController implements Initializable {

    @FXML
    private TableView<Registro> tablaRegistro;

    @FXML
    private TableColumn<Registro, Integer> id;
    @FXML
    private TableColumn<Registro, String> bastidor;
    @FXML
    private TableColumn<Registro, String> marca;
    @FXML
    private TableColumn<Registro, String> matricula;
    @FXML
    private TableColumn<Registro, String> modelo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        id.setCellValueFactory(new PropertyValueFactory<>("id_moto"));
        bastidor.setCellValueFactory(new PropertyValueFactory<>("bastidor"));
        marca.setCellValueFactory(new PropertyValueFactory<>("marca"));
        matricula.setCellValueFactory(new PropertyValueFactory<>("matricula"));
        modelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));

        try {
            ObservableList<Registro> registros = getRegistro();
            tablaRegistro.setItems(registros);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Registro> getRegistro() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cesdb2022";
        String user = "root";
        String password = "dbrootpass";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Motocicletas");

        ObservableList<Registro> registros = FXCollections.observableArrayList();
        while (rs.next()) {
            int id = rs.getInt("id_moto");
            String bastidor = rs.getString("numero_bastidor");
            String marca = rs.getString("marca");
            String matricula = rs.getString("matricula");
            String modelo = rs.getString("modelo");

            Registro registro = new Registro(id, bastidor, marca, matricula, modelo);
            registros.add(registro);
        }
        tablaRegistro.setItems(registros);
        rs.close();
        stmt.close();
        conn.close();
        return registros;
    }
}
