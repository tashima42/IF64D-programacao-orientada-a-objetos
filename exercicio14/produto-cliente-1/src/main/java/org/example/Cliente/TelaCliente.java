package org.example.Cliente;

import org.example.Cliente.Cliente;

public class TelaCliente {
    public void apresentar(Cliente cliente) {
        System.out.println("====================================");
        System.out.println("Id: " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereco: " + cliente.getEndereco());
    }
}
