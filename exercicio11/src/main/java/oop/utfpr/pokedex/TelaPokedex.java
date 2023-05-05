package oop.utfpr.pokedex;

import oop.utfpr.pokemon.Pokemon;
import oop.utfpr.pokemon.TelaPokemon;

import java.util.ArrayList;

public class TelaPokedex {
    private final Pokedex pokedex;

    public TelaPokedex(Pokedex pokedex) {
        this.pokedex = pokedex;
    }

    public void listPokemons() {
        ArrayList<Pokemon> pokemons = this.pokedex.getPokemons();
        System.out.print("\nPokemons:\n");
        System.out.print("====================\n");
        for (Pokemon pokemon : pokemons) {
            TelaPokemon telaPokemon = new TelaPokemon(pokemon);
            telaPokemon.showInfo();
        }
        System.out.print("====================\n");
    }
}
