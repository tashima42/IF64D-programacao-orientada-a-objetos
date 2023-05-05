/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.monstros;

/**
 *
 * @author pedro
 */
public class TelaDigimon {
	private Digimon digimon;
	public TelaDigimon(Digimon digimon) {
		this.digimon = digimon;
	}

	public void apresentar() {
		System.out.printf("Nome: %s\nVida: %d\nAtaque: %d\nDefesa: %d\nNivel: %d", this.digimon.getNome(), this.digimon.getVida(),this.digimon.getAtaque(), this.digimon.getDefesa(), this.digimon.getNivel());
	}
}
