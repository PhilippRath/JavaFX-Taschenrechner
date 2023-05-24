package de.bbwfi.taschenrechner;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TaschenrechnerController {

    @FXML
    private Label displayLabel;

    @FXML
    protected void onIstgleichButtonPress() {
        String displayText = displayLabel.getText();

        displayLabel.setText(displayText + "9");

    }
}