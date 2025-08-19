package br.com.fiap.cp4.dto.Ferramenta;


public record FerramentaDto(
        Long id,
        String nome,
        String tipo,
        String tamanho,
        double preco
) {


}
