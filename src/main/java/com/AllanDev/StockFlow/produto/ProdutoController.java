package com.AllanDev.StockFlow.produto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProdutoController {
    @GetMapping
    public String test(){
        return "Ola mundo";
    }
}
