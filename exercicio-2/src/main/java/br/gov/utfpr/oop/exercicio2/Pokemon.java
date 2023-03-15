/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.exercicio2;

/**
 *
 * @author pedro
 */
public class Pokemon {
	private final String nome;
	private final int vida;	
	private final int ataque;

	public Pokemon(String nome, int vida, int ataque) {
		this.nome = nome;
		this.vida = vida;
		this.ataque = ataque;
	}

	public String getNome() {
		return this.nome;
	}
	public int getVida() {
		return this.vida;
	}
	public int getAtaque() {
		return this.ataque;
	}

	public void apresentar() {
		System.out.printf( "Nome: %s\nVida: %d\nAtaque: %d", 
			this.getNome(),
			this.getVida(),
			this.getAtaque());
	}
}
