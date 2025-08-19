package br.com.fiap.cp4.repository;

import br.com.fiap.cp4.model.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{


}
