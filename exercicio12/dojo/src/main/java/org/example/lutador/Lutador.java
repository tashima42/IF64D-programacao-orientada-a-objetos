package org.example.lutador;

public class Lutador {
    private final String name;
    private final String cod;
    private final String endereco;
    private final Faixa faixa;

    public Lutador(String name, String cod, String endereco, Faixa faixa) {
        this.name = name;
        this.cod = cod;
        this.endereco = endereco;
        this.faixa = faixa;
    }

    public String getName() {
        return name;
    }

    public String getCod() {
        return cod;
    }

    public String getEndereco() {
        return endereco;
    }

    public Faixa getFaixa() {
        return faixa;
    }
}
