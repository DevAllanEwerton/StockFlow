package com.AllanDev.StockFlow.produto;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @GetMapping
    public String test() {
        return "Ola mundo";
    }

    //    add produto
    @PostMapping("/criar")
    public String criarProduto() {
        return "criarProduto";
    }

    //    mostra produto por ID
    @GetMapping("/ID")
    public String procuraProdutoID() {
        return "procuraProdutoID";
    }

    //    Mostra todos os produtos
    @GetMapping("/lista")
    public String listarProduto() {
        return "listarProduto";
    }

    //    Alterar dados dos produtos
    @PutMapping("/alterarID")
    public String alterarProduto() {
        return "alterarProduto";
    }

    //    Deletar produto
    @DeleteMapping("/detarID")
    public String deletarProduto() {
        return "deletarProduto";
    }

}
