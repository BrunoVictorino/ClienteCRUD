package com.cadastro.cliente.cadastrocrud.controller;

import com.cadastro.cliente.cadastrocrud.service.ClienteService;
import com.cadastro.cliente.cadastrocrud.model.ClienteEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService service;

    @GetMapping("/consulta/{id}")
    public ResponseEntity consulta(@PathVariable ("id") Integer id){
        return ResponseEntity.ok(service.consulta(id));
    }

    @PostMapping("/cadastro")
    public ResponseEntity cadastro(@RequestBody ClienteEntity cliente){
        return ResponseEntity.ok(service.salvar(cliente));
    }
    @DeleteMapping("/deletar/{id}")
    void deletar(@PathVariable ("id") Integer id){
       deletar(id);
    }

}
