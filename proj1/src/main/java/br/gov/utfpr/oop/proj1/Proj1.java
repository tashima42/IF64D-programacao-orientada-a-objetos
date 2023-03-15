/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.gov.utfpr.oop.proj1;

/**
 *
 * @author pedro
 */
public class Proj1 {

    public static void main(String[] args) {
	    Digimon digimon1 = new Digimon(10, 20, 40, "algum digimon");
	    Digimon digimon2 = new Digimon(20, 30, 10, "outro digimon");
	    Treinador treinador = new Treinador("treinador de digimon", 12, "anta gorda");

	    System.out.println("\nDigimon 1:");
	    digimon1.apresentar();
	    System.out.println("\nDigimon 2:");
	    digimon2.apresentar();
	    System.out.println("\nTreinador:");
	    treinador.apresentar();
    }
}
