/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.exercicio19.produto;

/**
 *
 * @author pedro
 */
public class DAOProduto {
	public void setProduto(Produto p) {
		System.out.println("Conectando...");

		String sql = "insert into produto values(\"" +
							p.getCod()+ 
						       "\",\"" +
						       p.getDescricao()+
						       "\"," +
						       p.getNome()+
						       "," +
						       p.getPreco()+
						       ")";
		System.out.println("Executando: " + sql);
		System.out.println("Desconectando...");
	}	

	public Produto getProduto(Integer cod) {
		Produto p = new Produto();
		System.out.println("Conectando...");
		String sql = "SELECT * FROM PRODUTO WHERE COD =" + cod;
		System.out.println("Executando: " + sql);
		p.setCod(cod);
		p.setDescricao("descricao");
		p.setNome("nome");
		p.setPreco(10);

		System.out.println("Desconectando...");
		return p;
	}
}
