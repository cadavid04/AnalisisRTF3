/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dominio.Solicitud;
import dominio.SolicitudDTO;
import dominio.Usuario;
import java.util.List;

/**
 *
 * @author itmanager
 */
public class SolicitudControlador {
    
   
    public List<Solicitud> listarSolicitud(Usuario usuario) {
        return null;
    }

 
    public void ingresar( SolicitudDTO solicitud) {
        solicitud.setDescripcion(solicitud.getDescripcion());
    }

    /**
     * Metodo en edicion
     * @param nota Objeto tipo NotaDTO
     */
    public void eliminar(SolicitudDTO solicitud) {
        solicitud.setDescripcion("");
    }
    
  
    
    
}
