/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.proj1;

/**
 *
 * @author pedro
 */
public class Treinador {
	private String nome;
	private int idade;
	private String cidade;

	public Treinador(String nome, int idade, String cidade) {
		this.nome = nome;
		this.idade = idade;
		this.cidade = cidade;
	}

	public void apresentar() {
		System.out.printf("Nome: %s\nIdade: %d\nCidade: %s\n", this.nome, this.idade, this.cidade);
	}
}
