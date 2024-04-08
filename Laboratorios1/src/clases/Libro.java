/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.util.ArrayList;

/**
 *
 * @author Omar Garcia
 */
public class Libro {
    private String nombreLibro;
    private String autor;
    private int anoPublicacion;
    private boolean disponible;
    
    public Libro(){
        
    }
    public Libro(String nombreLibro, String autor, int anoPublicacion){
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.disponible = true;
    }


    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    //static indica que el metodo pertenece a
    public static void agregarLibro(String nombreLibro, String autor, int anoPublicacion, ArrayList<Libro> biblioteca){
        Libro nuevoLibro = new Libro(nombreLibro, autor, anoPublicacion);
        biblioteca.add(nuevoLibro);   
    }
    //metodo para saber si esta disponible el libro o no
    public String estaDisponible(Libro libro){
        if(libro.isDisponible() == true){
            return "Esta disponible";
        }else{
            return "No esta disponible";
        }
    }
    
    
    
}
