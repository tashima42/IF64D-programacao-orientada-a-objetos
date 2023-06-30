package org.example.Empregado;

// Uma classe abstrata não pode ser instanciada
// isso garante que a classe não vai ser usada de forma errada
// e apenas como uma classe base para outras classes
public abstract class Empregado {
    protected String nome;
    protected double salario;

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
