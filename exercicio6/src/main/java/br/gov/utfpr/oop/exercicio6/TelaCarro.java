/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.exercicio6;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class TelaCarro {
	private Carro carro;
	private Scanner scanner;

	public TelaCarro(){
		this.scanner = new Scanner(System.in);
	}

	public void lerCarro() {
		System.out.println("Marca do carro:");
		String marca = scanner.nextLine();
		System.out.println("Modelo do carro:");
		String modelo = scanner.nextLine();
		System.out.println("Ano de fabricacao do carro:");
		int anoFabricacao = Integer.parseInt(scanner.nextLine());
		this.carro = new Carro(marca, modelo, anoFabricacao);
	}
	public void apresentarCarro() {
		System.out.printf("Marca: %s\nModelo: %s\nAno de Fabricacao: %d", this.carro.getMarca(), this.carro.getModelo(), this.carro.getAnoFabricacao());
	}
}
