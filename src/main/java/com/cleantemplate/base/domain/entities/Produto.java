package com.cleantemplate.base.domain.entities;

import com.cleantemplate.base.domain.entities.enums.DisponibilidadeEnum;

public class Produto {
    
    private Long id;
    private String nomeProduto;
    private double valorProduto;
    private DisponibilidadeEnum disponibilidade;
    private int quantidade;
    private String descricao;
    private String marca;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public double getValorProduto() {
        return valorProduto;
    }
    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }
    public DisponibilidadeEnum getDisponibilidade() {
        return disponibilidade;
    }
    public void setDisponibilidade(DisponibilidadeEnum disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    

}
