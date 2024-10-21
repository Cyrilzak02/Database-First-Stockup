package com.example.classes;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @Column(name = "idprodutos", nullable = false)
    private Integer id;

    @Column(name = "descricao", nullable = false, length = 45)
    private String descricao;

    @Column(name = "SKU", nullable = false, length = 45)
    private String sku;

    @Column(name = "qtd_estoque", nullable = false)
    private Integer qtdEstoque;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "idmanager")
    private Manager idmanager;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcategoria")
    private Categoria idcategoria;

    @Column(name = "preco_unitario")
    private Float precoUnitario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Manager getIdmanager() {
        return idmanager;
    }

    public void setIdmanager(Manager idmanager) {
        this.idmanager = idmanager;
    }

    public Categoria getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Categoria idcategoria) {
        this.idcategoria = idcategoria;
    }

    public Float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

}