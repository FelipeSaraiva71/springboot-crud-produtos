package com.felipe.cadastroprodutos.controller;
import com.felipe.cadastroprodutos.model.Produto;
import com.felipe.cadastroprodutos.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/produtos")
    public Produto criar(@RequestBody Produto produto){

        return  produtoService.salvar(produto);
    }

    @GetMapping("/produtos")
    public List<Produto> listarTodos() {
        return produtoService.listarTodos();
    }

    @DeleteMapping("/produtos/{id}")
    public void deletar(@PathVariable Long id) {
        produtoService.deletar(id);
    }

    @PutMapping("/produtos/{id}")
    public Produto atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        produto.setId(id);
        return produtoService.salvar(produto);
    }
}
