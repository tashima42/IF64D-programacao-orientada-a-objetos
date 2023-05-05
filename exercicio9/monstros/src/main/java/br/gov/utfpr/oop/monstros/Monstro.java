/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.monstros;

/**
 *
 * @author pedro
 */
public class Monstro {
	protected String nome;
	protected int vida;
	protected int ataque;
	protected int defesa;

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
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
}
