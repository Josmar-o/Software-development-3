/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2Vehiculos;

/**
 *
 * @author omargarcia
 */
public class Automovil extends Vehiculo{
    public boolean aireAcondicionado;
    public boolean bolsasDeAire;
    public Automovil(){
        
    }

    public Automovil(boolean aireAcondicionado, boolean bolsasDeAire, double velMax, double CombusPorKm) {
        super(velMax, CombusPorKm);
        this.aireAcondicionado = aireAcondicionado;
        this.bolsasDeAire = bolsasDeAire;
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
    
    
    
    
    
}
