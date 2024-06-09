/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5CuentasBancarias;

import javax.swing.JOptionPane;

/**
 *
 * @author Omar Garcia
 */
public class CuentaCorriente extends CuentaBancaria{
    private double limiteCredito;
    public CuentaCorriente(){
        
    }

    public CuentaCorriente(String titular, int numCuenta, double limiteCredito) {
        super(titular, numCuenta);
        this.limiteCredito = limiteCredito;
        this.saldo += this.limiteCredito;
        setTipoDeCuenta("Cuenta Corriente");
    }
    
    @Override
    public void depositar(double cantidad) {
        if (saldo + cantidad <= limiteCredito) {
            saldo += cantidad;
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad no superior al Limite de Credito");
        }
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    


    
    
    
}
