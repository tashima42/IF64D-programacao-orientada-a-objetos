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
public class TelaCliente {
	private final Scanner scanner;
	public TelaCliente() {
		this.scanner = new Scanner(System.in);
	}
	public String lerNome() {
		System.out.println("Nome do cliente:");
		return scanner.nextLine();
	}
	public String lerEndereco() {
		System.out.println("Endereco do cliente:");
		return scanner.nextLine();
	}
	public void apresentar(Cliente cliente) {
		System.out.printf("\nNome: %s\nEndereco: %s", cliente.nome, cliente.endereco);
	}
}
