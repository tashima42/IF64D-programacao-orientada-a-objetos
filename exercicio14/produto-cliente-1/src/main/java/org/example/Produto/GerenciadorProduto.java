package org.example.Produto;

import org.example.Item.GerenciadorItem;
import org.example.Item.Item;

import java.util.HashMap;

public class GerenciadorProduto implements GerenciadorItem {
    HashMap<Integer, Produto> produtos = new HashMap<>();
    TelaProduto telaProduto = new TelaProduto();

    @Override
    public void cadastrar(Item item) {
        Produto produto = (Produto) item;
        produtos.put(produto.getId(), produto);
    }

    @Override
    public void excluir(int id) {
        produtos.remove(id);
    }

    @Override
    public void atualizar(int id, Item item) {
        Produto produto = (Produto) item;
        produtos.put(id, produto);
    }

    @Override
    public void listar() {
        for (Produto produto : produtos.values()) {
            telaProduto.apresentar(produto);
        }
    }
}
