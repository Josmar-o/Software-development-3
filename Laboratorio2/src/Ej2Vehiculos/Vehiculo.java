package Ej2Vehiculos;

public class Vehiculo {
    private double velMax;
    private double combusPorKm;
    private int cantLlantas;
    private String tipoDeVehiculo;

    public Vehiculo() {
        
    }

    public Vehiculo(double velMax) {
        this.velMax = velMax;

    }

    public Vehiculo(double velMax, double combusPorKm) {
        this.velMax = velMax;
        this.combusPorKm = combusPorKm;
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

    public void setCombusPorKm(double combusPorKm) {
        this.combusPorKm = combusPorKm;
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
