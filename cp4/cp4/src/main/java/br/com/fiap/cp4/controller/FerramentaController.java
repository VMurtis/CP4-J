package br.com.fiap.cp4.controller;



import br.com.fiap.cp4.dto.Ferramenta.FerramentaDto;
import br.com.fiap.cp4.dto.fornecedor.FornecedorDto;
import br.com.fiap.cp4.model.entities.Ferramentas;
import br.com.fiap.cp4.model.entities.Fornecedor;
import br.com.fiap.cp4.service.FerramentaService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ferramenta")
@RequiredArgsConstructor
public class FerramentaController {
    @Autowired
    private FerramentaService ferramentaService;

    @PostMapping
    @Transactional
    public void post(@RequestBody @Valid FerramentaDto dto) {
        ferramentaService.save(dto);
    }

    @GetMapping
    public List<Ferramentas> getAll() {
        return ferramentaService.getAll();
    }
    @GetMapping("/{id}")
    public Ferramentas getById(@PathVariable Long id) {
        return ferramentaService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    @Transactional
    public Ferramentas update(@PathVariable Long id, @RequestBody FerramentaDto dto){
        return ferramentaService.update(id,dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        ferramentaService.deletar(id);
    }

    @PatchMapping("/{id}")
    @Transactional
    public Ferramentas atualizarParcial(@PathVariable Long id, @RequestBody FerramentaDto dto) {

        return ferramentaService.atualizarFornecedorParcial(id, dto);


    }

}
