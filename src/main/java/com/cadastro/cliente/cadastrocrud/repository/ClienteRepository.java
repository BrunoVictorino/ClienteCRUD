package com.cadastro.cliente.cadastrocrud.repository;

import com.cadastro.cliente.cadastrocrud.model.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {
}
