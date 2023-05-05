package oop.utfpr;

import oop.utfpr.cliente.Cliente;
import oop.utfpr.cliente.GerenciadorCliente;
import oop.utfpr.produto.GerenciadorProduto;
import oop.utfpr.produto.Produto;
import oop.utfpr.venda.GerenciadorVenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Command {
    private final Scanner scanner;
    private final GerenciadorCliente gerenciadorCliente;
    private final GerenciadorProduto gerenciadorProduto;
    private final GerenciadorVenda gerenciadorVenda;

    public Command(Scanner scanner) {
        this.scanner = scanner;
        this.gerenciadorCliente = new GerenciadorCliente(scanner);
        this.gerenciadorProduto = new GerenciadorProduto(scanner);
        this.gerenciadorVenda = new GerenciadorVenda(scanner);
    }

    public void run() {
        System.out.println("Bem vindo ao sistema de vendas!");
        boolean keepRunning = true;
        do {
            System.out.println("  1-Cadastrar cliente");
            System.out.println("  2-Cadastrar produto");
            System.out.println("  3-Cadastrar venda");
            System.out.println("  0-Sair");
            System.out.print("Digite o comando: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 -> cadastrarCliente();
                case 2 -> cadastrarProduto();
                case 3 -> cadastrarVenda();
                case 0 -> keepRunning = false;
                default -> System.out.println("Comando inválido!");
            }
        } while (keepRunning);
    }

    private void cadastrarCliente() {
        this.gerenciadorCliente.createCliente();
    }

    private void cadastrarProduto() {
        this.gerenciadorProduto.createProduto();
    }

    private void cadastrarVenda() {
        try {
            Cliente cliente = this.gerenciadorCliente.chooseCliente();
            ArrayList<Produto> produtos = this.gerenciadorProduto.chooseProdutos();
            this.gerenciadorVenda.createVenda(cliente, produtos);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
