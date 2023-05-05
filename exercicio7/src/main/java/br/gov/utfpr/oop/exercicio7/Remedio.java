/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.exercicio7;

/**
 *
 * @author pedro
 */
public class Remedio {
	private String nome;
	private double preco;
	private String descricao;
	private String posologia;
	private String nomeTecnico;

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return this.preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPosologia() {
		return this.posologia;
	}
	public void setPosologia(String posologia) {
		this.posologia = posologia;
	}
	public String getNomeTecnico() {
		return this.nomeTecnico;
	}
	public void setNomeTecnico(String nomeTecnico) {
		this.nomeTecnico = nomeTecnico;
	}
}
