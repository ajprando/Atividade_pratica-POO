package org.example;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoa1 = new PessoaFisica("João", "12345678900");
        PessoaFisica pessoa2 = new PessoaFisica("Maria", "98765432100");
        Empresa empresa1 = new Empresa("Minha Empresa", "12345678901234");

        ContaBancaria contaPessoaConjunta = new ContaBancaria(1, pessoa1);
        contaPessoaConjunta.adicionarProprietario(pessoa2);

        ContaBancaria contaEmpresa = new ContaBancaria(2, empresa1);

        contaPessoaConjunta.depositar(100.0);
        contaEmpresa.depositar(2000.0);

        contaPessoaConjunta.imprimirExtrato();
        contaEmpresa.imprimirExtrato();

        contaPessoaConjunta.sacar(30.0);
        contaEmpresa.sacar(500.0);

        contaPessoaConjunta.imprimirExtrato();
        contaEmpresa.imprimirExtrato();
    }
}