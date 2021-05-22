/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Erwin
 */
public class Asistentes {
    
    private int nit;
    private String nombre;
    private String fecha;

    public Asistentes(int nit, String nombre, String fecha) {
        this.nit = nit;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Asistentes() {
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    
        
}
