package com.RoxCrochet.service;

import com.RoxCrochet.domain.Administrador;
import com.RoxCrochet.repository.AdministradorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdministradorService {
    
    @Autowired
    private AdminisradorRepository administradorRepository;
    
    
    @Transactional(readOnly=true)
    public List<Administrador> getIdAdministrador(boolean activos) {
        var lista = categoriaRepository.findAll();
        //Falta algo acá
        return lista;
    }
        
    @Transactional(readOnly=true)
    public Categoria getIdAdministrador(Administardor administrador) {        
        return categoriaRepository.findById(administrador.getIdAdministrador()).orElse(null);
    }
    
    @Transactional
    public void delete(Administardor administrador) {
        administradorRepository.delete(administrador);
    }
    
    @Transactional
    public void save(Administardor administrador) {    
        administradorRepository.save(administrador);
    }
    @Transactional
    public void update(Categoria administrador) {
        administradorRepository.update(administrador)     
    } 
}