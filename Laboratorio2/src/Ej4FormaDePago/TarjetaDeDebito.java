  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej4FormaDePago;

/**
 *
 * @author omargarcia
 */
public class TarjetaDeDebito {
    private boolean online;
    private double SaldoDisponible;
    
    public TarjetaDeDebito(){
        
    }

    public TarjetaDeDebito(boolean online, double SaldoDisponible) {
        this.online = online;
        this.SaldoDisponible = SaldoDisponible;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean esOnline) {
        this.online = esOnline;
    }

    public double getSaldoDisponible() {
        return SaldoDisponible;
    }

    public void setSaldoDisponible(double SaldoDisponible) {
        this.SaldoDisponible = SaldoDisponible;
    }
    
    
    
}
