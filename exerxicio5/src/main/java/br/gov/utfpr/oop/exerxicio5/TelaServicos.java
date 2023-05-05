/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.exerxicio5;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class TelaServicos {
	private final Scanner scanner;
	public TelaServicos() {
		this.scanner = new Scanner(System.in);
	}
	public String lerDescricao() {
		System.out.println("Descricao do servico:");
		return scanner.nextLine();
	}
	public double lerPreco() {
		System.out.println("Preco do servico:");
		return Double.parseDouble(scanner.nextLine());
	}
	public void apresentar(Servicos servicos) {
		System.out.printf("\nDescricao: %s\nPreco: %.2f", servicos.descricao, servicos.preco);
	}
}
