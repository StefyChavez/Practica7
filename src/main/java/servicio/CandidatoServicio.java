/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Candidato;
/**
 *
 * @author admin
 */
public class CandidatoServicio implements ICandidatoServicio {
     private final List<Candidato> candidatoList = new ArrayList<>();
     
     @Override
    public Candidato crear(Candidato candidato) {
        this.candidatoList.add(candidato);
        return candidato;
    }  

}
