package oop.utfpr.cliente;

public class TelaCliente {
    private final Cliente cliente;

    public TelaCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void showInfo() {
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Código: " + cliente.getCod());
    }
}
