/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Omar Garcia
 */
public class Calificacion {
    private int calificacion;
    private String nota;
    
    public Calificacion(){
        
    }
    public Calificacion(int calificacion, String nota){
        this.calificacion = calificacion;
        this.nota = nota;
    }

    public int getCalificacion() {
        return calificacion;
    }
    public String getCalificacionString() {
        return String.valueOf(calificacion);
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    public String calcularNota(int calificacion){
        String nota;
        if(calificacion >= 91){
            nota = "A";
        }else if(calificacion >= 81){
            nota = "B";
        }else if(calificacion >= 71){
            nota = "C";
        }else if(calificacion >= 61){
            nota = "D";
        }else{
            nota = "F"; 
        }
        return nota;
        
    }
    
    
    
}
