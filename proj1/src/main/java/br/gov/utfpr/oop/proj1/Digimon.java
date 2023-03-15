/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.proj1;

/**
 *
 * @author pedro
 */
public class Digimon {
	private int hp;
	private int atk;
	private int def;
	private String nome;	

	public Digimon(int hp, int atk, int def, String nome) {
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.nome = nome;
	}

	public void apresentar() {
		System.out.printf("HP: %d\nATK:%d\nDEF: %d\nNome: %s", this.hp, this.atk, this.def, this.nome);
	}
}
