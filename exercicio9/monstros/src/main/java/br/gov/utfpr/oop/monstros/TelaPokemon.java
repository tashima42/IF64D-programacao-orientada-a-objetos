/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.monstros;

/**
 *
 * @author pedro
 */
public class TelaPokemon {
	private Pokemon pokemon;
	public TelaPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	public void apresentar() {
		System.out.printf("Nome: %s\nVida: %d\nAtaque: %d\nDefesa: %d\nTipo: %s", this.pokemon.getNome(), this.pokemon.getVida(),this.pokemon.getAtaque(), this.pokemon.getDefesa(), this.pokemon.getTipo());
	}
}
