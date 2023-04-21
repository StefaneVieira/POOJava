package main;

import models.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Conta c = new ContaCorrente();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        List<Conta> list = new ArrayList<>();

        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);

        System.out.println("Parte 1:");
        System.out.println(" ");
        System.out.printf("%.2f%n", c.getSaldo());
        System.out.printf("%.2f%n", cc.getSaldo());
        System.out.printf("%.2f%n", cp.getSaldo());

        System.out.println(" ");
        System.out.println("Parte 2:");
        System.out.println(" ");

        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);

        System.out.printf("Saldo Total: %.2f%n", adc.getSaldoTotal());

        System.out.println(" ");
        System.out.println("Parte 3:");

        Conta a = new ContaCorrente(500.00, 0.03);
        Conta b = new ContaCorrente(300.00, 0.1);
        Conta g = new ContaPoupanca(1000.00);
        Conta d = new ContaCorrente(500.00, 0.01);
        Conta f = new ContaCorrente(400.00, 0.02);
        Conta h = new ContaPoupanca(400.00);

        list.add(a);
        list.add(b);
        list.add(g);
        list.add(d);
        list.add(f);
        list.add(h);

        for (Conta conta : list) {
            System.out.println("\nDados da conta #" + conta.getId() + ":");
            adc.roda(conta);
        }
    }
}