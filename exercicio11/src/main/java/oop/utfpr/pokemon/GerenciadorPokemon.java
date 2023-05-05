package oop.utfpr.pokemon;

import java.util.Scanner;

public class GerenciadorPokemon {
    private final Scanner scanner;
    private Pokemon pokemon;
    private TelaPokemon telaPokemon;

    public GerenciadorPokemon(Scanner scanner) {
        this.scanner = scanner;
    }

    public Pokemon createPokemon() {
        System.out.print("Digite o nome do pokemon: ");
        String nome = this.scanner.nextLine();
        this.pokemon = new Pokemon(nome);
        return this.pokemon;
    }

    private void showInfo() {
        this.telaPokemon = new TelaPokemon(this.pokemon);
        this.telaPokemon.showInfo();
    }
}
