n/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.exercicio8;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class TelaCommand {
	private final Scanner scanner;	

	public TelaCommand(Scanner scanner) {
		this.scanner = scanner;
	}

	public int perguntarModule() {
		System.out.println("1-Acessar módulo de Cliente;");
		System.out.println("2-Acessar módulo de Funcionário;");
		return Integer.parseInt(this.scanner.nextLine());
	}
}
