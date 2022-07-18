module com.example.momandpopspizzeria {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.momandpopspizzeria to javafx.fxml;
    exports com.example.momandpopspizzeria;
    exports com.example.momandpopspizzeria.Controllers;
    opens com.example.momandpopspizzeria.Controllers to javafx.fxml;
}