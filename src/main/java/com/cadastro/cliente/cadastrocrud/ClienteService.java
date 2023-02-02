package com.cadastro.cliente.cadastrocrud;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    public Optional<Cliente> consulta(Integer id){
        return clienteRepository.findById(id);
    }

    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
