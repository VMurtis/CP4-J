package br.com.fiap.cp4.controller;

import br.com.fiap.cp4.dto.Cliente.ClienteDto;
import br.com.fiap.cp4.dto.fornecedor.FornecedorDto;
import br.com.fiap.cp4.model.entities.Cliente;
import br.com.fiap.cp4.model.entities.Fornecedor;
import br.com.fiap.cp4.service.ClienteService;
import br.com.fiap.cp4.service.FornecedorService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    @Transactional
    public void salve(@RequestBody @Valid ClienteDto dto) {
        clienteService.save(dto);
    }

    @GetMapping
    public List<Cliente> getAll() {
        return clienteService.getAll();
    }
    @GetMapping("/{id}")
    public Cliente getById(@PathVariable Long id) {
        return clienteService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    @Transactional
    public Cliente update(@PathVariable Long id, @RequestBody ClienteDto dto){
        return clienteService.update(id,dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        clienteService.deletar(id);
    }

    @PatchMapping("/{id}")
    @Transactional
    public Cliente atualizarParcial(@PathVariable Long id, @RequestBody ClienteDto dto) {

        return clienteService.atualizarClienteParcial(id, dto);


    }


}
