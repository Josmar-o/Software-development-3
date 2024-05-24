/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej4FormaDePago;

import java.time.LocalDate;

/**
 *
 * @author omargarcia
 */
public class TarjetaDeCredito extends FormaDePago{
    private double limiteCred;
    private boolean online;
    
    public TarjetaDeCredito(){
        
    }

    public TarjetaDeCredito(double limiteCred, double cantidad, LocalDate fechaDeTrans, boolean online) {
        super(cantidad, fechaDeTrans);
        this.online = online;
        this.limiteCred = limiteCred;
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    } 

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
    
}
