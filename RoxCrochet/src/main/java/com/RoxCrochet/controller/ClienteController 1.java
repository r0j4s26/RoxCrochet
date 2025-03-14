package com.RoxCrochet.controller;

import com.RoxCrochet.domain.Clientes;
import com.RoxCrochet.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
       
    @GetMapping("/listado")
    public String listado(Model model) {        
        var lista = clienteService.getClientes(false);        
        model.addAttribute("clientes", lista);  
        return "/cliente/listado";
}
    
    @GetMapping("/editar/{IdCliente}")
    public String modificar(Cliente cliente, Model model) {        
        cliente=clienteService.getClientes(cliente);
        model.addAttribute("cliente", categoria);
        return "/cliente/modifica";
    }  
    
    @GetMapping("/eliminar/{IdCliente}")
    public String eliminar(){
        ClienteService.delete(cliente);
        return "redirect:/cliente/listado";   
    }       
}
