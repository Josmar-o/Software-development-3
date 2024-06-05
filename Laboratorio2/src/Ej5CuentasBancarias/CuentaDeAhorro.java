/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5CuentasBancarias;

/**
 *
 * @author Omar Garcia
 */
public class CuentaDeAhorro extends CuentaBancaria{
    private double tasaInteres;

    public CuentaDeAhorro() {
    }

    public CuentaDeAhorro(String titular, double saldo, int numCuenta) {
        super(titular, saldo, numCuenta);
        setTipoDeCuenta("Cuenta de Ahorro");
        this.tasaInteres = 5;
    }
    
    public double calcularInteres() {
        double interes = this.saldo * tasaInteres / 100;
        return interes;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    
 
}
