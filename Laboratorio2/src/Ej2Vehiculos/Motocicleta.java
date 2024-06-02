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

    public Motocicleta() {

    }

    public Motocicleta( double velMax, double CombusPorKm) {
        super(velMax, CombusPorKm);
        setCantLlantas(2);
        setTipoDeVehiculo("Motocicleta");
    }



    
    
    
    
    
}
