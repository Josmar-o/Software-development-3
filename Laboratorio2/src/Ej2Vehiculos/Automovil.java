package Ej2Vehiculos;

public class Automovil extends Vehiculo {
    private boolean aireAcondicionado;
    private boolean bolsasDeAire;

    public Automovil() {
        
    }

    public Automovil(boolean aireAcondicionado, boolean bolsasDeAire, double velMax, double CombusPorKm, int cantLlantas) {
        super(velMax, CombusPorKm, cantLlantas);
        this.aireAcondicionado = aireAcondicionado;
        this.bolsasDeAire = bolsasDeAire;
        this.setTipoVehiculo("Automovil"); 
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isBolsasDeAire() {
        return bolsasDeAire;
    }

    public void setBolsasDeAire(boolean bolsasDeAire) {
        this.bolsasDeAire = bolsasDeAire;
    }

    private void setTipoVehiculo(String automovil) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
