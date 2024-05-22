  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2Vehiculos;

/**
 *
 * @author Omar Garcia
 */
public class Vehiculo {
    public double velMax;
    public double combusPorKm;
    public int cantLlantas;
    
    Vehiculo(){
        
    }

    public Vehiculo(double velMax, double CombusPorKm) {
        this.velMax = velMax;
        this.combusPorKm = CombusPorKm;
    }

    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    public double getCombusPorKm() {
        return combusPorKm;
    }

    public void setCombusPorKm(double CombusPorKm) {
        this.combusPorKm = CombusPorKm;
    }

    public int getCantLlantas() {
        return cantLlantas;
    }

    public void setCantLlantas(int cantLlantas) {
        this.cantLlantas = cantLlantas;
    }
    
    
    
    
}
