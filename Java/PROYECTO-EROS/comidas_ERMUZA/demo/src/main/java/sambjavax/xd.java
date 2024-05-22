package sambjavax;

import java.io.IOException;
import javafx.fxml.FXML;

public class xd {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}