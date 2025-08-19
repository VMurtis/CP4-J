package br.com.fiap.cp4.repository;

import br.com.fiap.cp4.model.entities.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

}