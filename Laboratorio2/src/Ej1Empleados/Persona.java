/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej1Empleados;

/**
 *
 * @author omargarcia
 */
public abstract class Persona {
    public String cedula;
    public String domicilio;
    public String nombre;
    
    public Persona(){
        
    }
    public Persona(String cedula, String domicilio, String nombre){
      this.cedula = cedula;
      this.domicilio = domicilio;
      this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract String mostrarDetalles();
    
}
