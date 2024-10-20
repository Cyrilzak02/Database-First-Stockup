package repositories;

import classes.VendaProduto;
import classes.VendaProdutoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaProdutoRepository extends JpaRepository<VendaProduto, VendaProdutoId> {
}