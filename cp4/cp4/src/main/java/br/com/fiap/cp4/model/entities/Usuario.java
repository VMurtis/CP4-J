package br.com.fiap.cp4.model.entities;


import br.com.fiap.cp4.dto.Ferramenta.FerramentaDto;
import br.com.fiap.cp4.dto.usuario.UsuarioDto;
import jakarta.persistence.*;
import lombok.*;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "TB_USUARIO")
@Entity

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "nome")
    private String nome;


    public Usuario(UsuarioDto dto){
        this.id = dto.id();
        this.nome = dto.nome();
        this.email = dto.email();
    }

}
