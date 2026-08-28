package com.AllanDev.StockFlow.categoria;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Categoria")
public class CategoriaController {
    @GetMapping
    public String test() {
        return "Ola mundo";
    }

    //    add Categoria
    @PostMapping("/criar")
    public String criarCategoria() {
        return "criarCategoria";
    }

    //    mostra Categoria por ID
    @GetMapping("/ID")
    public String procuraCategoriaID() {
        return "procuraCategoriaID";
    }

    //    Mostra todos os Categoria
    @GetMapping("/lista")
    public String listarCategoria() {
        return "listarCategoria";
    }

    //    Alterar dados dos Categoria
    @PutMapping("/alterarid")
    public String alterarCategoria() {
        return "alterarCategoria";
    }

    //    Deletar Categoria
    @DeleteMapping("/detarID")
    public String deletarCategoria() {
        return "deletarCategoria";
    }

}
