package org.example;

import org.example.Gerente.GerenciadorGerente;
import org.example.Gerente.TelaGerente;
import org.example.Vendedor.GerenciadorVendedor;
import org.example.Vendedor.TelaVendedor;

import java.util.Scanner;

public class GerenciadorPrincipal {
    private Scanner scanner;
    private GerenciadorVendedor gerenciadorVendedor;
    private GerenciadorGerente gerenciadorGerente;

    public GerenciadorPrincipal(Scanner scanner) {
        this.scanner = scanner;
        TelaVendedor telaVendedor = new TelaVendedor(scanner);
        gerenciadorVendedor = new GerenciadorVendedor(telaVendedor);
        TelaGerente telaGerente = new TelaGerente(scanner);
        gerenciadorGerente = new GerenciadorGerente(telaGerente);
    }

    public void menu() {
        Boolean continueRunning = true;
        do {
            System.out.println("1 - Vendedor");
            System.out.println("2 - Gerente");
            System.out.println("3 - Sair");
            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1 -> gerenciadorVendedor.menu();
                case 2 -> gerenciadorGerente.menu();
                case 3 -> continueRunning = false;
                default -> {
                    System.out.println("Opção inválida!");
                    break;
                }
            }
        } while (continueRunning);
    }
}
