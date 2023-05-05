package org.example;

public class Professor extends Pessoa {
    private final String titulacao;
    public Professor(String nome, String cod, String titulacao) {
        super(nome, cod);
        this.titulacao = titulacao;
    }

    @Override
    public void cadastrar() {
        System.out.println("professor cadastrado");
    }
}
