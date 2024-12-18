package pe.edu.cibertec.dswii.u02.t05.dswii_u02_t07_servicioswebrest_usuario.ws;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.dswii.u02.t05.dswii_u02_t07_servicioswebrest_usuario.model.Rol;
import pe.edu.cibertec.dswii.u02.t05.dswii_u02_t07_servicioswebrest_usuario.model.Usuario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SUITE
 */

@RestController
@RequestMapping("/api/Rol")
public class RolRestController {
    
 /**
     * Devuelve un Usuario en formato JSON.
     * 
     * @return Objeto Usuario en formato JSON.
     */
    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public Usuario getUsuarioJson() {
        return crearUsuario();
    }

    /**
     * Devuelve un Usuario en formato XML.
     * 
     * @return Objeto Usuario en formato XML.
     */
    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public Usuario getUsuarioXml() {
        return crearUsuario();
    }

    /**
     * Devuelve un Usuario en formato HTML.
     * 
     * @return String con estructura HTML del Usuario.
     */
    @GetMapping(value = "/html", produces = MediaType.TEXT_HTML_VALUE)
    public String getUsuarioHtml() {
        Usuario usuario = crearUsuario();

        // Estructura HTML del Usuario
        String html = """
              <html>
                <body>
                  <h1>Usuario</h1>
                  <p><strong>ID Usuario:</strong> #IdUsuario</p>
                  <p><strong>Nombre Usuario:</strong> #NombreUsuario</p>
                  <p><strong>Contraseña:</strong> #Contrasena</p>
                  <p><strong>Activo:</strong> #Activo</p>
                  <p><strong>Fecha de Actualización:</strong> #FechaActualizacion</p>
                  <p><strong>Roles:</strong></p>
                  <ul>
                    #Roles
                  </ul>
                </body>
              </html>
            """;

        // Generar lista de roles en HTML
        StringBuilder rolesHtml = new StringBuilder();
        for (Rol rol : usuario.getRoles()) {
            rolesHtml.append("<li>").append(rol.getNombre()).append("</li>");
        }

        // Reemplazar marcadores en la plantilla HTML
        return html
                .replace("#IdUsuario", String.valueOf(usuario.getIdUsuario()))
                .replace("#NombreUsuario", usuario.getNombreUsuario())
                .replace("#Contrasena", usuario.getContrasena())
                .replace("#Activo", String.valueOf(usuario.isActivo()))
                .replace("#FechaActualizacion", String.valueOf(usuario.getFechaActualizacion()))
                .replace("#Roles", rolesHtml.toString());
    }

    /**
     * Crea un objeto Usuario con datos predefinidos.
     * 
     * @return Objeto Usuario.
     */
    private Usuario crearUsuario() {
        // Crear un Usuario con datos predefinidos
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(1L);
        usuario.setNombreUsuario("Fatima");
        usuario.setContrasena("123");
        usuario.setActivo(true);
        usuario.setFechaActualizacion(LocalDate.of(2024, 12, 20));

        // Crear lista de roles
        List<Rol> roles = new ArrayList<>();
        roles.add(new Rol(1L, "Administrador"));
        roles.add(new Rol(2L, "Usuario"));

        usuario.setRoles(roles);

        return usuario;
    }
}