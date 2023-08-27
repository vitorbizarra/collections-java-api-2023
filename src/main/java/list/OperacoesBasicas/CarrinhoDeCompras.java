package main.java.list.OperacoesBasicas;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Item> itemsList;

    public CarrinhoDeCompras() {
        this.itemsList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.itemsList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        ArrayList<Item> itemsToRemove = new ArrayList<>();

        for (Item item : itemsList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemsToRemove.add(item);
            }
        }

        itemsList.removeAll(itemsToRemove);
    }

    public double calcularValorTotal() {
        double total = 0;

        for (Item item : itemsList) {
            total += item.getPreco() * item.getQuantidade();
        }

        return total;
    }

    public void exibirItens() {
        System.out.println(this.itemsList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Fanta Maracujá", 6.00, 3);
        carrinho.exibirItens();
        System.out.println("Total: " + carrinho.calcularValorTotal());

        carrinho.adicionarItem("Esfirra", 4.50, 1);
        carrinho.exibirItens();
        System.out.println("Total: " + carrinho.calcularValorTotal());

        carrinho.removerItem("Esfirra");
        carrinho.exibirItens();
        System.out.println("Total: " + carrinho.calcularValorTotal());
    }
}
