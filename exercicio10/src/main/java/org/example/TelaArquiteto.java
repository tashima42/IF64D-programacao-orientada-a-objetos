package org.example;

public class TelaArquiteto {
    private Arquiteto arquiteto;

    public TelaArquiteto(Arquiteto arquiteto) {
        this.arquiteto = arquiteto;
    }

    public void apresentar() {
        System.out.printf("Nome: %s\nCod: %s\nBonus: %.2f", this.arquiteto.getNome(), this.arquiteto.getCod(), this.arquiteto.getBonus());
    }
}
