package br.com.faltoupontoevirgula.projetospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.faltoupontoevirgula.projetospring.model.Produto;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
