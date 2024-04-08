package clases;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    public Persona(){

    }
    public Persona(String nombre, int edad, String DNI){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return this.DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String mostrar(){
        return this.nombre + " " + this.edad + " "  + this.DNI;
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }
    
    public String esMayorDeEdad2(){
        return this.edad >= 18 ? "Es mayor de edad" : "Es menor de edad";
    }
}
