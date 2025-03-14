package com.RoxCrochet.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Long IdProducto;
    private String NombreP;
    private double PrecioP;
    private String DescripcionP;
    private int CantidadP;
    private String rutaImagen;
    private boolean activo;
    
    
    public Long getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.IdProducto = idProducto;
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String nombreP) {
        this.NombreP = nombreP;
    }

    public double getPrecioP() {
        return PrecioP;
    }

    public void setPrecioP(double precioP) {
        this.PrecioP = precioP;
    }

    public String getDescripcionP() {
        return DescripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.DescripcionP = descripcionP;
    }

    public int getCantidadP() {
        return CantidadP;
    }

    public void setCantidadP(int cantidadP) {
        this.CantidadP = cantidadP;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
