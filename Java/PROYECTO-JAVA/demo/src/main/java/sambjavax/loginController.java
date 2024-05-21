/*package sambjavax;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class loginController {

    @FXML
    private TextField XD;

    @FXML
    private TextField XDD;

    public void login() throws IOException {
        String username = XD.getText();
        String password = XDD.getText();

        if (username.equals("0001") && password.equals("0001")) {

            App.setRoot("menu");

        } else {

        }
    }
}
*/
package sambjavax;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginController {

    private static final String URL = "jdbc:mysql://localhost:33006/cantmoto";
    private static final String USER = "root";
    private static final String PASSWORD = "dbrootpass";

    @FXML
    private TextField XD;
    @FXML
    private TextField XDD;

    @FXML
    private void cambiarDeFMXL() throws IOException {
        String nombre = XD.getText();
        String contraseña = XDD.getText();

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "SELECT * FROM Usuarios WHERE numero_empleado = ? AND contrasena = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setString(2, contraseña);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                FXMLLoader loader = new FXMLLoader();
                Parent root = null;

                if (rango.equals("JefeSala") || rango.equals("Camarero")) {
                    loader.setLocation(getClass().getResource("camarero.fxml"));
                    root = loader.load();
                    CamareroController controller = loader.getController();
                    controller.setId(this.id); // Pasar el ID al siguiente controlador
                } else if (rango.equals("Cocinero")) {
                    loader.setLocation(getClass().getResource("cocina.fxml"));
                    root = loader.load();
                }

                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();

            } else {
                showAlert("Error al iniciar sesión: Valores incorrectos");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            showAlert("Error al conectar con la base de datos: " + e.getMessage());
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public String getId() {
        return id;
    }
}