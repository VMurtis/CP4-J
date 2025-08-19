package br.com.fiap.cp4.dto.Cliente;

public record ClienteDto(
        Long id,


        String nome,

        String cpf,


        String email,


        String telefone
) {
}
