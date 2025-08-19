package br.com.fiap.cp4.model.entities;

import br.com.fiap.cp4.dto.Cliente.ClienteDto;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "TAB_CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, unique = true, length = 11)
    private String cpf;

    @Column(length = 100)
    private String email;

    @Column(length = 20)
    private String telefone;

    public Cliente(ClienteDto dto) {
        this.nome = dto.nome();
        this.cpf = dto.cpf();
        this.email = dto.email();
        this.telefone = dto.telefone();
    }


}
