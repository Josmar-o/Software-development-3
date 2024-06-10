/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej6Libros;

/**
 *
 * @author Omar Garcia
 */
public class Publicacion {
    protected String titulo;
    protected String tipo;
    protected double descuento;
    protected double precioInicial;
    protected double precioFinal;
    protected final double itbms = 7;
    
    public Publicacion(){
        
    }
    public Publicacion(String titulo, double precioInicial) {
        this.titulo = titulo;
        this.precioInicial = precioInicial;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioInicial() {
        return precioInicial;
    }

    public void setPrecioInicial(double precio) {
        this.precioInicial = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public double getItbms() {
        return itbms;
    }

   
    

    
}
