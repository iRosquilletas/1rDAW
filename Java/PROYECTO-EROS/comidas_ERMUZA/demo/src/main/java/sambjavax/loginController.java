
package sambjavax;

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
