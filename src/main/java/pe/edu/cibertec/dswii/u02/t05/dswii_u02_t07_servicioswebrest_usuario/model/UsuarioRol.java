/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u02.t05.dswii_u02_t07_servicioswebrest_usuario.model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author SUITE
 */
public class UsuarioRol {
       
    private Long id;
   private Long idUsuario;
    private Long idRol;
    private LocalDate fechaAsignacion;

    public UsuarioRol(Long id, Long idUsuario, Long idRol, LocalDate fechaAsignacion) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idRol = idRol;
        this.fechaAsignacion = fechaAsignacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    @Override
    public String toString() {
        return "UsuarioRol{" + "id=" + id + ", idUsuario=" + idUsuario + ", idRol=" + idRol + ", fechaAsignacion=" + fechaAsignacion + '}';
    }
    

    
}
