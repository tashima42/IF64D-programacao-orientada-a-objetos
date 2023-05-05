/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.monstros;

/**
 *
 * @author pedro
 */
public class Pokemon extends Monstro {
	private String tipo;	

	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void atacar(Pokemon atacado) {
		int dano = this.ataque - atacado.getDefesa();
		int vidaSobrandoAtacado;	
		if (dano > 0) {
			vidaSobrandoAtacado = atacado.getVida() - dano;	
			atacado.setVida(vidaSobrandoAtacado);
		}
	}
}
