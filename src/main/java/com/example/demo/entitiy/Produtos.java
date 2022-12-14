package com.example.demo.entitiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Double precoIndividual;
    private Double precoTotal;
    private Integer quantidade;

    public Produtos(Long id, String nome, Double precoIndividual, Double precoTotal, Integer quantidade) {
        this.id = id;
        this.nome = nome;
        this.precoIndividual = precoIndividual;
        this.precoTotal = precoTotal;
        this.quantidade = quantidade;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoIndividual() {
        return precoIndividual;
    }

    public void setPrecoIndividual(Double precoIndividual) {
        this.precoIndividual = precoIndividual;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        precoTotal = precoIndividual *quantidade;
        this.precoTotal = precoTotal;

    }


    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
