package com.RoxCrochet.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="administrador")
public class Administrador implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_administrador")
    private Long IdAdmin;
    private String NombreA;
    private String CorreoA;
    private String ContraseñaA;
    private boolean Estado;
    
    public Long getIdAdmin() {
        return IdAdmin;
    }

    public void setIdAdmin(Long idAdmin) {
        this.IdAdmin = idAdmin;
    }

    public String getNombreA() {
        return NombreA;
    }

    public void setNombreA(String nombreA) {
        this.NombreA = nombreA;
    }

    public String getCorreoA() {
        return CorreoA;
    }

    public void setCorreoA(String correoA) {
        this.CorreoA = correoA;
    }

    public String getContraseñaA() {
        return ContraseñaA;
    }

    public void setContraseñaA(String contraseñaA) {
        this.ContraseñaA = contraseñaA;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        this.Estado = estado;
    }
    
}
