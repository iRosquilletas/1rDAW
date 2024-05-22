
package sambjavax;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class informacionController {

    @FXML
    private Button botonVolver;

    public void volver() throws IOException {
        App.setRoot("menu");
    }

}

/*
 * ORDEN PARA EL ATRIBUTO
 * CUAL ES EL ORDEN CORRECTO PARA DEFINIR UN ATRIBUTO
 * CUANTOS CLIENTES TINEN UN DNI QUE TERMINAN POR LA LETRA M
 * CUENTAS SUMAS MEDIAS
 * CREAR TABLAS
 * INSERTAR COSAS EN COLUMNAS
 * CREAME UNA TABLA CON ATRIBUTOS Y QUE RESTRICCIONES
 */