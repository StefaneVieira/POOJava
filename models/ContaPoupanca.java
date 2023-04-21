package models;

public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public final void atualiza(double taxa) {
        super.atualiza(taxa * 3);
    }
}