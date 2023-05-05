package oop.utfpr.pokedex;

import oop.utfpr.pokemon.Pokemon;

import java.util.ArrayList;

public class Pokedex {
    private final Pokemon[] pokemons;
    private int lastPokemonPosition;

    public Pokedex () {
        this.pokemons = new Pokemon[5];
        this.lastPokemonPosition = 0;
    }

    public void addPokemon(Pokemon pokemon) throws Exception {
        if (this.lastPokemonPosition == 5) {
            throw new Exception("pokedex is full");
        }
        this.pokemons[this.lastPokemonPosition] = pokemon;
        this.lastPokemonPosition++;
    }

    public void updatePokemon(Pokemon pokemon, int position) throws Exception {
        if (!checkPositionRange(position)) {
            throw new Exception("position out of range");
        }
        this.pokemons[position] = pokemon;
    }

    public Pokemon getPokemon(int position) throws Exception {
        if (!checkPositionRange(position)) {
            throw new Exception("position out of range");
        }
        if (positionIsEmpty(position)) {
            throw new Exception("there is no pokemon in this position");
        }
        return this.pokemons[position];
    }

    public ArrayList<Pokemon> getPokemons() {
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        for (int i = 0; i < 5; i++) {
            boolean p = positionIsEmpty(i);
           if (!p) {
                pokemons.add(this.pokemons[i]);
           } else {
               break;
           }
        }
        return pokemons;
    }

    private boolean checkPositionRange(int position) {
        if (position < 0 || position > 4) {
            return false;
        }
        return true;
    }

    private boolean positionIsEmpty(int position) {
        if (this.pokemons[position] == null) {
            return true;
        }
        return false;
    }
}
