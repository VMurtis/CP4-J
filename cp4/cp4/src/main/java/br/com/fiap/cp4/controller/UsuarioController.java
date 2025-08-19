package br.com.fiap.cp4.controller;

import br.com.fiap.cp4.dto.Ferramenta.FerramentaDto;
import br.com.fiap.cp4.dto.usuario.UsuarioDto;
import br.com.fiap.cp4.model.entities.Usuario;
import br.com.fiap.cp4.service.UsuarioService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody UsuarioDto usuario){
        usuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok().build();
    }
    /*@PostMapping
    @Transactional
    public void post(@RequestBody @Valid UsuarioDto dto) {
        usuarioService.salvarUsuario(dto);
    }*/

    @GetMapping
    public ResponseEntity<Usuario> buscarUsuarioPorEmail(@RequestParam Long id){
        return ResponseEntity.ok(usuarioService.buscarUsuarioPorId(id));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarUsuarioPorId(@RequestParam Long id){
        usuarioService.deletar(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarUsuarioPorId(@RequestParam Long id,
                                                      @RequestBody UsuarioDto usuario){
        usuarioService.update(id, usuario);
        return ResponseEntity.ok().build();
    }
}