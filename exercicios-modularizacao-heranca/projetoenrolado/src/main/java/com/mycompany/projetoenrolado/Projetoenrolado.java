/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoenrolado;

import java.util.Scanner;

/**
 *
 * @author paulo
 * Faça um programa que apresente o seguinte menu:

1-Acessar módulo de Cliente;

2-Acessar módulo de Funcionário;

0-Sair.



Se o usuário digitar 1, o seguinte menu deve ser apresentado:

1-Digitar dados do Cliente;

2-Ler dados do cliente;

0-Voltar.



Se o usuário digitar 2 no primeiro menu, deve ser apresentado o seguinte:

1-Digitar dados do Funcionário;

2-Ler dados do Funcionário;

0-Voltar.


 */
public class Projetoenrolado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc, opcC, opcF, codC=0;
        String nome="", endereco="", nomeF="", enderecoF="";
        float salario=0;
        
        do{
            System.out.println("****************************");
            System.out.println("* 1-Módulo do cliente      *");
            System.out.println("* 2-Módulo do funcionário  *");
            System.out.println("* 0-Sair                   *");
            System.out.println("****************************");
            opc = teclado.nextInt();
            
            switch(opc){
                case 1:
                    do{
                        System.out.println("****************************");
                        System.out.println("* 1-Digitar   cliente      *");
                        System.out.println("* 2-Apresentar cliente     *");
                        System.out.println("* 0-Voltar                 *");
                        System.out.println("****************************");
                        opcC = teclado.nextInt();
                        switch(opcC){
                            case 1:
                                System.out.println("Digite o código do cliente:");
                                codC = teclado.nextInt();teclado.nextLine();
                                System.out.println("Digite o nome do cliente:");
                                nome = teclado.nextLine();
                                System.out.println("Digite o endereço do cliente");
                                endereco = teclado.nextLine();
                                break;
                            case 2:
                                System.out.println("Nome do cliente: " + nome);
                                System.out.println("Endereço do cliente: " + endereco);
                                System.out.println("Código do cliente: " + codC);
                                break;
                        }
                    }while(opcC!=0);
                    break;
                case 2:
                    do{
                        System.out.println("********************************");
                        System.out.println("* 1-Digitar  funcionário       *");
                        System.out.println("* 2-Apresentar funcionário     *");
                        System.out.println("* 0-Voltar                     *");
                        System.out.println("********************************");
                        opcF = teclado.nextInt();
                        switch(opcF){
                            case 1:
                                System.out.println("Digite o salário do funcionário:");
                                salario = teclado.nextFloat();teclado.nextLine();
                                System.out.println("Digite o nome do funcionaário:");
                                nomeF = teclado.nextLine();
                                System.out.println("Digite o endereço do funcionário");
                                enderecoF = teclado.nextLine();
                                break;
                            case 2:
                                System.out.println("Nome do funcionário: " + nomeF);
                                System.out.println("Endereço do funcionário: " + enderecoF);
                                System.out.println("Salário do funcionário: " + salario);
                                break;
                        }
                    }while(opcF!=0);
                    break;
            }
        }while(opc!=0);
    }
}
