package oop.utfpr.produto;

import oop.utfpr.cliente.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorProduto {
    private final Scanner scanner;
    private ArrayList<Produto> produtos = new ArrayList<>();

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
        Produto produto = new Produto(nome, descricao, preco);
        this.produtos.add(produto);
        return produto;
    }

    public ArrayList<Produto> chooseProdutos() throws Exception{
        if (this.produtos.size() < 2) {
            throw new Exception("Não existem pelo menos dois produtos cadastrados.");
        }
        System.out.println("Escolha produtos");
        boolean keepRunning = true;
        ArrayList<Produto> produtos = new ArrayList<>();
        do {
            System.out.println("  1-Adicionar produto");
            System.out.println("  0-Finalizar");
            System.out.print("Digite o comando: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 -> {
                    Produto produto = chooseProduto();
                    produtos.add(produto);
                }
                case 0 -> keepRunning = false;
                default -> System.out.println("Comando inválido!");
            }
        } while (keepRunning);
        return produtos;
    }

    private Produto chooseProduto() {
        System.out.println("Escolha um produto:");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.printf("    %d - %s\n", i, produtos.get(i).getNome());
        }
        System.out.print("Digite o número do produto: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        return produtos.get(option);
    }
}
