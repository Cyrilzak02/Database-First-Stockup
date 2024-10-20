package classes;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FornecedorProdutoId implements Serializable {
    private static final long serialVersionUID = 455293434289344688L;
    @Column(name = "idproduto", nullable = false)
    private Integer idproduto;

    @Column(name = "idfornecedor", nullable = false)
    private Integer idfornecedor;

    public Integer getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Integer idproduto) {
        this.idproduto = idproduto;
    }

    public Integer getIdfornecedor() {
        return idfornecedor;
    }

    public void setIdfornecedor(Integer idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        FornecedorProdutoId entity = (FornecedorProdutoId) o;
        return Objects.equals(this.idfornecedor, entity.idfornecedor) &&
                Objects.equals(this.idproduto, entity.idproduto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idfornecedor, idproduto);
    }

}