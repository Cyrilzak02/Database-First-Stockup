package classes;

import jakarta.persistence.*;

@Entity
@Table(name = "venda_produto")
public class VendaProduto {
    @EmbeddedId
    private VendaProdutoId id;

    @MapsId("idvenda")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idvenda", nullable = false)
    private Venda idvenda;

    @MapsId("idproduto")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idproduto", nullable = false)
    private Produto idproduto;

    @Column(name = "qtd_produto", nullable = false)
    private Integer qtdProduto;

    public VendaProdutoId getId() {
        return id;
    }

    public void setId(VendaProdutoId id) {
        this.id = id;
    }

    public Venda getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(Venda idvenda) {
        this.idvenda = idvenda;
    }

    public Produto getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Produto idproduto) {
        this.idproduto = idproduto;
    }

    public Integer getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(Integer qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

}