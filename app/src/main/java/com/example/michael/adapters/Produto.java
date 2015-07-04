package com.example.michael.adapters;


import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private double preco;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static List<Produto> getProdutos() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(3.5, "Feijao"));
        produtos.add(new Produto(6.3, "Macarrao"));
        produtos.add(new Produto(7.4, "Ferinha"));
        produtos.add(new Produto(2.6, "Cenoura"));
        produtos.add(new Produto(4.5, "Beterraba"));

        return produtos;
    }
}
