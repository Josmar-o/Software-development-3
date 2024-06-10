/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej8Futbol;

/**
 *
 * @author Omar Garcia
 */
public class Jugador {
    protected String posicion;
    protected String nombre;
    protected double minJug;
    protected int goles;
    protected int dorsal;
    
    public Jugador(){
        
    }

    public Jugador(String nombre, double minJug, int goles, int dorsal) {
        this.nombre = nombre;
        this.minJug = minJug;
        this.goles = goles;
        this.dorsal = dorsal;
    }
    
    public Jugador(String nombre, double minJug, int dorsal) {
        this.nombre = nombre;
        this.minJug = minJug;
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMinJug() {
        return minJug;
    }

    public void setMinJug(double minJug) {
        this.minJug = minJug;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    
    
}
