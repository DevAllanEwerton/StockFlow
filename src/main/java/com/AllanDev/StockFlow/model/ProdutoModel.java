package com.AllanDev.StockFlow.model;

import jakarta.persistence.*;

//Entity tranforma uma class em uma entidade do BD
@Entity
@Table(name = "tb_produto")
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private double preco;
    private int quantidade;
    //    @ManyToOne  Muitos para Um
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaModel categoria;

    public ProdutoModel() {
    }

    public ProdutoModel(long id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
