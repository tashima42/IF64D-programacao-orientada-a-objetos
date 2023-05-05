/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.heranca;

/**
 *
 * @author pedro
 */
public class TelaFuncionario {
	private final Funcionario funcionario;

	public TelaFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public void apresentar() {
		System.out.printf("Nome: %s\nEndereco: %s\nSalario: %.2f\n", this.funcionario.getNome(), this.funcionario.getEndereco(), this.funcionario.getSalario());
	}
}
