/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej1Empleados;

/**
 *
 * @author omargarcia
 */
public class Cliente extends Persona{
    public double limCred;
    
    public Cliente(){
        
    }

    public Cliente(double limCred, String cedula, String domicilio, String nombre) {
        super(cedula, domicilio, nombre);
        this.limCred = limCred;
    }
    

    public double getLimCred() {
        return limCred;
    }

    public void setLimCred(int limCred) {
        this.limCred = limCred;
    }
    
    
}
