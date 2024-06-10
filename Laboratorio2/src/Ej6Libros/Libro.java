/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej6Libros;

/**
 *
 * @author Omar Garcia
 */
public class Libro extends Publicacion implements Descuento{
    private int numPag;

    public Libro() {
    }

    public Libro(String titulo, double precioInicial, int numPag) {
        super(titulo, precioInicial);
        this.numPag = numPag;
        setTipo("Libro");
        setDescuento(5);
        calcularPrecioFinal();
    }
    
    @Override
    public void calcularPrecioFinal(){
        this.precioFinal = this.precioInicial - ((this.descuento /100) * this.precioInicial) + ((this.itbms /100) * this.precioInicial) ;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    
   
    
}
