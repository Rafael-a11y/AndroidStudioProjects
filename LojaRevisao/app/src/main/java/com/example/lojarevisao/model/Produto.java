package com.example.lojarevisao.model;

public class Produto
{
    private String nome;
    private double preço;

    public Produto(String nome, double preço)
    {
        this.nome = nome;
        this.preço = preço;
    }

    @Override
    public String toString()
    {
        return "Produto -> nome: " + this.nome + ", preço: " + this.preço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
}
