package oop.utfpr.venda;

import oop.utfpr.cliente.Cliente;
import oop.utfpr.produto.GerenciadorProduto;
import oop.utfpr.produto.Produto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorVenda {
    private final Scanner scanner;

    public GerenciadorVenda(Scanner scanner) {
        this.scanner = scanner;
    }

    public Venda createVenda(Cliente cliente, ArrayList<Produto> produtos) {
        if (produtos.size() < 2) {
            System.out.println("É necessário ter pelo menos 2 produtos para criar uma venda.");
            return null;
        }
        System.out.print("Digite o código da venda: ");
        String codigo = scanner.nextLine();
        return new Venda(codigo, cliente, produtos);
    }
}
