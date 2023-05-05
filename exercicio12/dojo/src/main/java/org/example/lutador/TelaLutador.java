package org.example.lutador;

public class TelaLutador {
    private Lutador lutador;

    public TelaLutador(Lutador lutador) {
        this.lutador = lutador;
    }

    public void showInfo() {
        System.out.println("Nome: " + lutador.getName());
        System.out.println("Cod: " + lutador.getCod());
        System.out.println("Endereco: " + lutador.getEndereco());
        System.out.println("Faixa: " + lutador.getFaixa());
    }

}
