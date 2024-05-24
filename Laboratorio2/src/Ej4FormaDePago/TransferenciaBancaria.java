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
public class TransferenciaBancaria extends FormaDePago{
    private boolean online;
    
    public TransferenciaBancaria(){
        
    }
    
    public TransferenciaBancaria(boolean online, double cantidad, LocalDate fechaDeTrans) {
        super(cantidad, fechaDeTrans);
        this.online = online;
    }

    public boolean isOnline() {
        return online;
    }

    public void setEsOnline(boolean esOnline) {
        this.online = esOnline;
    }
    
    
      
}
