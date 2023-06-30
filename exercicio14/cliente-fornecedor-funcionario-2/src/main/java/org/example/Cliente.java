package org.example;

public class Cliente extends Pessoa{
    private String endereco;

    public Cliente(int id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }
}
