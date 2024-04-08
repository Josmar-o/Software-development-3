/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Omar Garcia
 */
public class Trabajo {
    private String nombre;
    private double horasTrabajadas;
    private double sueldoPorHora;
    private double sueldoSemanal;

    
    public Trabajo(){
        
    }
    
    public Trabajo (String nombre, double horasTrabajadas, double sueldoSemanal, double sueldoPorHora){
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
        this.sueldoSemanal = sueldoSemanal;      
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSueldoSemanal() {
        return sueldoSemanal;
    }

    public void setSueldoSemanal(double sueldoSemanal) {
        this.sueldoSemanal = sueldoSemanal;
    }

    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(double sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }
    
    public double sueldoTotal(double sueldoPorHora, double horasTrabajadas){
        if (horasTrabajadas > 40){
            double horasExtras = horasTrabajadas - 40;
            double sueldoTotal = ((horasExtras * (sueldoPorHora * 2)) + (40 * sueldoPorHora));
            return sueldoTotal;
        }else{
            return 40 * sueldoPorHora;
        }
    }
   
    
}
