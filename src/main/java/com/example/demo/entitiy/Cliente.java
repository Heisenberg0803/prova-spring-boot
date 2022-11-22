package com.example.demo.entitiy;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String endereco;
    private String cep;
    private Integer numero;
    private String formaPagamento;
    private Integer parcelas;
    private Double valorTotal;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Produtos> produtos;

    private List<Produtos> produtos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    public Cliente(List<Produtos> produtos) {
        this.produtos = produtos;
    }



    public Cliente(Long id, String endereco, String cep, Integer numero, String formaPagamento, Integer parcelas, Double valorTotal,List<Produtos> produtos) {
        this.id = id;
        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;
        this.formaPagamento = formaPagamento;
        this.parcelas = parcelas;
        this.valorTotal = valorTotal;
        this.produtos=produtos;

    }

    public List<Produtos> getProdutos() {
        return produtos;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Integer getParcelas() {
        return parcelas;


    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
        if(parcelas <10){
            valorTotal=valorTotal+(valorTotal*10)/100;
        }
    }

    public Double getValorTotal() {
            for(Produtos  z: produtos){
                valorTotal=z.getPrecoTotal()+valorTotal;
            }
        return valorTotal;

    }

    public void setValorTotal(Double valorTotal) {

        this.valorTotal = valorTotal;



    }
}
