package com.felipe.cadastroprodutos.service;
import com.felipe.cadastroprodutos.model.Produto;

import com.felipe.cadastroprodutos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public void deletar (Long id){
        repository.deleteById(id);
    }

    

}
