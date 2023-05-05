package org.example;

public abstract class Pessoa {
    protected String nome;
    protected String cod;

    public Pessoa(String nome, String cod) {
        this.nome = nome;
        this.cod = cod;
    }

    public void cadastrar() {
        System.out.println("pessoa cadastrada");
    }
}
