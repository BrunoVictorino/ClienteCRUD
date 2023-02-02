package com.cadastro.cliente.cadastrocrud.service;

import com.cadastro.cliente.cadastrocrud.model.ClienteEntity;
import com.cadastro.cliente.cadastrocrud.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    public Optional<ClienteEntity> consulta(Integer id){
        return clienteRepository.findById(id);
    }

    public ClienteEntity salvar(ClienteEntity cliente){
        return clienteRepository.save(cliente);
    }
    void deletarCliente (Integer id){
     clienteRepository.deleteById(id);
    }
}
