package models;

import exceptions.ValorInvalidoException;

public abstract class Conta {
    protected double saldo;
    protected static int uid = 1;
    protected int id;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
        this.id = uid++;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getId() {
        return id;
    }

    public void deposita(double valor) {
        if (valor < 0) {
            throw new ValorInvalidoException(valor);
        } else {
            this.saldo += valor - 0.1;
        }
    }

    public double saca(double valor) {
        return this.saldo -= valor;
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }
}