package classes;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "manager")
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmanager", nullable = false)
    private Integer id;

    @Column(name = "nome", nullable = false, length = 20)
    private String nome;

    @Column(name = "cnpj", nullable = false, length = 15)
    private String cnpj;

    @Column(name = "email", nullable = false, length = 30)
    private String email;

    @Column(name = "senha", nullable = false, length = 20)
    private String senha;

    @Column(name = "manager_type", nullable = false, length = 45)
    private String managerType;

    @OneToMany(mappedBy = "idmanager")
    private Set<Produto> produtos = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getManagerType() {
        return managerType;
    }

    public void setManagerType(String managerType) {
        this.managerType = managerType;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }

}