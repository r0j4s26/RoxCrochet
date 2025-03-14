package com.RoxCrochet.repository;

import com.RoxCrochet.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
