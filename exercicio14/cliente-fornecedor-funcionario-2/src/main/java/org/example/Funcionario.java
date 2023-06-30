package org.example;

public class Funcionario extends Pessoa implements PessoaDesligavel{
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void desligar() {
        System.out.println("Funcionario desligado");
    }
}
