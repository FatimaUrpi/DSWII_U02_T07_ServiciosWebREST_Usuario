/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u02.t05.dswii_u02_t07_servicioswebrest_usuario.model;

import java.time.LocalDate;

/**
 *
 * @author SUITE
 */
public class Permiso {
    
     private Long idPermiso;
    private Long idUsuario;
    private Long idRol;
    private LocalDate fechaAsignacion;

    public Permiso(Long idPermiso, Long idUsuario, Long idRol, LocalDate fechaAsignacion) {
        this.idPermiso = idPermiso;
        this.idUsuario = idUsuario;
        this.idRol = idRol;
        this.fechaAsignacion = fechaAsignacion;
    }

    public Long getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(Long idPermiso) {
        this.idPermiso = idPermiso;
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
        return "Permiso{" + "idPermiso=" + idPermiso + ", idUsuario=" + idUsuario + ", idRol=" + idRol + ", fechaAsignacion=" + fechaAsignacion + '}';
    }
    

}
