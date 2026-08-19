package com.AllanDev.StockFlow.produto;

import com.AllanDev.StockFlow.categoria.CategoriaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity tranforma uma class em uma entidade do BD
@Entity
@Table(name = "tb_produto")
//Cria automaticamente um costrutor vazio
@NoArgsConstructor
//Cria automaticamente um costrutor com todos os argumentos
@AllArgsConstructor
//Cria todos os Getters and Settes
@Data
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private double preco;
    private int quantidade;
    @Column(name = "img_url")
    private String imgUrl;

    //    @ManyToOne  Muitos para Um
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaModel categoria;

}
