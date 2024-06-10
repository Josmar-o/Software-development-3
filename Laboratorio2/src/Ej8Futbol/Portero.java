/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej8Futbol;

/**
 *
 * @author Omar Garcia
 */
public class Portero extends Jugador{

    public Portero() {
    }
    
    
    public Portero(String nombre, double minJug, int dorsal) {
        super(nombre, minJug, dorsal);
        setGoles(0);
        setPosicion("Portero");
    }
    
    
}
