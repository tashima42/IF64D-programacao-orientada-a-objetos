/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.exercicio6;

/**
 *
 * @author pedro
 */
public class Carro {
	private String marca;
	private String modelo;
	private int anoFabricacao;

	public Carro(String marca, String modelo, int anoFabricacao) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}

	public String getMarca() {
		return this.marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public int getAnoFabricacao() {
		return this.anoFabricacao;
	}
}
