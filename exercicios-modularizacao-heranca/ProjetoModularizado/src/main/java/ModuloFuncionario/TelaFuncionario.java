/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuloFuncionario;

import com.mycompany.projetomodularizado.Pessoa;
import com.mycompany.projetomodularizado.TelaPessoa;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class TelaFuncionario extends TelaPessoa {
    private Scanner scanner;
    public TelaFuncionario(Scanner scanner) {
        this.scanner = scanner;
    }
    public void cadastrar(Pessoa p){
        Funcionario f = (Funcionario)p;
        System.out.println("Digite o salário do funcionario:");
        f.setSalario(scanner.nextFloat());scanner.nextLine();
        System.out.println("Digite o nome do funcionário:");
        f.setNome(scanner.nextLine());
        System.out.println("Digite o endereço do funcionario");
        f.setEndereco(scanner.nextLine());
    }
    
    public void apresentar(Pessoa p){
        Funcionario f = (Funcionario)p;
        System.out.println("Nome do funcionário: " + f.getNome());
        System.out.println("Endereço do funcionário: " + f.getEndereco());
        System.out.println("Código do funcionário: " + f.getSalario());
    }
    public int menu(){
        System.out.println("****************************");
        System.out.println("* 1-Digitar funcionário    *");
        System.out.println("* 2-Apresentar funcionário *");
        System.out.println("* 0-Voltar                 *");
        System.out.println("****************************");
        return scanner.nextInt();
    }
}
