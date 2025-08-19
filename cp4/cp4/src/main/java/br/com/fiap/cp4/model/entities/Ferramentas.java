package br.com.fiap.cp4.model.entities;

import br.com.fiap.cp4.dto.Ferramenta.FerramentaDto;
import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
@Entity
@Table(name = "TAB_FERRAMENTA")
@SequenceGenerator(name = "abrigo", sequenceName = "SQ_TAB_FERRAMENTA", allocationSize = 1)
public class Ferramentas {

    @Id
    @Column(name = "id_ferramenta")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ferramenta")
    private Long id;

    @Column(name = "nome_ferramenta")
    private String Nome;

    @Column(name = "tipo_ferramenta")
    private String Tipo;

    @Column(name = "tamanho_ferramenta")
    private String Tamanho;

    @Column(name = "preco_ferramenta")
    private double Preco;



    public Ferramentas(FerramentaDto dto) {
        this.id = dto.id();
        this.Nome = dto.nome();
        this.Tipo = dto.tipo();
        this.Tamanho = dto.tamanho();
        this.Preco = dto.preco();
    }



}
