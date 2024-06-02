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


    public Bicicleta() {

    }

    public Bicicleta( double velMax) {
        super(velMax);
        setCantLlantas(2);
        setCombusPorKm(0);
        setTipoDeVehiculo("Bicicleta");
    }

    
    
    
}
