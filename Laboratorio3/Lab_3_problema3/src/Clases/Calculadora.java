/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Calculadora {
    
    public static double calcularPromedio(File archivo) throws IOException {
        ArrayList<Double> numeros = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                double numero = Double.parseDouble(linea);
                numeros.add(numero);
            }
        }
        
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        
        return suma / numeros.size();
    }
}
