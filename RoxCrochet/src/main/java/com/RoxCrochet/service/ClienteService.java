package com.RoxCrochet.service;

import com.RoxCrochet.domain.Cientes;
import com.RoxCrochet.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    
    @Transactional(readOnly=true)
    public List<Clientes> getIdCliente(boolean activos) {
        var lista = clienteRepository.findAll();
        //Falta algo acá
        return lista;
    }
    
    //Se escriben los métodos de un CRUD Create Read Update Delete
    @Transactional(readOnly=true)
    public Cliente getIdCliente(Cliente cliente) {        
        return clienteRepository.findById(cliente.getIdCliente()).orElse(null);
    }
    
    @Transactional
    public void delete(Cliente cliente) {
        //Elimina el registro que contiene el id igual a lo pasado en categoria.getIdCategoria()
        categoriaRepository.delete(cliente);
    }
    
    @Transactional
    public void save(Cliente cliente) {
        // si categoria.idCategoria está vacío... se inserta un registro
        // si categoria.idCategoria tiene algo... se modifica ese registro
        clienteRepository.save(cliente);
    }
    
    @Transactional
    public void update(Cliente cliente) {
        clienteRepository.update(cliente)     
    }
}
