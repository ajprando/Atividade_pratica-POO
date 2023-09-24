package org.example;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    //atributos
    private int numero;
    private double saldo;
    private List<Proprietario> proprietarios = new ArrayList<>();

    //construtor
    public ContaBancaria(int numero, Proprietario proprietario) {
        this.numero = numero;
        this.proprietarios.add(proprietario);
        this.saldo = 0.0;
    }

    //metodos
    public void adicionarProprietario(Proprietario proprietario) {
        if (proprietarios.size() < 2 && verificaTipoProprietario(proprietario)) {
            proprietarios.add(proprietario);
        } else {
            System.out.println("Conta já possui o máximo de proprietários ou o tipo de proprietário não é válido.");
        }
    }

    private boolean verificaTipoProprietario(Proprietario proprietario) {
        return proprietario instanceof PessoaFisica;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirExtrato() {
        System.out.println("Extrato da conta número: " + numero);
        System.out.println("Saldo: R$" + saldo);
    }
}

