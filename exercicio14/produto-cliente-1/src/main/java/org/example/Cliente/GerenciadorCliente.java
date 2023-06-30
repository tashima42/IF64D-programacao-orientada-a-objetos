package org.example.Cliente;

import org.example.Item.GerenciadorItem;
import org.example.Item.Item;
import org.example.Cliente.Cliente;
import org.example.Cliente.TelaCliente;

import java.util.HashMap;

public class GerenciadorCliente implements GerenciadorItem {
    HashMap<Integer, Cliente> clientes = new HashMap<>();
    TelaCliente telaCliente = new TelaCliente();

    @Override
    public void cadastrar(Item item) {
        Cliente cliente = (Cliente) item;
        clientes.put(cliente.getId(), cliente);
    }

    @Override
    public void excluir(int id) {
        clientes.remove(id);
    }

    @Override
    public void atualizar(int id, Item item) {
        Cliente cliente = (Cliente) item;
        clientes.put(id, cliente);
    }

    @Override
    public void listar() {
        for (Cliente cliente : clientes.values()) {
            telaCliente.apresentar(cliente);
        }
    }
}
