/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.heranca;

/**
 *
 * @author pedro
 */
abstract class Pessoa {
	protected String nome;
	protected String endereco;

	public String getNome() {
		return this.nome;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
