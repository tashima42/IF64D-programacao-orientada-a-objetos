package oop.utfpr.cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorCliente {
    private Scanner scanner;
    private ArrayList<Cliente> clientes;

    public GerenciadorCliente(Scanner scanner) {
        this.scanner = scanner;
        clientes = new ArrayList<>();
    }

    public void addCliente() {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o código do cliente: ");
        String cod = scanner.nextLine();
        clientes.add(new Cliente(nome, cod));
    }

    public void showClientesInfo() {
        for (Cliente cliente : clientes) {
            TelaCliente telaCliente = new TelaCliente(cliente);
            telaCliente.showInfo();
            System.out.println("--------------------");
        }
    }
}
