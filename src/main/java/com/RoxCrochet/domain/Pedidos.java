package com.RoxCrochet.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="pedidos")
public class Pedidos implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pedidos")
    private Long IdPedidos;
    private String Direccion;
    
     public Long getIdPedidos() {
        return IdPedidos;
    }

    public void setIdPedidos(Long idPedidos) {
        this.IdPedidos = idPedidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

}
