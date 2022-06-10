/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Eleccion;
import servicio.EleccionServicio;

/**
 *
 * @author admin
 */
public class EleccionControl {
    
    private final EleccionServicio eleccionServicio = new EleccionServicio();
    
    public Eleccion crear(String [] params){
        var eleccion = new Eleccion(Integer.valueOf(params[0]),params[1]);
        this.eleccionServicio.crear(eleccion);
        return eleccion;
    }


    public Object listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
