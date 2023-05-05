/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.gov.utfpr.oop.academico;

/**
 *
 * @author pedro
 */
public class Academico {

    public static void main(String[] args) {
	    Professor professor = new Professor("Mauricio de Souza", 899999.34);
	    Disciplina disciplina = new Disciplina("Producao de quadrinhos", professor);
	    Aluno aluno = new Aluno("Monica", "000001", disciplina);

	    aluno.apresentar();
    }
}
