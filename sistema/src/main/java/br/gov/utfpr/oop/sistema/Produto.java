/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.sistema;

/**
 *
 * @author pedro
 */
public class Produto {
	private String nome;
	private double preco;	

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public void apresentar() {
		System.out.printf("\nNome: %s\nPreço: R$%.2f", this.nome, this.preco);
	}
}
