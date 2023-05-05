package oop.utfpr;

import java.util.ArrayList;
import java.util.Scanner;

import oop.utfpr.cliente.Cliente;
import oop.utfpr.cliente.GerenciadorCliente;
import oop.utfpr.produto.GerenciadorProduto;
import oop.utfpr.produto.Produto;
import oop.utfpr.venda.GerenciadorVenda;
import oop.utfpr.venda.Venda;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorCliente gerenciadorCliente = new GerenciadorCliente(scanner);
        GerenciadorProduto gerenciadorProduto = new GerenciadorProduto(scanner);
        GerenciadorVenda gerenciadorVenda = new GerenciadorVenda(scanner);

        Cliente cliente = gerenciadorCliente.createCliente();
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(gerenciadorProduto.createProduto());
        produtos.add(gerenciadorProduto.createProduto());
        Venda venda = gerenciadorVenda.createVenda(cliente, produtos);
    }
}