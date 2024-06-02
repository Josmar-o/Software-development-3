/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Omar Garcia
 */
public class Camion extends Vehiculo {

    public Camion(String marca, String modelo, int anio, double precioPorDia) {
        super(marca, modelo, anio, precioPorDia);
        setTipoDeVehiculo("Camion");
    }
        @Override
    public double calcularPrecioAlquiler(int dias){
        return getPrecioPorDia() * dias * 1.5;
    }
    
}
