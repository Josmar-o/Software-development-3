package Ej2Vehiculos;

public class Automovil extends Vehiculo {

    public Automovil() {
        
    }

    public Automovil( double velMax, double CombusPorKm) {
        super(velMax, CombusPorKm);
        setCantLlantas(5);
        setTipoDeVehiculo("Automovil");
        
    }
    


}
