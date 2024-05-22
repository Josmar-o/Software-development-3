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
    private String material;
    private String talla;
    
    public Ropa(){ 
    }

    public Ropa(String nombre, double precio, double impuesto, double descuento) {
        super(nombre, precio, impuesto, descuento);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
}
