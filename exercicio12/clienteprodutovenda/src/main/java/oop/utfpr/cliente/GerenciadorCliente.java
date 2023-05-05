package oop.utfpr.cliente;

import java.util.Scanner;

public class GerenciadorCliente {
    private final Scanner scanner;

    public GerenciadorCliente(Scanner scanner) {
        this.scanner = scanner;
    }

    public Cliente createCliente() {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o endereço do cliente: ");
        String endereco = scanner.nextLine();
        System.out.print("Digite o código do cliente: ");
        String codigo = scanner.nextLine();
        return new Cliente(nome, endereco, codigo);
    }
}
