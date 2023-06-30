package org.example;

import java.util.ArrayList;

public abstract class Pessoa {
    protected int id;
    protected String nome;
    protected ArrayList<String> comunicados = new ArrayList<String>();

    public void comunicado(String comunicado) {
        this.comunicados.add(comunicado);
    };

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<String> getComunicados() {
        return comunicados;
    }
}
