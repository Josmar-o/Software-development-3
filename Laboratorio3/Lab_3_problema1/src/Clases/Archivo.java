/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
    
    private String nombreArchivo;
    

    public Archivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void agregarNombre(String nombre) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true));
        writer.write(nombre);
        writer.newLine();
        writer.close();
    }

    public String leerNombres() throws IOException {
        StringBuilder nombres = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        while ((linea = reader.readLine()) != null) {
            nombres.append(linea).append("\n");
        }
        reader.close();
        return nombres.toString();
    }

    public String getRutaArchivo() {
        return new File(nombreArchivo).getAbsolutePath();
        
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
}
