/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.List;
import modelo.Candidato;
import servicio.CandidatoServicio;

/**
 *
 * @author admin
 */
public class CandidatoControl {
    
    private final CandidatoServicio candidatoServicio = new CandidatoServicio();
    
    public Candidato crear(String [] params){
        var candidato = new Candidato(Integer.valueOf(params[0]),params[1]);
        this.candidatoServicio.crear(candidato);
        return candidato;
    }

    public Object listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
