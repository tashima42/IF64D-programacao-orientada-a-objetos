package org.example.Produto;

import org.example.Item.Item;

public class Produto extends Item {
    private String descricao;
    private String nome;

    public Produto(int id, String descricao, String nome) {
        this.id = id;
        this.descricao = descricao;
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }
}
