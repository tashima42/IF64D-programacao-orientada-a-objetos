package org.example;

public class Main {
    public static void main(String[] args) {
        Pessoa aluno = new Aluno("Jorge", "123", "Engenharia de Software");
        Pessoa professor = new Professor("Fernando", "456", "associado");

       cadastrar(aluno);
       cadastrar(professor);
    }

    private static void cadastrar(Pessoa pessoa) {
        pessoa.cadastrar();
    }
}