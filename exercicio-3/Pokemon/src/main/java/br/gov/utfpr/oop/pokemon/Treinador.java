/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.pokemon;

/**
 *
 * @author pedro
 */
public class Treinador {
	private final String nome;
	private final int idade;
	private final Pokemon pokemon;	

	public Treinador(String nome, int idade, Pokemon pokemon) {
		this.nome = nome;
		this.idade = idade;
		this.pokemon = pokemon;
	}

	public void apresentar() {
		System.out.println("Treinador");
		System.out.printf("  Nome: %s\n  Idade: %d\n", this.nome, this.idade);
		this.pokemon.apresentar();
	}
}
