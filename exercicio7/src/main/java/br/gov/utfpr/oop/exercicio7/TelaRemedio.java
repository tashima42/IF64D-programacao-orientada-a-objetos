/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.exercicio7;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class TelaRemedio {
	private Remedio remedio;
	private Scanner scanner;	

	public TelaRemedio() {
		this.remedio = new Remedio();
		this.scanner = new Scanner(System.in);
	}
	public void lerRemedio() {
		System.out.println("Nome do remedio");
		this.remedio.setNome(scanner.nextLine());
		System.out.println("Preco do remedio");
		this.remedio.setPreco(Double.parseDouble(scanner.nextLine()));
		System.out.println("Descricao do remedio");
		this.remedio.setDescricao(scanner.nextLine());
		System.out.println("Posologia do remedio");
		this.remedio.setPosologia(scanner.nextLine());
		System.out.println("Nome tecnico do remedio");
		this.remedio.setNomeTecnico(scanner.nextLine());
	}
	public void apresentarRemedio() {
		System.out.printf("Nome: %s\nPreco: %.2f\nDescricao: %s\nPosologia: %s\nDescricao: %s", this.remedio.getNome(), this.remedio.getPreco(), this.remedio.getPosologia(), this.remedio.getDescricao(), this.remedio.getNomeTecnico());
	}
}
