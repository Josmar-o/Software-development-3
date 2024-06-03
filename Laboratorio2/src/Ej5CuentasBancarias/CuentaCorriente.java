/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5CuentasBancarias;

/**
 *
 * @author Omar Garcia
 */
public class CuentaCorriente extends CuentaBancaria{
    private double limiteCredito;

    public CuentaCorriente(String titular, double saldo, int numCuenta, double limiteCredito) {
        super(titular, saldo, numCuenta);
        this.limiteCredito = limiteCredito;
        this.saldo += this.limiteCredito;
        setTipoDeCuenta("Cuenta Corriente");
    }
    
    @Override
    public void depositar(double cantidad) {
        if (saldo + cantidad <= limiteCredito) {
            saldo += cantidad;
        } else {
            
        }
    }


    
    
    
}