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
public class RolPermiso {
    
   private Long id;
   private Long idRol;
    private Long idPermiso;
    private LocalDate fechaAsignacion;

    public RolPermiso(Long id, Long idRol, Long idPermiso, LocalDate fechaAsignacion) {
        this.id = id;
        this.idRol = idRol;
        this.idPermiso = idPermiso;
        this.fechaAsignacion = fechaAsignacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public Long getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(Long idPermiso) {
        this.idPermiso = idPermiso;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    @Override
    public String toString() {
        return "RolPermiso{" + "id=" + id + ", idRol=" + idRol + ", idPermiso=" + idPermiso + ", fechaAsignacion=" + fechaAsignacion + '}';
    }
    
}
