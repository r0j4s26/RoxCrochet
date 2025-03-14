package com.RoxCrochet.repository;

import com.RoxCrochet.domain.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Clientes, Long>{
    
}

