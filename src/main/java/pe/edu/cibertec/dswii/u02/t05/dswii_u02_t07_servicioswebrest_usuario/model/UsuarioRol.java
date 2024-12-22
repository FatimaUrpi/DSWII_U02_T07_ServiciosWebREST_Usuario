/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u02.t05.dswii_u02_t07_servicioswebrest_usuario.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author SUITE
 */
public class UsuarioRol implements Serializable {
     public static final long serialVersionUID = 1L;
 
      private Long idUsuarioRol;
    private Usuario idUsuario;  // Relación con Usuario
     private Rol id;  // Relación con Usuario
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;

    public UsuarioRol() {
    }

    public UsuarioRol(Long idUsuarioRol, Usuario idUsuario, Rol id) {
        this.idUsuarioRol = idUsuarioRol;
        this.idUsuario = idUsuario;
        this.id = id;
        this.fechaCreacion =  LocalDateTime.now();
        this.fechaActualizacion =  this.fechaCreacion;
    }

    public Long getIdUsuarioRol() {
        return idUsuarioRol;
    }

    public void setIdUsuarioRol(Long idUsuarioRol) {
        this.idUsuarioRol = idUsuarioRol;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Rol getId() {
        return id;
    }

    public void setId(Rol id) {
        this.id = id;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    @Override
    public String toString() {
        return "UsuarioRol{" + "idUsuarioRol=" + idUsuarioRol + ", idUsuario=" + idUsuario + ", id=" + id + ", fechaCreacion=" + fechaCreacion + ", fechaActualizacion=" + fechaActualizacion + '}';
    }


    
}
