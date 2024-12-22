/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u02.t05.dswii_u02_t07_servicioswebrest_usuario.ws;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.dswii.u02.t05.dswii_u02_t07_servicioswebrest_usuario.model.Permiso;

/**
 *
 * @author SUITE
 */
@RestController
@RequestMapping("/permisos")

public class PermisoRestController {
  @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Permiso> getPermisosJson() {
        return createStaticPermisos();
    }

    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public List<Permiso> getPermisosXml() {
        return createStaticPermisos();
    }

    @GetMapping(value = "/html", produces = MediaType.TEXT_HTML_VALUE)
    public String getPermisosHtml() {
        List<Permiso> permisos = createStaticPermisos();
        StringBuilder html = new StringBuilder("""
                <html>
                    <body>
                        <h1>Listado de Permisos</h1>
                        <table border='1'>
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Nombre</th>
                                    <th>Descripción</th>
                                    <th>Fecha Creación</th>
                                    <th>Fecha Actualización</th>
                                </tr>
                            </thead>
                            <tbody>
                """);

        for (Permiso permiso : permisos) {
            html.append("<tr>")
                .append("<td>").append(permiso.getIdPermiso()).append("</td>")
                .append("<td>").append(permiso.getNombre()).append("</td>")
                .append("<td>").append(permiso.getDescripcion()).append("</td>")
                .append("<td>").append(permiso.getFechaCreacion()).append("</td>")
                .append("<td>").append(permiso.getFechaActualizacion()).append("</td>")
                .append("</tr>");
        }

        html.append("""
                            </tbody>
                        </table>
                    </body>
                </html>
                """);

        return html.toString();
    }

    // Método auxiliar para crear datos estáticos
    private List<Permiso> createStaticPermisos() {
        List<Permiso> permisos = new ArrayList<>();
        permisos.add(new Permiso(1L, "Crear Usuarios", "Permite crear nuevos usuarios"));
        permisos.add(new Permiso(2L, "Eliminar Usuarios", "Permite eliminar usuarios existentes"));
        permisos.add(new Permiso(3L, "Actualizar Usuarios", "Permite actualizar información de los usuarios"));
        permisos.add(new Permiso(4L, "Leer Usuarios", "Permite leer información de los usuarios"));
        return permisos;
    }
}