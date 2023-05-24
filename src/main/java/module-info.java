module de.bbwfi.taschenrechner {
    requires javafx.controls;
    requires javafx.fxml;

    opens de.bbwfi.taschenrechner to javafx.fxml;
    exports de.bbwfi.taschenrechner;
}