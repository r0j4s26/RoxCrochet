package com.RoxCrochet.repository;

import com.RoxCrochet.domain.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedidos, Long>{
    
}
