/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.academico;

/**
 *
 * @author pedro
 */
public class Aluno {
	private final String nome;
	private final String RA;
	private final Disciplina disciplina;

	public Aluno(String nome, String RA, Disciplina disciplina){
		this.nome = nome;
		this.RA = RA;
		this.disciplina = disciplina;
	}

	public void apresentar() {
		System.out.println("Aluno:");
		System.out.printf("  Nome: %s\n  RA: %s\n", this.nome, this.RA);
		this.disciplina.apresentar();
	}
}
