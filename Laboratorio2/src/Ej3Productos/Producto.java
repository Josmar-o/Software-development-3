/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3Productos;

/**
 *
 * @author Omar Garcia
 */
public class Producto {
    private String nombre;
    private double precio;
    private double precioTotal; 
    private double impuesto;
    private double descuento;
    
    public Producto(){
        
    }

    public Producto(String nombre, double precio, double impuesto, double descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.impuesto = impuesto;
        this.descuento = descuento;
        calcularPrecioTotal();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    public void calcularPrecioTotal(){
        this.precioTotal = ((this.descuento/100) * this.precio) - precio + ((this.impuesto/100) * this.precio);
    }
    
}
