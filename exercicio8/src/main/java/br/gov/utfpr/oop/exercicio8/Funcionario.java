/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.exercicio8;

/**
 *
 * @author pedro
 */
public class Funcionario {
	private String nome;	
	private String endereco;	
	private double salario;	

	public String getNome() {
		return this.nome;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void  setSalario(double salario) {
		this.salario = salario;
	}
}
