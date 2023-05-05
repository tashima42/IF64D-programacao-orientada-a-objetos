/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.pokemon;

/**
 *
 * @author pedro
 */
public class Main {
    public static void main(String[] args) {
	    Pokemon pokemon = new Pokemon("Ednaldo", 12, 30, 14);
	    Treinador treinador = new Treinador("Pereira", 57, pokemon);

	    treinador.apresentar();
    }
}
