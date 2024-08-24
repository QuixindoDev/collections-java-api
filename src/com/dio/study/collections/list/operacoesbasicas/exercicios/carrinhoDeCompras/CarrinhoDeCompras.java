package com.dio.study.collections.list.operacoesbasicas.exercicios.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item i: itens){
            if (i.getNome().equalsIgnoreCase(nome))
                itemParaRemover.add(i);
        }
        itens.remove(itemParaRemover);
    }

    public int calcularValorTotal(){
        return itens.size();
    }

    public void exibirItens(){
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        System.out.println(carrinho.calcularValorTotal());

        carrinho.adicionarItem("pc gamer", 25.0, 1);
        System.out.println(carrinho.calcularValorTotal());

        carrinho.exibirItens();
    }
}
