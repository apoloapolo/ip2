module com.example.testefxintellij {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.testefxintellij to javafx.fxml;
    exports com.example.testefxintellij;
}