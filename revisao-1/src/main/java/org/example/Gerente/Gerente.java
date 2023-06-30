package org.example.Gerente;

import org.example.Empregado.Empregado;

public class Gerente extends Empregado {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}
