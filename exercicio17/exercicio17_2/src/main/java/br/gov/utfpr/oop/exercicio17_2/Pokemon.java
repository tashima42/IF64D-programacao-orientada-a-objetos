/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.exercicio17_2;

/**
 *
 * @author pedro
 */
public class Pokemon {
	// nome, vida, ataque e defesa
	private String nome;
	private int vida;
	private int ataque;
	private int defesa;
	
	public Pokemon(String nome, int vida, int ataque, int defesa){
		this.nome = nome; 
		this.vida = vida;
		this.ataque = ataque;
		this.defesa = defesa;
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
	public int getDefesa() {
		return this.defesa;
	}
}
