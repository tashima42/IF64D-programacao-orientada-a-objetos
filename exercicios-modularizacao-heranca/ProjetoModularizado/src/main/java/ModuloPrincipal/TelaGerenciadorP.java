/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuloPrincipal;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class TelaGerenciadorP {
    private Scanner scanner;
    public TelaGerenciadorP(Scanner scanner) {
        this.scanner = scanner;
    }
    public int menu(){
        System.out.println("****************************");
        System.out.println("* 1-Módulo do Cliente      *");
        System.out.println("* 2-Módulo do Funcionário  *");
        System.out.println("* 0-Sair                   *");
        System.out.println("****************************");
        return scanner.nextInt();
    }
}
