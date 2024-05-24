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
   private int garantiaAnios;
   private String marca;
   public Electronico(){
       
   }

    public Electronico(int garantiaAnios, String marca, String nombre, double precio, double impuesto, double descuento) {
        super(nombre, precio, impuesto, descuento);      
        this.marca = marca;
        this.garantiaAnios = garantiaAnios;
    }

    public int getGarantiaAnios() {
        return garantiaAnios;
    }

    public void setGarantiaAnios(int garantiaAnios) {
        this.garantiaAnios = garantiaAnios;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
   
   
    
}
