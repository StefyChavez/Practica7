/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author admin
 */
public class Candidato {
    
    String nombre;
    int fechaNacimiento;
    String genero;
    String tituloUniversitario;
    Dignidad dignidad;

    public Candidato(String nombre, int fechaNacimiento, String genero, String tituloUniversitario) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.tituloUniversitario = tituloUniversitario;
    }

    public Candidato(Integer valueOf, String param) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTituloUniversitario() {
        return tituloUniversitario;
    }

    public void setTituloUniversitario(String tituloUniversitario) {
        this.tituloUniversitario = tituloUniversitario;
    }

    public Dignidad getDignidad() {
        return dignidad;
    }

    public void setDignidad(Dignidad dignidad) {
        this.dignidad = dignidad;
    }

    @Override
    public String toString() {
        return "Candidato{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + ", tituloUniversitario=" + tituloUniversitario + ", dignidad=" + dignidad + '}';
    }

    
    public String obtenerTituloUniversitario(){
        return null;
    }
    
    public int obtenerPopularidad(){
        return 0;
    }
}
