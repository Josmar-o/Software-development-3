/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej4FormaDePago;
import java.time.LocalDate;

/**
 *
 * @author omargarcia
 */
public class FormaDePago {
    private double cantidad;
    private LocalDate fechaDeTrans;

    
    public FormaDePago(){
        
    }
    public FormaDePago(double cantidad, LocalDate fechaDeTrans) {
        this.cantidad = cantidad;
        this.fechaDeTrans = fechaDeTrans;
    }


    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaDeTrans() {
        return fechaDeTrans;
    }

    public void setFechaDeTrans(LocalDate fechaDeTrans) {
        this.fechaDeTrans = fechaDeTrans;
    }

    
    
    
    
}
