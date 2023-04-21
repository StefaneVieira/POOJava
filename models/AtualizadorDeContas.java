package models;

public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void roda(Conta c) {
        System.out.printf("Saldo anterior: %.2f%n", c.saldo);
        c.atualiza(selic);
        saldoTotal += c.saldo;
        System.out.printf("Saldo atualizado: %.2f%n", c.saldo);
    }
}