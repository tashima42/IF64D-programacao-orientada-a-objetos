package oop.utfpr.pokedex;

import oop.utfpr.pokemon.Pokemon;

import java.util.ArrayList;

public class Pokedex {
    private final ArrayList<Pokemon> pokemons;
    public Pokedex () {
        this.pokemons = new ArrayList<Pokemon>();
    }

    public void addPokemon(Pokemon pokemon) throws Exception {
        this.pokemons.add(pokemon);
    }

    public void updatePokemon(Pokemon pokemon, int position) throws Exception {
        this.pokemons.set(position, pokemon);
    }

    public Pokemon getPokemon(int position) throws Exception {
        if (positionIsEmpty(position)) {
            throw new Exception("there is no pokemon in this position");
        }
        return this.pokemons.get(position);
    }

    public ArrayList<Pokemon> getPokemons() {
        return this.pokemons;
    }

    private boolean positionIsEmpty(int position) {
        if (this.pokemons.get(position) == null) {
            return true;
        }
        return false;
    }
}
