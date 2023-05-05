package org.example;

public class TelaEngenheiro {
    private Engenheiro engenheiro;

    public TelaEngenheiro(Engenheiro engenheiro) {
        this.engenheiro = engenheiro;
    }

    public void apresentar() {
        System.out.printf("Nome: %s\nCod: %s\nSalario: %.2f", this.engenheiro.getNome(), this.engenheiro.getCod(), this.engenheiro.getSalario());
    }
}
