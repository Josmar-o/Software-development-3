/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3Productos;

/**
 *
 * @author omargarcia
 */
public class Electronico extends Producto{
   public Electronico(){
       
   }

    public Electronico(String marca, String nombre, double precio) {
        super(marca, nombre, precio);
        setTipo("Electronico");
    }
    
    @Override
    public void calcularPrecioTotal(){
        setDescuento(10);
        setImpuesto(7);
        this.precioTotal = precio -((this.descuento/100) * this.precio) + ((this.impuesto/100) * this.precio);
    }
 
}
