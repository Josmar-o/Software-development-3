/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Omar Garcia
 */
public class CuentaBancaria {
    private String titular;
    private int numCuenta;
    private double saldo;

    
    public CuentaBancaria(){
        
    }
    public CuentaBancaria(String titular, int numCuenta, double saldo){
        this.titular = titular;
        this.numCuenta =  numCuenta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double deposito){
        this.saldo += deposito ;
    }
    public void retirar(double retiro){
        if(saldo < retiro){
            
        }else{
        this.saldo -= retiro;}
    }
    public void consultaSaldo(){
        System.out.println("El saldo de la cuenta " +  numCuenta + " es " + saldo);
    }
    public void transferir(CuentaBancaria destino, double monto){
        if (saldo >= monto){
            saldo -= monto;
            destino.depositar(monto); 
            
        } else {
            System.out.println("Saldo insuficiente, operacion cancelada");
        }
    }
    
    
    
}
