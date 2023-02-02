package com.cadastro.cliente.cadastrocrud;

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
    public ResponseEntity consulta(@RequestBody Cliente cliente){
        return ResponseEntity.ok(service.salvar(cliente));
    }

}
