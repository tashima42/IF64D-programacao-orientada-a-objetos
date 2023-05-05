/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.academico;

/**
 *
 * @author pedro
 */
public class Professor {
	private final String nome;
	private final double salario;
	
	public Professor(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}	
	public void apresentar() {
		System.out.println("Professor:");
		System.out.printf("  Nome: %s\n  Salario:%.2f\n", this.nome, this.salario);
	}
}
