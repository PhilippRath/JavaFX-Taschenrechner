package de.bbwfi.taschenrechner;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public abstract class TaschenrechnerController {
    private Taschenrechner taschenrechner;

    @FXML
    private Label displayLabel;
    public void initialize(){
        taschenrechner = new Taschenrechner();
    };
    protected  void onZeroButtonPress() {
        String displayText = displayLabel.getText();
        if (!displayText.equals("0")) {
            displayLabel.setText(displayText + "0");
        }
    }
    @FXML
    protected void onIstgleichButtonPress() {
        String displayText = displayLabel.getText();

        displayLabel.setText(displayText + "9");
    }
}