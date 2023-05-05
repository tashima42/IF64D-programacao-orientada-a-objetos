package oop.utfpr.pokedex;

import oop.utfpr.pokemon.GerenciadorPokemon;
import oop.utfpr.pokemon.Pokemon;
import oop.utfpr.pokemon.TelaPokemon;

import java.util.Scanner;

public class GerenciadorPokedex {
    private final Scanner scanner;
    private Pokedex pokedex;
    private TelaPokedex telaPokedex;
    public GerenciadorPokedex(Scanner scanner) {
        this.scanner = scanner;
        this.pokedex = new Pokedex();
        this.telaPokedex = new TelaPokedex(this.pokedex);
    }

    public void createPokemon() throws Exception {
        GerenciadorPokemon gerenciadorPokemon = new GerenciadorPokemon(this.scanner);
        Pokemon pokemon = gerenciadorPokemon.createPokemon();
        this.pokedex.addPokemon(pokemon);
    }

    public void updatePokemon() throws Exception {
        System.out.print("\nPosição: ");
        int position;
        try {
            position = Integer.parseInt(this.scanner.nextLine());
        } catch(Exception e) {
            System.out.println("Posição inválida");
            return;
        }
        try {
            GerenciadorPokemon gerenciadorPokemon = new GerenciadorPokemon(this.scanner);
            Pokemon pokemon = gerenciadorPokemon.createPokemon();
            this.pokedex.updatePokemon(pokemon, position);
        } catch(Exception e) {
            System.out.print(e.getMessage());
        }
    }

    public void showPokemonInfo() throws Exception {
        System.out.print("\nPosição: ");
        int position;
        try {
            position = Integer.parseInt(this.scanner.nextLine());
        } catch(Exception e) {
            System.out.println("Posição inválida");
            return;
        }
        Pokemon pokemon = this.pokedex.getPokemon(position);
        TelaPokemon telaPokemon = new TelaPokemon(pokemon);
        telaPokemon.showInfo();
    }

    public void listPokemons() {
        this.telaPokedex.listPokemons();
    }
}
