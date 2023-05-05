package org.example;

import org.example.dojo.GerenciadorDojo;

import java.util.Scanner;

public class Command {
    private final Scanner scanner;
    private final GerenciadorDojo gerenciadorDojo;

    public Command(Scanner scanner) {
        this.scanner = scanner;
        this.gerenciadorDojo = new GerenciadorDojo(this.scanner);
    }

    public void run() {
        System.out.println("Sistema de gerenciamento de dojos!");
        boolean keepRunning = true;
        do {
            System.out.println("1-Inserir novo lutador");
            System.out.println("2-Alterar lutador existente");
            System.out.println("3-Apresentar dados de um lutador");
            System.out.println("4-Apresentar lista de lutadores");
            System.out.println("0-Sair.");
            System.out.print("Digite o comando desejado: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 -> insertLutador();
                case 2 -> updateLutador();
                case 3 -> showLutador();
                case 4 -> showLutadores();
                case 0 -> keepRunning = false;
                default -> System.out.println("Comando inválido!");
            }
        } while (keepRunning);
    }

    private void insertLutador() {
        System.out.println("Inserindo novo lutador...");
        gerenciadorDojo.insertLutador();
    }

    private void updateLutador() {
        System.out.println("Alterando lutador...");
        gerenciadorDojo.updateLutador();
    }

    private void showLutador() {
        System.out.println("Apresentando dados de um lutador...");
        gerenciadorDojo.showLutador();
    }

    private void showLutadores() {
        System.out.println("Apresentando lista de lutadores...");
        gerenciadorDojo.showLutadores();
    }
}
