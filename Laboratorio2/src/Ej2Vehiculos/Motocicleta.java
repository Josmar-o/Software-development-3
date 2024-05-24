/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2Vehiculos;

/**
 *
 * @author omargarcia
 */
public class Motocicleta extends Vehiculo{
    public boolean frenosABS;
    public boolean cajuela;

    public Motocicleta() {

    }

    public Motocicleta(boolean frenosABS, boolean cajuela, double velMax, double CombusPorKm, int cantLlantas) {
        super(velMax, CombusPorKm, cantLlantas);
        this.frenosABS = frenosABS;
        this.cajuela = cajuela;
    }



    public boolean isFrenosABS() {
        return frenosABS;
    }

    public void setFrenosABS(boolean frenosABS) {
        this.frenosABS = frenosABS;
    }

    public boolean isCajuela() {
        return cajuela;
    }

    public void setCajuela(boolean cajuela) {
        this.cajuela = cajuela;
    }
    
    
    
    
    
}
