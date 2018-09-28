/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.dao;

import dominio.Solicitud;
import java.util.List;

/**
 *
 * @author itmanager
 */
public interface SolicitudDAO {
    
     public boolean createNota(Solicitud solicitud);//Crear 

    public List<Solicitud> getAllNota(); //Consultar

    public boolean deleteNota(Solicitud solicitud); // Eliminar

    public boolean updateNota(Solicitud solicitud); //Actualizar
    
}
