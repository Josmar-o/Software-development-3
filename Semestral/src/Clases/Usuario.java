/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.time.LocalDate;
/**
 *
 * @author omargarcia
 */
public class Usuario {
    private String userID;
    private String contrasena;
    private String cedula;
    private String nombre;
    private LocalDate fechaIngreso;
    private String apellido;
    private String direccion;
    
    public Usuario(){
        
    }

    public Usuario(String userID,String contrasena,String cedula,  String nombre, String apellido, String direccion, LocalDate fechaIngreso) {
        this.userID = userID;
        this.contrasena = contrasena;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaIngreso = fechaIngreso;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    public static boolean verificarContra(String contra1, String contra2){
            if(contra1.equals(contra2)){
                return true;
            }
                return false;
            
        }
     
}