/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.exercicio8;

/**
 *
 * @author pedro
 */
public class TelaCliente {
	private final Cliente cliente;	

	public TelaCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void apresentar() {
		System.out.printf(
			"Nome: %s\nEndereco: %s\nCodC: %s", 
			this.cliente.getNome(), 
			this.cliente.getEndereco(), 
			this.cliente.getCodC()
		);
	}
}
