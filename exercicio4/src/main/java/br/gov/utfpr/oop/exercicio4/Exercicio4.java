/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.gov.utfpr.oop.exercicio4;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Exercicio4 {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

    	Passageiro passageiro = new Passageiro();

	System.out.println("Digite o nome");
	passageiro.nome = scanner.nextLine();
	System.out.println("Digite o assento");
	passageiro.assento = scanner.nextLine();
	System.out.println("Digite o endereco");
	passageiro.endereco = scanner.nextLine();
	System.out.println("Digite o genero");
	String genero = scanner.nextLine();
	if (!genero.equals("")) {
		passageiro.genero = genero;
	}

	passageiro.apresentar();
    }
}
