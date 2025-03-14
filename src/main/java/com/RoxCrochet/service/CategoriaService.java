package com.RoxCrochet.service;

import com.RoxCrochet.domain.Categoria;
import com.RoxCrochet.repository.CategoriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;
    
    
    @Transactional(readOnly=true)
    public List<Categoria> getCategorias(boolean activos) {
        var lista = categoriaRepository.findAll();
        //Falta algo acá
        return lista;
    }
    
    @Transactional(readOnly=true)
    public Categoria getCategoria(Categoria categoria) {        
        return categoriaRepository.findById(categoria.getIdCategoria()).orElse(null);
    }
    
    @Transactional
    public void delete(Categoria categoria) {       
        categoriaRepository.delete(categoria);
    }
    
    @Transactional
    public void save(Categoria categoria) {
        categoriaRepository.save(categoria);
    }
    
    @Transactional
    public void update(Categoria categoria) {
        categoriaRepository.update(categoria)     
    }    
}