/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.gov.utfpr.oop.heranca;

/**
 *
 * @author pedro
 */
public class Heranca {

    public static void main(String[] args) {
	    Cliente cliente = new Cliente();
	    cliente.setCod("1");
	    cliente.setNome("Marcos");
	    cliente.setEndereco("rua santos dumont");

	    Funcionario funcionario = new Funcionario();
	    funcionario.setSalario(1000000);
	    funcionario.setNome("Fabri");
	    funcionario.setEndereco("utfpr cornelio procopio");

	    TelaCliente telaCliente = new TelaCliente(cliente);
	    TelaFuncionario telaFuncionario = new TelaFuncionario(funcionario);

	    telaCliente.apresentar();
	    System.out.printf("\n\n");
	    telaFuncionario.apresentar();
    }
}
