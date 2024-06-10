/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej6Libros;

/**
 *
 * @author Omar Garcia
 */
public class CD extends Publicacion implements Descuento{
    
    protected double minReproduccion;
    

    public CD() {
    }

    public CD(String titulo, double precioInicial, double minReproduccion) {
        super(titulo, precioInicial);
        this.minReproduccion = minReproduccion;
        setTipo("CD");
        setDescuento(7);
        calcularPrecioFinal();
    }
    
    
    @Override
    public void calcularPrecioFinal(){
        this.precioFinal = this.precioInicial - ((this.descuento /100) * this.precioInicial) + ((this.itbms /100) * this.precioInicial) ;
    }

    public double getMinReproduccion() {
        return minReproduccion;
    }

    public void setMinReproduccion(double minReproduccion) {
        this.minReproduccion = minReproduccion;
    }
    
    
}
