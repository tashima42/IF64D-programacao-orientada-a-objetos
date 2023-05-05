package org.example;

public class Aluno extends Pessoa {
    private final String curso;
    public Aluno(String nome, String cod, String curso) {
        super(nome, cod);
        this.curso = curso;
    }

    @Override
    public void cadastrar() {
        System.out.println("aluno cadastrado");
    }
}
