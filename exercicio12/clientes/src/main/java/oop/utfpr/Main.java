package oop.utfpr;

import oop.utfpr.cliente.GerenciadorCliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorCliente gerenciadorCliente = new GerenciadorCliente(scanner);
        for (int i = 0; i < 10; i++) {
            gerenciadorCliente.addCliente();
        }
        gerenciadorCliente.showClientesInfo();
        scanner.close();
    }
}