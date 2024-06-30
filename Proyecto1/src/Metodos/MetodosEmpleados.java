/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;
import Clases.Empleado;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author omargarcia
 */
public class MetodosEmpleados {
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    //LINUX
        private static String rutaEmpleados = "./src/Archivos/Empleados.txt";
//WINDOWS
//        private static String rutaUsuarios = ".\\src\\Archivos\\Empleados.txt";
    
    public static void escribirEmpleados(Empleado empleado) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(rutaEmpleados, true));
            writer.println(empleado.imprimirEmpleado());
            writer.close();
        } catch (IOException e) {
        }
    }
    
    public static ArrayList<Empleado> leerEmpleados(){
        ArrayList<Empleado> usuarios = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileReader(rutaEmpleados))) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] datos = linea.split(",");
                Empleado empleado = new Empleado(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], Double.valueOf(datos[8]), Double.valueOf(datos[9]));
                usuarios.add(empleado);
            }
        } catch (IOException e) {
         
        }
        return usuarios;
    }
    
    
}
