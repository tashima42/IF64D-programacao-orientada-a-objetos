package org.example;

import org.example.Vendedor.GerenciadorVendedor;
import org.example.Vendedor.TelaVendedor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new GerenciadorPrincipal(scanner).menu();
        scanner.close();
    }
}