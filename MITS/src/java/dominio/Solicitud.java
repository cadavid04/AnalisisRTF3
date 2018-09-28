/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author itmanager
 */
public class Solicitud extends SolicitudDTO {
    
    
    public void ingresar(SolicitudDTO solicitud) {
        this.setDescripcion(solicitud.getDescripcion());
    }

    public void modificar(SolicitudDTO solicitud) {
        this.setDescripcion(solicitud.getDescripcion());
    }

    public void eliminar(SolicitudDTO solicitud) {
        this.setDescripcion("");
    }
    
    
}
