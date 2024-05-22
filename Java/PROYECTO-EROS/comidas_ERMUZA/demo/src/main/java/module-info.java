module sambjavax {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens sambjavax to javafx.fxml;
    exports sambjavax;
}
