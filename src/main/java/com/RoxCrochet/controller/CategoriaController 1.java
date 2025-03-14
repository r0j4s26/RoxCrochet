package com.RoxCrochet.controller;

import com.RoxCrochet.domain.Categoria;
import com.RoxCrochet.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listado")
    public String listado(Model model) {        
        var categorias = categoriaService.getCategorias(false);        
        model.addAttribute("categorias", categorias);   
        return "/categoria/listado";
}
    
    @GetMapping("/editar/{idAdministrador}")
    public String modificar(Categoria categoria, Model model) {        
        categoria=categoriaService.getCategoria(categoria);
        model.addAttribute("categoria", categoria);
        return "/categoria/modifica";
    }  
    
    @GetMapping("/eliminar/{idAdministrador}")
    public String eliminar(){
        administradorService.delete(administrador);
        return "redirect:/administrador/listado";   
    }       
}
