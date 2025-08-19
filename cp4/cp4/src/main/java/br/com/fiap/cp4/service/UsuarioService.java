package br.com.fiap.cp4.service;

import br.com.fiap.cp4.dto.usuario.UsuarioDto;
import br.com.fiap.cp4.model.entities.Ferramentas;
import br.com.fiap.cp4.model.entities.Usuario;
import br.com.fiap.cp4.repository.UsuarioRepository;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvarUsuario(UsuarioDto usuario){
        return usuarioRepository.save(new Usuario(usuario));//FLush salva e fecha a conexao
    }



    public Usuario buscarUsuarioPorId(Long id){

        return usuarioRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuário não encontrado")
        );
    }


    // Atualizar
    public Usuario update(Long id, UsuarioDto dto) {
        Usuario existente = buscarUsuarioPorId(id);
        existente.setNome(dto.nome());
        existente.setEmail(dto.email());

        return usuarioRepository.save(existente);
    }

    // Deletar
    public void deletar(Long id) {
        if (!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrada para exclusão com ID: " + id);
        }
        usuarioRepository.deleteById(id);
    }



}
