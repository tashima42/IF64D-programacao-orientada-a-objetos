package org.example.Vendedor;

import org.example.Empregado.Empregado;
import org.example.Empregado.TelaEmpregado;

import java.util.Scanner;

public class TelaVendedor extends TelaEmpregado {
    private Scanner scanner;

    public TelaVendedor(Scanner scanner) {
        super(scanner);
        this.scanner = scanner;
    }

    @Override
    public void apresentar(Empregado empregado) {
        Vendedor vendedor = (Vendedor) empregado;
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Salário: " + vendedor.getSalario());
        System.out.println("Comissão: " + vendedor.getComissao());
    }

    public double lerComissao() {
        System.out.print("Digite a comissão: ");
        double comissao = scanner.nextDouble();
        scanner.nextLine();
        return comissao;
    }
}
