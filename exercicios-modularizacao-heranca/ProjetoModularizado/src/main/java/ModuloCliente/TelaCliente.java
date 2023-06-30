/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuloCliente;

import com.mycompany.projetomodularizado.Pessoa;
import com.mycompany.projetomodularizado.TelaPessoa;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class TelaCliente extends TelaPessoa {
    private Scanner scanner;
    public TelaCliente(Scanner scanner) {
        this.scanner = scanner;
    }
    public void cadastrar(Pessoa p){
        Cliente c = (Cliente) p;
        System.out.println("Digite o código do cliente:");
        c.setCod(scanner.nextInt());scanner.nextLine();
        System.out.println("Digite o nome do cliente:");
        c.setNome(scanner.nextLine());
        System.out.println("Digite o endereço do cliente");
        c.setEndereco(scanner.nextLine());
    }
    
    public void apresentar(Pessoa p){
        Cliente c = (Cliente) p;
        System.out.println("Nome do cliente: " + c.getNome());
        System.out.println("Endereço do cliente: " + c.getEndereco());
        System.out.println("Código do cliente: " + c.getCod());
    }
    public int menu(){
        System.out.println("****************************");
        System.out.println("* 1-Digitar   cliente      *");
        System.out.println("* 2-Apresentar cliente     *");
        System.out.println("* 0-Voltar                 *");
        System.out.println("****************************");
        return scanner.nextInt();
    }
}
