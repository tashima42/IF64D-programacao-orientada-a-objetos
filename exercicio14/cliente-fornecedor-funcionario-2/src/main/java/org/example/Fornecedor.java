package org.example;

public class Fornecedor extends Pessoa implements PessoaDesligavel{
    private String cnpj;

    public Fornecedor(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void desligar() {
        System.out.println("Fornecedor desligado");
    }
}
