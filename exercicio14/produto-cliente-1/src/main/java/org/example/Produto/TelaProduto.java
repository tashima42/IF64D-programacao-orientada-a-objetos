package org.example.Produto;

public class TelaProduto {
    public void apresentar(Produto produto) {
        System.out.println("====================================");
        System.out.println("Id: " + produto.getId());
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Descrição: " + produto.getDescricao());
    }
}
