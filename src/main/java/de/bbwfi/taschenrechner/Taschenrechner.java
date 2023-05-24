package de.bbwfi.taschenrechner;

public class Taschenrechner {
    private double ergebniss;
    private double zwischenspeicher;

    public void add(double eingabe) {
        this.ergebniss += eingabe;
    }

    public void sub(double eingabe) {
        this.ergebniss -= eingabe;
    }

    public void mul(double eingabe) {
        this.ergebniss *= eingabe;
    }

    public void div(double eingabe) {
        this.ergebniss /= eingabe;
    }

    public void ac()    {
        this.ergebniss = 0;
    }

}
