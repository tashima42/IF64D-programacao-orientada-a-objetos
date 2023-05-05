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
public class Command {
	private Scanner scanner;	
	private final TelaCommand telaCommand;

	public Command(Scanner scanner) {
		this.scanner = scanner;
		this.telaCommand = new TelaCommand(this.scanner);
	}

	public void run() {
		int module = this.telaCommand.perguntarModule();
		switch (module) {
			case 1 -> clienteModule();
			case 2 -> funcionarioModule();
			default -> System.out.printf("\nModulo '%d' invalido, tente novamente\n", module);
		}
	}

	private void clienteModule() {
		GerenciadorCliente gerenciadorCliente = new GerenciadorCliente(this.scanner);
		gerenciadorCliente.ler();
		gerenciadorCliente.apresentar();
	}
	private void funcionarioModule() {
		GerenciadorFuncionario gerenciadorFuncionario = new GerenciadorFuncionario(this.scanner);
		gerenciadorFuncionario.ler();
		gerenciadorFuncionario.apresentar();
	}
}
