/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej8Futbol;

/**
 *
 * @author Omar Garcia
 */
public class Medio extends Jugador{

    public Medio() {
    }
    
    public Medio(String nombre, double minJug, int goles, int dorsal) {
        super(nombre, minJug, goles, dorsal);
        setPosicion("Medio");
    }
    
}
