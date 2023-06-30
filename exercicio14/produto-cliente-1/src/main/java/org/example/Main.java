package org.example;

import org.example.Cliente.GerenciadorCliente;
import org.example.Cliente.Cliente;
import org.example.Produto.GerenciadorProduto;
import org.example.Produto.Produto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Produto
        GerenciadorProduto gerenciadorProduto = new GerenciadorProduto();
        gerenciadorProduto.cadastrar(new Produto( 1, "Produto 1", "Descrição 1"));
        gerenciadorProduto.cadastrar(new Produto( 2, "Produto 2", "Descrição 2"));
        gerenciadorProduto.cadastrar(new Produto( 3, "Produto 3", "Descrição 3"));
        gerenciadorProduto.cadastrar(new Produto( 4, "Produto 4", "Descrição 4"));

        gerenciadorProduto.listar();

        gerenciadorProduto.excluir(2);
        gerenciadorProduto.atualizar(1, new Produto( 1, "Produto 1 atualizado", "Descrição 1 atualizada"));

        gerenciadorProduto.listar();

        // Cliente
        GerenciadorCliente gerenciadorCliente = new GerenciadorCliente();
        gerenciadorCliente.cadastrar(new Cliente( 1, "Cliente 1", "Descrição 1"));
        gerenciadorCliente.cadastrar(new Cliente( 2, "Cliente 2", "Descrição 2"));
        gerenciadorCliente.cadastrar(new Cliente( 3, "Cliente 3", "Descrição 3"));
        gerenciadorCliente.cadastrar(new Cliente( 4, "Cliente 4", "Descrição 4"));

        gerenciadorCliente.listar();

        gerenciadorCliente.excluir(2);
        gerenciadorCliente.atualizar(1, new Cliente( 1, "Cliente 1 atualizado", "Descrição 1 atualizada"));

        gerenciadorCliente.listar();
    }
}