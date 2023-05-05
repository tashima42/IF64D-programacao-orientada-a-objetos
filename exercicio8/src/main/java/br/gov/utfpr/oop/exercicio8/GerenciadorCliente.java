/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.exercicio8;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class GerenciadorCliente {
	private final Scanner scanner;
	private Cliente cliente;
	private TelaCliente telaCliente;

	public GerenciadorCliente(Scanner scanner) {
		this.scanner = scanner;
		this.cliente = new Cliente();
	}

	public void ler() {
		System.out.println("Nome do cliente");
		this.cliente.setNome(scanner.nextLine());
		System.out.println("Endereco do cliente");
		this.cliente.setEndereco(scanner.nextLine());
		System.out.println("CodC do cliente");
		this.cliente.setCodC(scanner.nextLine());
		this.telaCliente = new TelaCliente(this.cliente);
	}

	public void apresentar() {
		this.telaCliente.apresentar();
	}
}
