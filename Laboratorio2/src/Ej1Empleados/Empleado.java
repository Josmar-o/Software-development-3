/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej1Empleados;

/**
 *
 * @author Omar Garcia
 */
public class Empleado extends Persona {
    public int horasTrab;
    public double sueldoHora;
    public double sueldoFinal;
    
    public Empleado(){
        
    }

    public Empleado(int horasTrab, double sueldoHora, String cedula, String domicilio, String nombre) {
        super(cedula, domicilio, nombre);
        this.horasTrab = horasTrab;
        this.sueldoHora = sueldoHora;
        this.sueldoFinal = calcularSalarioFinal();
    }
    

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    public double getSueldoHora() {
        return sueldoHora;
    }

    public void setSueldoHora(double sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    public double getSueldoFinal() {
        return sueldoFinal;
    }

    public void setSueldoFinal(double sueldoFinal) {
        this.sueldoFinal = sueldoFinal;
    }
    
    public double calcularSalarioFinal(){
        return sueldoHora * horasTrab;
    }
    
}
