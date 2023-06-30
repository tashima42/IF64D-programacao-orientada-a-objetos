package org.example.Gerente;

import org.example.Empregado.Empregado;
import org.example.Empregado.GerenciadorEmpregado;
import org.example.Operacoes;

public class GerenciadorGerente implements GerenciadorEmpregado {
    private Gerente[] gerentes = new Gerente[5];
    private int numeroGerentes = 0;
    private TelaGerente telaGerente;

    public GerenciadorGerente(TelaGerente TelaGerente) {
        this.telaGerente = TelaGerente;
    }

    @Override
    public void menu() {
        Operacoes operacao = telaGerente.menu();
        switch (operacao) {
            case CADASTRAR: {
                String nome = telaGerente.lerNome();
                double salario = telaGerente.lerSalario();
                String departamento = telaGerente.lerDepartamento();
                Gerente gerente = new Gerente(nome, salario, departamento);
                cadastrar(gerente);
                break;
            }
            case APRESENTAR: {
                int posicao = telaGerente.lerPosicao();
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
        Gerente gerente = (Gerente) empregado;
        gerentes[numeroGerentes] = gerente;
        numeroGerentes++;
    }

    @Override
    public void apresentar(int posicao) {
        if (posicao >= numeroGerentes) {
            return;
        }
        telaGerente.apresentar(gerentes[posicao]);
    }

    @Override
    public void listar() {
        for (int i = 0; i < numeroGerentes; i++) {
            telaGerente.apresentar(gerentes[i]);
        }
    }
}
