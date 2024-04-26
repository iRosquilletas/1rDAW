module sambjavax {
    requires javafx.controls;
    requires javafx.fxml;

    opens sambjavax to javafx.fxml;
    exports sambjavax;
}
