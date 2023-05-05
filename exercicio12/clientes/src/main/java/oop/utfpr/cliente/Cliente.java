package oop.utfpr.cliente;

public class Cliente {
    private final String nome;
    private final String cod;

    public Cliente(String nome, String cod) {
        this.nome = nome;
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }
    public String getCod() {
        return cod;
    }
}
