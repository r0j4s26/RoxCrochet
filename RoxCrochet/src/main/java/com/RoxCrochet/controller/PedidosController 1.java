package com.RoxCrochet.controller;

import com.RoxCrochet.domain.Pedidos;
import com.RoxCrochet.service.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pedidos")
public class PedidosController {
    
    @Autowired
    private PedidosService pedidosService;

    @GetMapping("/listado")
    public String listado(Model model) {        
        var pedidos = pedidoService.getPedidos(false);        
        model.addAttribute("pedidos", pedidos);      
        var categorias = categoriaService.getCategorias(false);
        model.addAttribute("categorias", categorias);    
        return "/pedidos/listado";
}
    
    @GetMapping("/editar/{idPedidos}")
    public String modificar(Categoria categoria, Model model) {        
        categoria=categoriaService.getCategoria(categoria);
        model.addAttribute("pedidos", categoria);
        return "/pedidos/modifica";
    }  
    
    @GetMapping("/eliminar/{idPedidos}")
    public String eliminar(){
        administradorService.delete(administrador);
        return "redirect:/pedidos/listado";   
    }       
}
