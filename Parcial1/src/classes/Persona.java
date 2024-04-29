/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Omar Garcia
 */
public class Persona {
    private double peso; 
    private double altura;
    private double imc;
    private String imcDesc;
    
    public Persona(){
        
    }

    public Persona(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getImcDesc() {
        return imcDesc;
    }

    public void setImcDesc(String imcDesc) {
        this.imcDesc = imcDesc;
    }
    
    public void calcularIMC() {
        imc = peso / (altura * altura);
    }

    public String getDescIMC() {
        double imc = this.imc;
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 24.9) {
            return "Normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }
    
}
