package org.example.Cliente;

import org.example.Item.Item;

public class Cliente extends Item {
    private String endereco;
    private String nome;

    public Cliente(int id, String endereco, String nome) {
        this.id = id;
        this.endereco = endereco;
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }
}
