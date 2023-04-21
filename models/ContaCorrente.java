package models;

import interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {
    private double taxa = 0.1;

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo, double taxa) {
        super(saldo);
        this.taxa = taxa;
    }

    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public final void atualiza(double taxa) {
        super.atualiza(taxa * 2);
    }

    @Override
    public void deposita(double valor) {
        this.saldo += valor - taxa;
    }

    public double calculaTributos() {
        return this.saldo * 0.01;
    }
}