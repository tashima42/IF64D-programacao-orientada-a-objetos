package oop.utfpr.venda;

import oop.utfpr.cliente.Cliente;
import oop.utfpr.produto.Produto;

import java.util.ArrayList;

public class Venda {
    private final String codigo;
    private final Cliente cliente;
    private ArrayList<Produto> produtos;

    public Venda(String codigo, Cliente cliente, ArrayList<Produto> produtos) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.produtos = produtos;
    }
}
