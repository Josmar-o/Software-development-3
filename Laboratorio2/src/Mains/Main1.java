/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mains;
import Ej1Empleados.*;
/**
 *
 * @author omargarcia
 */
public class Main1 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1000, "9-1014-803", "San Miguel, calle 3ra", "Miguel Rodrigez");
        Empleado empleado1 = new Empleado(40, 5, "8-1234-94", "Calle 4ta", "James Rod");
        
        System.out.println(empleado1.getSueldoFinal());
        
    }
    
}
