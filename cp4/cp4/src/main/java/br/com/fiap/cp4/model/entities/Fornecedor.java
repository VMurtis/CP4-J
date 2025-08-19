package br.com.fiap.cp4.model.entities;

import br.com.fiap.cp4.dto.fornecedor.FornecedorDto;
import jakarta.persistence.*;
import jdk.jshell.Snippet;
import lombok.*;

@Entity
@Table(name = "T_FORNECEDOR")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, unique = true, length = 14)
    private String cnpj;

    @Column(length = 100)
    private String email;

    @Column(length = 20)
    private String telefone;

    public Fornecedor(FornecedorDto dto) {
        this.nome = dto.nome();
        this.cnpj = dto.cnpj();
        this.email = dto.email();
        this.telefone = dto.telefone();
    }

}