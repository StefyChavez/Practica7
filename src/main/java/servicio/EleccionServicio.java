/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Eleccion;

/**
 *
 * @author admin
 */
public class EleccionServicio implements IEleccionServicio {
    
     private final List<Eleccion> eleccionList = new ArrayList<>();
     
     @Override
    public Eleccion crear(Eleccion eleccion) {
        this.eleccionList.add(eleccion);
        return eleccion;
    }
    
}
