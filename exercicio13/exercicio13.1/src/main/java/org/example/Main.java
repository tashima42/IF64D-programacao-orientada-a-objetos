package org.example;

public class Main {
    public static void main(String[] args) {
        Monster pokemon = new Pokemon("Pikachu", "100", "10");
        Monster digimon = new Digimon("Agumon", "100", "10");

        pokemon.attack();
        digimon.attack();
    }
}