package br.com.fiap.cp4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "API CP4 está funcionando!";
    }

    @GetMapping("/")
    public String home() {
        return "Bem-vindo à API CP4! Use /health para verificar o status.";
    }
}
