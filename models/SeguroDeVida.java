package models;

import interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {

    public double calculaTributos() {
        return 42;
    }
}