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
public class administradorController {
        
  
    @GetMapping("/listado")
    public String listado() {        
        return "/administrador/listado";
                
}