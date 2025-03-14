package com.RoxCrochet.service;

import com.RoxCrochet.domain.Pedidos;
import com.RoxCrochet.repository.PedidoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PedidosService {
    
    @Autowired
    private PedidoRepository pedidoRepository;
    
    
    @Transactional(readOnly=true)
    public List<Pedidos> getIdPedidos(boolean activos) {
        var lista = pedidoRepository.findAll();

        return lista;
    }
    
    @Transactional(readOnly=true)
    public Pedidos getIdPedidos(Pedidos pedidos) {        
        return pedidoRepository.findById(pedidos.getIdPedidos()).orElse(null);
    }
    
    @Transactional
    public void delete(Pedidos pedidos) {
        pedidoRepository.delete(pedidos);
    }
    
    @Transactional
    public void save(Pedidos pedidos) {
        pedidoRepository.save(categoria);
    }
    
    @Transactional
    public void update(Pedidos pedidos) {
        pedidoRepository.update(pedidos)     
    }
    
}
