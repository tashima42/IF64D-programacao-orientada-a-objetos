/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.utfpr.oop.exercicio19.produto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author pedro
 */
public class GerenciadorProduto implements ActionListener {
	private TelaProduto tp;
	private Produto p;
	private DAOProduto daoP;	

	public GerenciadorProduto() {
		tp = new TelaProduto();
		p  = new Produto();
		daoP = new DAOProduto();
		tp.addListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton botaoapertado = (JButton)e.getSource();
		System.out.println("botao apertado = " + botaoapertado);
		String opc = botaoapertado.getText();

		switch(opc) {
			case "cadastrar":
				p = tp.getProduto();
				daoP.setProduto(p);
				break;
			case "consultar":
				Integer cod = tp.getCod();
				p = daoP.getProduto(cod);
				tp.setProduto(p);
		}
	}	
}
