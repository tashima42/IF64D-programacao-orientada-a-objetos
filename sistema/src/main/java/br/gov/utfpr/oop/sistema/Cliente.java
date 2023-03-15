/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.sistema;

/**
 *
 * @author pedro
 */
public class Cliente {
	private String nome;
	private String endereco;

	public Cliente(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public void apresentar() {
		System.out.printf("\nNome: %s\nEndereco: %s", this.nome, this.endereco);
	}
}
