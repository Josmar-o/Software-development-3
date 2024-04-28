
package clases;

//Importe de clases y/o librerías utilizadas
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Empleado {
    
    //Atributos de la clase
    private String nombre;
    private String departamento;
    private double salario;
    private LocalDate f_contratacion;
   
    //Constructor(es) de la clase
    public Empleado () {}
    
    public Empleado(String nombre, String departamento, double salario, LocalDate f_contratacion) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.f_contratacion = f_contratacion;
    }
    
    
    //Métodos de la clase
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setFContratacion(LocalDate f_contratacion) {
        this.f_contratacion = f_contratacion;
    }
    
    public String getFContratacion() {
        //Creación de un nuevo formato
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        //Conversión de formato
        String fechaFormateada = f_contratacion.format(formato);
        return fechaFormateada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }
    
    public double calcularBono() {
        
        //Cálculo de la antiguedad del empleado en la empresa
        Period periodoTrabajado = Period.between(f_contratacion, LocalDate.now());
        int aniosTrabajados = periodoTrabajado.getYears();
        
        //Condición para determinar el bono del empleado
        if (aniosTrabajados >= 20)
            return 0.60;
        
        else if (aniosTrabajados >= 10)
            return 0.30;
        
        else if (aniosTrabajados >= 5)
            return 0.15;
            
        else
            return 0;
    }
    
    public static void agregarEmpleado(String nombre, String departamento, double sueldo, LocalDate fecha_c,  ArrayList<Empleado> empleados){
        Empleado nuevoEmpleado = new Empleado(nombre, departamento, sueldo, fecha_c);
        empleados.add(nuevoEmpleado);
    }
}