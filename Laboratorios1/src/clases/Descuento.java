/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Omar Garcia
 */
public class Descuento {
    private String descripcion;
    private double descuentoCan;
    private double precio;
    
    public Descuento(){
        
    }
    public Descuento(String descripcion, double descuentoCan, double precio){
        this.descripcion = descripcion;
        this.descuentoCan = descuentoCan;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getDescuentoCan() {
        return descuentoCan;
    }

    public void setDescuentoCan(double descuentoCan) {
        this.descuentoCan = descuentoCan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double descuentoCal (double precio){
        if (precio >= 200){
            return precio * 0.15;
        }else if(precio >= 100){
            return precio * 0.12;
        }else if (precio < 100 && precio > 0){
            return precio * 0.1;
        }else{
            return 0;
        }        
    } 
}
