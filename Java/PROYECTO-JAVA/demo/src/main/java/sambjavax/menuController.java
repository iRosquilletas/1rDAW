package sambjavax;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class menuController {

    @FXML
    private void añadir() throws IOException {
        App.setRoot("registro2");
    }

    @FXML
    private void vender() throws IOException {
        App.setRoot("ventas2");
    }

    @FXML
    private void info() throws IOException {
        App.setRoot("informacion");
    }

    @FXML
    private void factura() throws IOException {
        App.setRoot("factura");
    }
}
