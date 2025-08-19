package br.com.fiap.cp4.repository;

import br.com.fiap.cp4.model.entities.Ferramentas;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;

public interface FerramentaRepository extends JpaRepository<Ferramentas, Long> {



}
