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
    private double velMax;
    private double combusPorKm;
    private int cantLlantas;
    private String tipoDeVehiculo;
    
    Vehiculo(){
        
    }
    
    public Vehiculo(double velMax, int cantLlantas){
        this.velMax = velMax;
        this.cantLlantas = cantLlantas;
    }

    public Vehiculo(double velMax, double CombusPorKm, int cantLlantas) {
        this.velMax = velMax;
        this.combusPorKm = CombusPorKm;
        this.cantLlantas = cantLlantas;
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

    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(String tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }
    

}
