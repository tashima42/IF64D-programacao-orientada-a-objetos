package org.example.lutador;

import java.util.Scanner;

public class GerenciadorLutador {
    private final Scanner scanner;

    public GerenciadorLutador(Scanner scanner) {
        this.scanner = scanner;
    }

    public Lutador createLutador() {
        System.out.print("Digite o nome do lutador: ");
        String name = scanner.nextLine();
        System.out.print("Digite o cod do lutador: ");
        String cod = scanner.nextLine();
        System.out.print("Digite o endereco do lutador: ");
        String endereco = scanner.nextLine();
        Faixa faixa = this.selectFaixa();
        return new Lutador(name, cod, endereco, faixa);
    }

    private Faixa selectFaixa() {
        System.out.println("Selecione a faixa do lutador: ");
        System.out.println("1 - Branca");
        System.out.println("2 - Azul");
        System.out.println("3 - Roxa");
        System.out.println("4 - Marrom");
        System.out.println("5 - Preta");
        System.out.print("Faixa: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case 1:
                return Faixa.BRANCA;
            case 2:
                return Faixa.AZUL;
            case 3:
                return Faixa.ROXA;
            case 4:
                return Faixa.MARROM;
            case 5:
                return Faixa.PRETA;
            default:
                throw new IllegalArgumentException("Opção inválida");
        }
    }
}
