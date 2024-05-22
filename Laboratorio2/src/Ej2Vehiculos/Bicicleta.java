/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2Vehiculos;

/**
 *
 * @author omargarcia
 */
public class Bicicleta extends Vehiculo{
    public boolean amortiguadores; 
    public boolean timbre;

    public Bicicleta() {

    }

    public Bicicleta(boolean amortiguadores, boolean timbre, double velMax, double CombusPorKm) {
        super(velMax, CombusPorKm);
        this.amortiguadores = amortiguadores;
        this.timbre = timbre;
    }

    public void setAmortiguadores(boolean amortiguadores) {
        this.amortiguadores = amortiguadores;
    }

    public void setTimbre(boolean timbre) {
        this.timbre = timbre;
    }
    
    
    
    
}
