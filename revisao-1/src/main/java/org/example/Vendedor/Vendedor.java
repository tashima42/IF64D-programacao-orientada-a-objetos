package org.example.Vendedor;

import org.example.Empregado.Empregado;

public class Vendedor extends Empregado {
    private double comissao;

    public Vendedor(String nome, double salario, double comissao) {
        this.nome = nome;
        this.salario = salario;
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }
}
