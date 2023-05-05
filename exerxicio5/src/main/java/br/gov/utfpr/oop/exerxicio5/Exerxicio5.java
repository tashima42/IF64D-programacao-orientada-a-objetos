/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.gov.utfpr.oop.exerxicio5;

/**
 *
 * @author pedro
 */
public class Exerxicio5 {

    public static void main(String[] args) {
	    TelaCliente telaCliente = new TelaCliente();
	    TelaServicos telaServicos = new TelaServicos();

	    String nomeCliente = telaCliente.lerNome();
	    String enderecoCliente = telaCliente.lerEndereco();
	    Cliente cliente = new Cliente(nomeCliente, enderecoCliente);

	    String descricaoServico = telaServicos.lerDescricao();
	    double precoServico = telaServicos.lerPreco();
	    Servicos servico = new Servicos(descricaoServico, precoServico);

	    telaCliente.apresentar(cliente);
	    telaServicos.apresentar(servico);
    }
}
