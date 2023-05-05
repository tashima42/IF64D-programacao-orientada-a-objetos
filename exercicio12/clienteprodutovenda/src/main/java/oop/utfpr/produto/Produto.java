package oop.utfpr.produto;

public class Produto {
    private final String nome;
    private final String descricao;
    private final double preco;

    public Produto(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
}
