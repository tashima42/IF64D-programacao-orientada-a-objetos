package org.example.Vendedor;

import org.example.Empregado.Empregado;
import org.example.Empregado.GerenciadorEmpregado;
import org.example.Empregado.TelaEmpregado;
import org.example.Operacoes;

import java.util.ArrayList;

public class GerenciadorVendedor implements GerenciadorEmpregado {
    private ArrayList<Vendedor> vendedores = new ArrayList<>();
    private TelaVendedor telaVendedor;

    public GerenciadorVendedor(TelaVendedor telaVendedor) {
        this.telaVendedor = telaVendedor;
    }

    @Override
    public void menu() {
        Operacoes operacao = telaVendedor.menu();
        switch (operacao) {
            case CADASTRAR: {
                String nome = telaVendedor.lerNome();
                double salario = telaVendedor.lerSalario();
                double comissao = telaVendedor.lerComissao();
                Vendedor vendedor = new Vendedor(nome, salario, comissao);
                cadastrar(vendedor);
                break;
            }
            case APRESENTAR: {
                int posicao = telaVendedor.lerPosicao();
                apresentar(posicao);
                break;
            }
            case LISTAR: {
                listar();
                break;
            }
            case VOLTAR:
                break;
            default: menu();
        }
    }

    @Override
    public void cadastrar(Empregado empregado) {
        Vendedor vendedor = (Vendedor) empregado;
        vendedores.add(vendedor);
    }

    @Override
    public void apresentar(int posicao) {
        if (posicao >= vendedores.size()) {
            return;
        }
        Vendedor vendedor = vendedores.get(posicao);
        if (vendedor == null) {
            return;
        }
        telaVendedor.apresentar(vendedor);
    }

    @Override
    public void listar() {
        for (Vendedor vendedor : vendedores) {
            telaVendedor.apresentar(vendedor);
        }
    }
}
