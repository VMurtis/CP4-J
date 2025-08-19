package br.com.fiap.cp4.controller;



import br.com.fiap.cp4.dto.fornecedor.FornecedorDto;
import br.com.fiap.cp4.model.entities.Fornecedor;
import br.com.fiap.cp4.service.FornecedorService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedor")
@RequiredArgsConstructor
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping
    @Transactional
    public void salve(@RequestBody @Valid FornecedorDto dto) {
        fornecedorService.save(dto);
    }

    @GetMapping
    public List<Fornecedor> getAll() {
        return fornecedorService.getAll();
    }
    @GetMapping("/{id}")
    public Fornecedor getById(@PathVariable Long id) {
        return fornecedorService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    @Transactional
    public Fornecedor update(@PathVariable Long id, @RequestBody FornecedorDto dto){
        return fornecedorService.update(id,dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        fornecedorService.deletar(id);
    }

    @PatchMapping("/{id}")
    @Transactional
    public Fornecedor atualizarParcial(@PathVariable Long id, @RequestBody FornecedorDto dto) {

        return fornecedorService.atualizarFornecedorParcial(id, dto);


    }


}
