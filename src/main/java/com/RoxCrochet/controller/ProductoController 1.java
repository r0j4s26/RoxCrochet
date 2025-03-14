package com.RoxCrochet.controller;

import com.RoxCrochet.domain.Producto;
import com.RoxCrochet.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tienda.service.FirebaseStorageService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;
       
    @GetMapping("/listado")
    public String listado(Model model) {        
        var producto=productoService.getProducto(false);        
        model.addAttribute("productos", producto);               
        var categorias=categoriaService.getCategorias(false);
        model.addAllAttributes(categorias);
        return "/administera/listado";
    }
    
    @GetMapping("/eliminar/{idProducto}")
    public String eliminar(Producto producto) {        
        productoService.delete(producto);
        return "redirect:/producto/listado";
    }
    
    @GetMapping("/modificar/{idProducto}")
    public String modificar(Producto producto, Model model) {        
        var producto=productoService.getProducto(producto);
        model.addAttribute("producto", producto);
        var categorias=categoriaService.getCategorias(false);
        model.addAllAttributes(categorias);
        return "/producto/modifica";
    }
    
    @Autowired
    private FirebaseStorageService firebaseStorageService;
    
    @PostMapping("/guardar")
    public String guardar(Producto producto,
            @RequestParam("imagenFile") MultipartFile imagenFile) {
        if (!imagenFile.isEmpty()) {
            productoService.save(producto);
            String ruta = firebaseStorageService
                    .cargaImagen(imagenFile,
                            "producto", 
                            producto.getIdProducto());
            producto.setRutaImagen(ruta);
        }
        productoService.save(producto);
        return "redirect:/producto/listado";
    }
}
