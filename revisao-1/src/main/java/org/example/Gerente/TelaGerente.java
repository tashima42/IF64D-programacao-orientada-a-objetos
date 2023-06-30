package org.example.Gerente;

import org.example.Empregado.Empregado;
import org.example.Empregado.TelaEmpregado;
import org.example.Vendedor.Vendedor;

import java.util.Scanner;

public class TelaGerente extends TelaEmpregado {
    // Atributo 'final' nao pode ser modificado, ele e constante
    // isso garante que o atributo so vai ser inicializado uma vez
    private final Scanner scanner;

    public TelaGerente(Scanner scanner) {
        super(scanner);
        this.scanner = scanner;
    }

    // Um metodo 'final' nao pode ser sobrescrito por classes que herdam de TelaGerente
    // essa e uma forma de garantir que o algoritmo nao vai ser modificado
    @Override
    public final void  apresentar(Empregado empregado) {
        Gerente gerente = (Gerente) empregado;
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Departamento: " + gerente.getDepartamento());
    }

    public String lerDepartamento() {
        System.out.print("Digite o departamento: ");
        return scanner.nextLine();
    }
}
