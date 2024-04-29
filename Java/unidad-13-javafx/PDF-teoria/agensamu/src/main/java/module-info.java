module agendasamuel {
    requires javafx.controls;
    requires javafx.fxml;

    opens agendasamuel to javafx.fxml;

    exports agendasamuel;
}
