package com.RoxCrochet.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class Clientes implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cliente")
    private Long IdCliente;
    private String NombreC; 
    private String TelefonoC;
    private String CorreoC;
    private String ContraseñaC;
    
    public Long getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.IdCliente = idCliente;
    }

    public String getNombreC() {
        return NombreC;
    }

    public void setNombreC(String nombreC) {
        this.NombreC = nombreC;
    }

    public String getTelefonoC() {
        return TelefonoC;
    }

    public void setTelefonoC(String telefonoC) {
        this.TelefonoC = telefonoC;
    }

    public String getCorreoC() {
        return CorreoC;
    }

    public void setCorreoC(String correoC) {
        this.CorreoC = correoC;
    }

    public String getContraseñaC() {
        return ContraseñaC;
    }

    public void setContraseñaC(String contraseñaC) {
        this.ContraseñaC = contraseñaC;
    }
        
}
