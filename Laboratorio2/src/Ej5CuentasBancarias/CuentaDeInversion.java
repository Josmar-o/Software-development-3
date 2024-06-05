/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5CuentasBancarias;

/**
 *
 * @author Omar Garcia
 */
public class CuentaDeInversion extends CuentaBancaria{
      private double tasaRendimiento;

    public CuentaDeInversion(String titular, double saldo, int numCuenta) {
        super(titular, saldo, numCuenta);
        setTipoDeCuenta("Cuenta De Inversion");
        tasaRendimiento = 7;
    }
    
    public double calcularRendimientoMensual(){
        double rendimiento = saldo * (tasaRendimiento / 100);
        return rendimiento;
    }

    public double getTasaRendimiento() {
        return tasaRendimiento;
    }

    public void setTasaRendimiento(double tasaRendimiento) {
        this.tasaRendimiento = tasaRendimiento;
    }
      
    
}
