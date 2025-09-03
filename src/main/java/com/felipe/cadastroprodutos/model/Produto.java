package com.felipe.cadastroprodutos.model;
import com.felipe.cadastroprodutos.Util.Utils;
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

    public Produto() {

    }

    public Produto ( String nomeProduto, String descricao, BigDecimal valor, double peso){

        this.nomeProduto = Utils.validaTextoNumero(nomeProduto);
        this.descricao = Utils.validaTextoNumero(descricao);
        this.valor = valor;
        this.peso = peso;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = Utils.validaTextoNumero(nomeProduto);
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = Utils.validaTextoNumero(descricao);
    }

    public BigDecimal getValor(){
        return valor;
    }

    public void setValor(BigDecimal valor){
        this.valor = valor;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }


}
