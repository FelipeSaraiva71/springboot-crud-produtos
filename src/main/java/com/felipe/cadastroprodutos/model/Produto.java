package com.felipe.cadastroprodutos.model;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity@Table(name= "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String nomeProduto;
    private String descricao;
    private BigDecimal valor;
    private double peso;

    public Produto (){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = this.id;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }

    public void setNomeProduto(){
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(){
        this.descricao = descricao;
    }

    public BigDecimal getValor(){
        return valor;
    }

    public void setValor(){
        this.valor = valor;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(){
        this.peso = peso;
    }


}
