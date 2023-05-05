package oop.utfpr.pokemon;

public class TelaPokemon {
    private final Pokemon pokemon;

    public TelaPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void showInfo() {
        System.out.printf("Nome: %s\n", this.pokemon.getName());
        System.out.println("------");
    }
}
