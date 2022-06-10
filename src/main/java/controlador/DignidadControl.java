/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Dignidad;
import servicio.DignidadServicio;

/**
 *
 * @author admin
 */
public class DignidadControl {
    
    private final DignidadServicio dignidadServicio = new DignidadServicio();
    
    public Dignidad crear(String [] params){
        var dignidad = new Dignidad(Integer.valueOf(params[0]),params[1]);
        this.dignidadServicio.crear(dignidad);
        return dignidad;
    }

    public Object listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
