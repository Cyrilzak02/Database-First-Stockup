package classes;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class VendaProdutoId implements Serializable {
    private static final long serialVersionUID = 590818880935436359L;
    @Column(name = "idvenda", nullable = false)
    private Integer idvenda;

    @Column(name = "idproduto", nullable = false)
    private Integer idproduto;

    public Integer getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(Integer idvenda) {
        this.idvenda = idvenda;
    }

    public Integer getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Integer idproduto) {
        this.idproduto = idproduto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        VendaProdutoId entity = (VendaProdutoId) o;
        return Objects.equals(this.idvenda, entity.idvenda) &&
                Objects.equals(this.idproduto, entity.idproduto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idvenda, idproduto);
    }

}