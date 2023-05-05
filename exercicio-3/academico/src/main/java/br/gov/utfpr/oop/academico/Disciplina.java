/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.academico;

/**
 *
 * @author pedro
 */
public class Disciplina {
	private final String nome;
	private final Professor professor;	

	public Disciplina(String nome, Professor professor) {
		this.nome = nome;
		this.professor = professor;
	}
	public void apresentar() {
		System.out.println("Disciplina:");
		System.out.printf("  Nome: %s\n", this.nome);
		this.professor.apresentar();
	}
}
