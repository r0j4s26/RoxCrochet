package com.RoxCrochet.controller;

import com.RoxCrochet.domain.Administrador;
import com.RoxCrochet.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/administrador")
public class AdministradorController {
        
    @Autowired
    private AdministradorService administradorService;
    
    @GetMapping("/listado")
    public String listado(Model model) {        
        var administrador=AdministradorService.getAdministrador(false);        
        model.addAttribute("productos", administrador);               
        var categorias=categoriaService.getCategorias(false);
        model.addAllAttributes(categorias);
        return "/producto/listado";
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
