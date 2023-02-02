package com.cadastro.cliente.cadastrocrud.repository;

import com.cadastro.cliente.cadastrocrud.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
