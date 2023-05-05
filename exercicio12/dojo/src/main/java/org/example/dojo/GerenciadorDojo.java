package org.example.dojo;

import org.example.lutador.GerenciadorLutador;
import org.example.lutador.Lutador;
import org.example.lutador.TelaLutador;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDojo {
    private final Scanner scanner;
    private ArrayList<Lutador> lutadores;
    private GerenciadorLutador gerenciadorLutador;

    public GerenciadorDojo(Scanner scanner) {
        this.scanner = scanner;
        this.lutadores = new ArrayList<>();
        this.gerenciadorLutador = new GerenciadorLutador(this.scanner);
    }

    public void insertLutador() {
        Lutador lutador = gerenciadorLutador.createLutador();
        lutadores.add(lutador);
    }

    public void updateLutador() {
        System.out.print("Digite a posição do lutador que deseja alterar: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        Lutador lutador = gerenciadorLutador.createLutador();
        lutadores.set(index, lutador);
    }

    public void showLutador() {
        System.out.print("Digite a posição do lutador que deseja visualizar: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        Lutador lutador = lutadores.get(index);
        new TelaLutador(lutador).showInfo();
    }

    public void showLutadores() {
        System.out.println("==============");
        for (Lutador lutador : lutadores) {
            new TelaLutador(lutador).showInfo();
            System.out.println("-------");
        }
        System.out.println("==============");
    }
}
