package classes;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "fornecedor_produtos")
public class FornecedorProduto {
    @EmbeddedId
    private FornecedorProdutoId id;

    @MapsId("idproduto")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idproduto", nullable = false)
    private Produto idproduto;

    @MapsId("idfornecedor")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idfornecedor", nullable = false)
    private Fornecedore idfornecedor;

    @Column(name = "data_validade", nullable = false)
    private LocalDate dataValidade;

    @Column(name = "data_entrada", nullable = false)
    private LocalDate dataEntrada;

    @Column(name = "qtd", nullable = false)
    private Integer qtd;

    public FornecedorProdutoId getId() {
        return id;
    }

    public void setId(FornecedorProdutoId id) {
        this.id = id;
    }

    public Produto getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Produto idproduto) {
        this.idproduto = idproduto;
    }

    public Fornecedore getIdfornecedor() {
        return idfornecedor;
    }

    public void setIdfornecedor(Fornecedore idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

}