package br.com.fiap.cp4.service;


import br.com.fiap.cp4.dto.Ferramenta.FerramentaDto;
import br.com.fiap.cp4.dto.fornecedor.FornecedorDto;
import br.com.fiap.cp4.model.entities.Ferramentas;
import br.com.fiap.cp4.model.entities.Fornecedor;
import br.com.fiap.cp4.repository.FerramentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class FerramentaService {


    @Autowired
    private FerramentaRepository ferramentasRepository;

    public FerramentaService(FerramentaRepository ferramentasRepository) {
        this.ferramentasRepository = ferramentasRepository;
    }


    public Ferramentas save(FerramentaDto dto) {

        return ferramentasRepository.save(new Ferramentas(dto));
    }

    public List<Ferramentas> getAll() {
        return ferramentasRepository.findAll();
    }



    // Buscar por ID
    public Ferramentas buscarPorId(Long id) {
        return ferramentasRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ferramenta não encontrada com ID: " + id));
    }

    // Atualizar
    public Ferramentas update(Long id, FerramentaDto dto) {
        Ferramentas existente = buscarPorId(id);
        existente.setNome(dto.nome());
        existente.setTipo(dto.tipo());
        existente.setTamanho(dto.tamanho());
        existente.setPreco(dto.preco());
        return ferramentasRepository.save(existente);
    }


    // Deletar
    public void deletar(Long id) {
        if (!ferramentasRepository.existsById(id)) {
            throw new RuntimeException("Ferramenta não encontrada para exclusão com ID: " + id);
        }
        ferramentasRepository.deleteById(id);
    }


    @Transactional
    public Ferramentas atualizarFornecedorParcial(Long id, FerramentaDto dto) {
        Ferramentas ferramentaExistente = ferramentasRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ferrameta não encontrada"));

        Ferramentas ferramentaAtualizado = Ferramentas.builder()
                .id(ferramentaExistente.getId())
                .nome(dto.nome() != null ? dto.nome() : ferramentaExistente.getNome())
                .cnpj(dto.tipo() != null ? dto.tipo() : ferramentaExistente.getTipo())
                .email(dto.tamanho() != null ? dto.tamanho() : ferramentaExistente.getTamanho())
                .telefone(dto.preco() != null ? dto.preco() : ferramentaExistente.getPreco())
                .build();


        return ferramentasRepository.saveAndFlush(ferramentaAtualizado);
    }
}









