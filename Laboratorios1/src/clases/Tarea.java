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
public class Tarea {
    private String tituloTarea;
    private String descripcionTarea;
    private String fechaVencimiento;
    private String horaVencimiento;
    private String prioridad;
    private boolean completado;
    
    public Tarea(){
        
    }
    public Tarea(String tituloTarea, String descripcionTarea, String fechaVencimiento, String horaVencimiento, String prioridad){
        this.tituloTarea = tituloTarea;
        this.descripcionTarea = descripcionTarea;
        this.fechaVencimiento = fechaVencimiento;
        this.horaVencimiento = horaVencimiento;
        this.prioridad = prioridad;
        this.completado = false;
        
    }

    public String getTituloTarea() {
        return tituloTarea;
    }

    public void setTituloTarea(String tituloTarea) {
        this.tituloTarea = tituloTarea;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public String getHoraVencimiento() {
        return horaVencimiento;
    }

    public void setHoraVencimiento(String horaVencimiento) {
        this.horaVencimiento = horaVencimiento;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
   
    public boolean getCompletado(){
        return this.completado;
    }
    
    public void setBoolean(boolean completado){
        this.completado = completado;
    }
    public static void agregarTarea(String tituloTarea, String descripcionTarea, String fechaVencimiento,String horaVencimiento, String prioridad, ArrayList<Tarea> tareas){
        Tarea nuevaTarea = new Tarea(tituloTarea, descripcionTarea, fechaVencimiento, horaVencimiento, prioridad);
        tareas.add(nuevaTarea);
}

    
}
