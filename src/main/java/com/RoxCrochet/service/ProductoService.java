package com.RoxCrochet.service;

import com.RoxCrochet.domain.Producto;
import com.RoxCrochet.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoService {
    
    @Autowired
    private ProductoRepository productoRepository;
        
    @Transactional(readOnly=true)
    public List<Producto> getIdProducto(boolean activos) {
        var lista = productoRepository.findAll();
        //Falta algo acá
        return lista;
    }
    
    @Transactional(readOnly=true)
    public Producto getIdProducto(Producto producto) {        
        return productoRepository.findById(producto.getIdProducto()).orElse(null);
    }
    
    @Transactional
    public void delete(Producto producto) {      
        productoRepository.delete(producto);
    }
    
    @Transactional
    public void save(Producto producto) {        
        productoRepository.save(producto);
    }
    
    @Transactional
    public void update(Producto producto) {
        productoRepository.update(producto)     
    }
}
