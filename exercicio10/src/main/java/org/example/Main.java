package org.example;
public class Main {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro();
        engenheiro.setNome("Rodrigo");
        engenheiro.setCod("1");
        engenheiro.setSalario(10000);

        Arquiteto arquiteto = new Arquiteto();
        arquiteto.setNome("Marcos");
        arquiteto.setCod("2");
        arquiteto.setBonus(3000);

        TelaArquiteto telaArquiteto = new TelaArquiteto(arquiteto);
        telaArquiteto.apresentar();

        System.out.printf("\n\n");
        TelaEngenheiro telaEngenheiro = new TelaEngenheiro(engenheiro);
        telaEngenheiro.apresentar();
    }
}