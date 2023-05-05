package oop.utfpr;

import oop.utfpr.pokedex.GerenciadorPokedex;
import oop.utfpr.pokedex.Pokedex;
import oop.utfpr.pokedex.TelaPokedex;
import oop.utfpr.pokemon.Pokemon;

import java.util.Scanner;

public class Command {
    private final Scanner scanner;
    private boolean keepRunning;
    private final GerenciadorPokedex gerenciadorPokedex;

    public Command(Scanner scanner) {
        this.scanner = scanner;
        this.keepRunning = true;
        this.gerenciadorPokedex = new GerenciadorPokedex(this.scanner);
    }

    public void run() {
        do {
            System.out.print("1-Criar pokemon\n2-Atualizar pokemon\n3-Apresentar 1 pokemon\n4-Apresentar lista de pokemon\n0-Sair\nEscolha: ");
            int option;
            try {
                option = Integer.parseInt(this.scanner.nextLine());
            } catch(Exception e) {
                option = -1;
            }
            switch (option) {
                case 1 -> createPokemon();
                case 2 -> updatePokemon();
                case 3 -> showPokemonInfo();
                case 4 -> showPokemonList();
                case 0 -> this.keepRunning = false;
                default -> System.out.println("Opção inválida, tente novamente\n");
            }
        } while (keepRunning);
    }

    private void createPokemon() {
        try {
            this.gerenciadorPokedex.createPokemon();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private void updatePokemon() {
        try {
            this.gerenciadorPokedex.updatePokemon();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void showPokemonInfo() {
        try {
            this.gerenciadorPokedex.showPokemonInfo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private void showPokemonList() {
        this.gerenciadorPokedex.listPokemons();
    }
}
