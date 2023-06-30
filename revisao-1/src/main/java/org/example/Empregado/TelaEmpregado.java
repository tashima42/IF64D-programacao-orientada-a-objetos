package org.example.Empregado;

import org.example.Operacoes;

import java.util.Scanner;

public abstract class TelaEmpregado {
    private Scanner scanner;

    public TelaEmpregado(Scanner scanner) {
        this.scanner = scanner;
    }

    public Operacoes menu() {
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Apresentar");
        System.out.println("3 - Listar");
        System.out.println("4 - Voltar");
        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao) {
            case 1:
                return Operacoes.CADASTRAR;
            case 2:
                return Operacoes.APRESENTAR;
            case 3:
                return Operacoes.LISTAR;
            case 4:
                return Operacoes.VOLTAR;
            default:
                System.out.println("Opção inválida!");
                return menu();
        }
    }

    public String lerNome() {
        System.out.print("Digite o nome: ");
        return scanner.nextLine();
    }

    public double lerSalario() {
        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        return salario;
    }

    public int lerPosicao() {
        System.out.print("Digite a posição: ");
        int posicao = scanner.nextInt();
        scanner.nextLine();
        return posicao;
    }

    // Um método abstrato não possui corpo, ou seja, não possui implementação.
    // A implementação é feita nas classes filhas.
    // Isso é útil quando queremos que as classes filhas tenham um método com o mesmo nome,
    // mas com implementações diferentes.
    public abstract void apresentar(Empregado empregado);
}
