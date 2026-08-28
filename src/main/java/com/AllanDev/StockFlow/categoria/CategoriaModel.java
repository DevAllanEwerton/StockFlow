package com.AllanDev.StockFlow.categoria;

import com.AllanDev.StockFlow.produto.ProdutoModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_categoria")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CategoriaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String descricao;
    //    @OneToMany Um para Muitos
//    o mappedBy aponta para o atributo que controla o relacionamento do outro lado
    @OneToMany(mappedBy = "categoria")
    @JsonIgnore
    private List<ProdutoModel> produto;
}
