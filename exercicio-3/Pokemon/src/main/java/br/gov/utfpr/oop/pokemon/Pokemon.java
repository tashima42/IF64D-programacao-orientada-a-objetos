/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.gov.utfpr.oop.pokemon;

/**
 *
 * @author pedro
 */
public class Pokemon {
	private final String nome;
	private final int vida;
	private final int ataque;
	private final int defesa;
	
	public Pokemon(String nome, int vida,int ataque,int defesa) {
		this.nome = nome;
		this.vida = vida;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public void apresentar() {
		System.out.println("Pokemon");
		System.out.printf("  Nome: %s\n  Vida: %d\n  Ataque: %d\n  Defesa:%d", this.nome, this.vida, this.ataque, this.defesa);
	}
}
