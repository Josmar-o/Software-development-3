/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3Productos;


/**
 *
 * @author omargarcia
 */
public class Alimento extends Producto{

    public Alimento(){
        
    }

    public Alimento(String marca, String nombre, double precio) {
        super(marca, nombre, precio);
        setTipo("Alimento");
    }
    
    @Override
    public void calcularPrecioTotal(){
        setDescuento(10);
        setImpuesto(0);
        this.precioTotal = precio -((this.descuento/100) * this.precio) + ((this.impuesto/100) * this.precio);
    }
    
    

    
}
