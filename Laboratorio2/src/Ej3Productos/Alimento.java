/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3Productos;
import java.time.LocalDate;

/**
 *
 * @author omargarcia
 */
public class Alimento extends Producto{
    private LocalDate fechaExp;
    private boolean esOrganico;

    public Alimento(LocalDate fechaExp, boolean esOrganico, String nombre, double precio, double impuesto, double descuento) {
        super(nombre, precio, impuesto, descuento);
        this.fechaExp = fechaExp;
        this.esOrganico = esOrganico;
    }

    public LocalDate getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(LocalDate fechaExp) {
        this.fechaExp = fechaExp;
    }

    public boolean isEsOrganico() {
        return esOrganico;
    }

    public void setEsOrganico(boolean esOrganico) {
        this.esOrganico = esOrganico;
    }
    
    
    
    
    
    
    
}
