package com.jornada.exercicio2.entities;

public class ContaBancaria implements Sacavel, Depositavel{
    private Integer numeroDaConta;
    private String nomeDoTitular;
    private Double saldo;

    public ContaBancaria(Integer numeroDaConta, String nomeDoTitular, Double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldo;
    }

    @Override
    public void sacar(Double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de R$" + valor + ".");
        }
    }
    @Override
    public void depositar(Double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
        }
    }
    public void exibirSaldo() {
        System.out.println("Saldo atual em conta: R$" + saldo);
    }

    @Override
    public String toString() {
        return "\n===== ContaBancaria =====" +
                "\nNúmeroDaConta: " + numeroDaConta +
                "\nNomeDoTitular: " + nomeDoTitular +
                "\nSaldo: " + saldo;
    }
}
