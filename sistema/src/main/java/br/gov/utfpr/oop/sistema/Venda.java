/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.sistema;

/**
 *
 * @author pedro
 */
public class Venda {
	private String codigo;
	private Cliente cliente;
	private Produto produto;

	public Venda(String codigo, Cliente cliente, Produto produto) {
		this.codigo = codigo;
		this.cliente = cliente;
		this.produto = produto;
	}

	public void apresentar() {
		System.out.printf("\nVenda [%s]", this.codigo);
		this.cliente.apresentar();
		this.produto.apresentar();
	}
}
