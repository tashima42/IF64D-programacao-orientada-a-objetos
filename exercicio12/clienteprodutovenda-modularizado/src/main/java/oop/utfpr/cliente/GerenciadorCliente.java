package oop.utfpr.cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorCliente {
    private final Scanner scanner;
    private ArrayList<Cliente> clientes = new ArrayList<>();

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
        Cliente cliente =  new Cliente(nome, endereco, codigo);
        this.clientes.add(cliente);
        return cliente;
    }

    public Cliente chooseCliente() throws Exception {
        if (this.clientes.size() < 1) {
            throw new Exception("Não há clientes cadastrados.");
        }
        System.out.println("Escolha um cliente:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.printf("  %d - %s (%s)\n", i, clientes.get(i).getNome(), clientes.get(i).getCodigo());
        }
        System.out.print("Digite o número do cliente: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        return clientes.get(option);
    }
}
