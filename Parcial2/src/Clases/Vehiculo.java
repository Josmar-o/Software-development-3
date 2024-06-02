/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Omar Garcia
 */
public abstract class Vehiculo {
     private String marca;
    private String modelo;
    private int anio;
    private double precioPorDia;
    private String tipoDeVehiculo;

    public Vehiculo(String marca, String modelo, int anio, double precioPorDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioPorDia = precioPorDia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(String tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }
    

    public abstract double calcularPrecioAlquiler(int dias);
    
}
