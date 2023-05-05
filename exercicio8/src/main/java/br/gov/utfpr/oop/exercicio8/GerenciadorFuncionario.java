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
public class GerenciadorFuncionario {
	private final Scanner scanner;
	private Funcionario funcionario;
	private TelaFuncionario telaFuncionario;

	public GerenciadorFuncionario(Scanner scanner) {
		this.scanner = scanner;
		this.funcionario = new Funcionario();
	}

	public void ler() {
		System.out.println("Nome do funcionario");
		this.funcionario.setNome(scanner.nextLine());
		System.out.println("Endereco do funcionario");
		this.funcionario.setEndereco(scanner.nextLine());
		System.out.println("Salario do funcionario");
		this.funcionario.setSalario(Double.parseDouble(scanner.nextLine()));
		this.telaFuncionario = new TelaFuncionario(this.funcionario);
	}

	public void apresentar() {
		this.telaFuncionario.apresentar();
	}
}
