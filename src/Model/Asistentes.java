/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Asistentes {
    
    private int nit;
    private String nombre;
    private String direccion;
    private String fecha;
    
    
    public  int max = 125, perm = 50;
    
    
    /*
    
        CONTRUCTOR VACIO Y CON PARAMATROS
    
    */
    
    // CONTRUCTOR CON PARAMETROS
    public Asistentes(int nit, String nombre, String fecha, String direccion, int max ) {
        this.nit = nit;
        this.max = max;
        this.nombre = nombre;
        this.fecha = fecha;
        this.direccion = direccion;
    }
    
    //CONTRUCTOR VACIO
    public Asistentes() {
    }

    
        /*
        USO DE GETTER Y SETTER
    */
    
    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
    
    public void setMax(int max) {
        this.max = max;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
  
    
     
     
     public int hashCode(){
         int indice = (nit & 0x7fffffff) % max;
         
         return indice;
     }
    
    
    
    
}
