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

public class RegistroController {

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

    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            ObservableList<Registro> registro = getRegistro();
            bastidor.setCellValueFactory(new PropertyValueFactory<>("numero_bastidor"));
            marca.setCellValueFactory(new PropertyValueFactory<>("marca"));
            matricula.setCellValueFactory(new PropertyValueFactory<>("matricula"));
            modelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
            id.setCellValueFactory(new PropertyValueFactory<>("id"));
            tablaRegistro.setItems(registro);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Registro> getRegistro() throws SQLException {
        String url = "jdbc:mysql://localhost:33006/cesdb2022";
        String user = "root";
        String password = "dbrootpass";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Motocicletas");

        ObservableList<Registro> registro = FXCollections.observableArrayList();
        while (rs.next()) {
            int id = rs.getInt("id");
            String bastidor = rs.getString("numero_bastidor");
            String marca = rs.getString("marca");
            String matricula = rs.getString("matricula");
            String modelo = rs.getString("modelo");

            Registro registros = new Registro(id, bastidor, marca, matricula, modelo);
            registro.add(registros);
        }

        tablaRegistro.setItems(registro);
        rs.close();
        stmt.close();
        conn.close();
        return registro;
    }

}
