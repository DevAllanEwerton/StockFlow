package com.AllanDev.StockFlow.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_categoria")
public class CategoriaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String descricao;
    //    @OneToMany Um para Muitos
//    o mappedBy aponta para o atributo que controla o relacionamento do outro lado
    @OneToMany(mappedBy = "categoria")
    private List<ProdutoModel> produto;
}
