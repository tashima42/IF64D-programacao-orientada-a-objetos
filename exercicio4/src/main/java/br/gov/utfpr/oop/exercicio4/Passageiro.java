/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.exercicio4;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Passageiro {
	public String nome;
	public String assento;
	public String endereco;
	public String genero;

	public Passageiro() {
		this.genero = "não identificado";	
	}

	public void apresentar() {
		System.out.printf("\nNome: %s\nAssento: %s\nEndereco: %s\nGenero: %s\n", this.nome, this.assento, this.endereco, this.genero);
	}
}
