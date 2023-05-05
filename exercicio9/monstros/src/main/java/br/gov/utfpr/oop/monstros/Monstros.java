/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.gov.utfpr.oop.monstros;

/**
 *
 * @author pedro
 */
public class Monstros {

    public static void main(String[] args) {
	    Pokemon pokemonAtacante = new Pokemon();
	    pokemonAtacante.setNome("Carcara");
	    pokemonAtacante.setAtaque(20);
	    pokemonAtacante.setDefesa(5);
	    pokemonAtacante.setVida(15);
	    pokemonAtacante.setTipo("fogo");

	    Pokemon pokemonAtacado = new Pokemon();
	    pokemonAtacado.setNome("Urubu");
	    pokemonAtacado.setAtaque(5);
	    pokemonAtacado.setDefesa(10);
	    pokemonAtacado.setVida(30);
	    pokemonAtacado.setTipo("terra");

	    TelaPokemon telaAtacante = new TelaPokemon(pokemonAtacante);
	    System.out.printf("\n\n");
	    telaAtacante.apresentar();
	    TelaPokemon telaAtacado = new TelaPokemon(pokemonAtacado);
	    System.out.printf("\n\n");
	    telaAtacado.apresentar();

	    pokemonAtacante.atacar(pokemonAtacado);
	    System.out.printf("\n\n");
	    telaAtacado.apresentar();

	    Digimon digimon = new Digimon();
	    digimon.setNome("Gavimon");
	    digimon.setAtaque(20);
	    digimon.setDefesa(5);
	    digimon.setVida(15);
	    digimon.setNivel(1);

	    TelaDigimon telaDigimon = new TelaDigimon(digimon);
	    System.out.printf("\n\n");
	    telaDigimon.apresentar();
    }
}
