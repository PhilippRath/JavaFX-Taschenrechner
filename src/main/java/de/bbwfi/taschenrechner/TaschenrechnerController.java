package de.bbwfi.taschenrechner;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TaschenrechnerController {
    @FXML
    private Label displayLabel;

    @FXML
    protected void onIstgleichButtonPress() {
        displayLabel.setText("999");
    }
}