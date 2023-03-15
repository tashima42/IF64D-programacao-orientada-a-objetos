/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.gov.utfpr.oop.sistema;

/**
 *
 * @author pedro
 */
public class Sistema {

    public static void main(String[] args) {
	Produto produto = new Produto("Pilha AA", 89.99);
	Cliente cliente = new Cliente("Jorge Amado", "R. São Francisco de Assis, 116 - Jardim Sao Marcos, Embu das Artes - SP");
	Venda venda = new Venda("1", cliente, produto);

	produto.apresentar();
	cliente.apresentar();
	venda.apresentar();
    }
}
