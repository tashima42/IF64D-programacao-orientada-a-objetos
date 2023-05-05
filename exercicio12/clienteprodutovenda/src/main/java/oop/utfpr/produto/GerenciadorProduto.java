package oop.utfpr.produto;

import oop.utfpr.cliente.Cliente;

import java.util.Scanner;

public class GerenciadorProduto {
    private final Scanner scanner;

    public GerenciadorProduto(Scanner scanner) {
        this.scanner = scanner;
    }

    public Produto createProduto() {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a descrição do produto: ");
        String descricao = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();
        return new Produto(nome, descricao, preco);
    }
}
