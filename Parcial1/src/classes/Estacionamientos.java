/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;


/**
 *
 * @author Omar Garcia
 */
public class Estacionamientos {
    private int horas;
    private double precio;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void calcularPrecio() {
        if (horas <= 2) {
            precio = horas * 5.;
        } else if (horas <= 5) {
            precio = 10 + ((horas - 2) * 4);
        } else if (horas <= 10) {
            precio = 10 + 12 + ((horas - 5) * 3);
        } else {
            precio = 10 + 12 + 15 + ((horas - 10) * 2);
        }
    }
    
    
}
