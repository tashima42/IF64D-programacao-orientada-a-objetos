package org.example.Item;

public interface GerenciadorItem {
   public void cadastrar(Item item);
   public void excluir(int id);
   public void atualizar(int id, Item item);
    public void listar();
}
