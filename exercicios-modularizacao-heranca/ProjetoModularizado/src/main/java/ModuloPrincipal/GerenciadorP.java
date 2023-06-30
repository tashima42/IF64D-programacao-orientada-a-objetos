/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuloPrincipal;

import ModuloCliente.TelaCliente;
import ModuloFuncionario.TelaFuncionario;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class GerenciadorP {
    Scanner scanner = new Scanner(System.in);
    private TelaGerenciadorP tgp = new TelaGerenciadorP(scanner);
    private GerenciadorGenerico gg = new GerenciadorGenerico();
    private TelaFuncionario tf = new TelaFuncionario(scanner);
    private TelaCliente tc = new TelaCliente(scanner);
    public void gerenciar(){
        int opc;
        do{
            opc = tgp.menu();
            switch(opc){
                case 1 -> gg.gerenciar(tc);
                case 2 -> gg.gerenciar(tf);
            }
        }while(opc!=0);
    }
}
