/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3Productos;

/**
 *
 * @author omargarcia
 */
public class Ropa extends Producto{

    public Ropa(){ 
    }

    public Ropa(String marca, String nombre, double precio) {
        super(marca, nombre, precio);
        setTipo("Ropa");
    }
    
    @Override
    public void calcularPrecioTotal(){
        setDescuento(20);
        setImpuesto(7);
        this.precioTotal = precio -((this.descuento/100) * this.precio) + ((this.impuesto/100) * this.precio);
    }

}
