package classes;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "fornecedores")
public class Fornecedore {
    @Id
    @Column(name = "idfornecedores", nullable = false)
    private Integer id;

    @Column(name = "razao_social", nullable = false, length = 45)
    private String razaoSocial;

    @OneToMany(mappedBy = "fornecedore")
    private Set<FornecedorProduto> fornecedorProdutos = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Set<FornecedorProduto> getFornecedorProdutos() {
        return fornecedorProdutos;
    }

    public void setFornecedorProdutos(Set<FornecedorProduto> fornecedorProdutos) {
        this.fornecedorProdutos = fornecedorProdutos;
    }

}