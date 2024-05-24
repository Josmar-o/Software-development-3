/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mains;
import Ej3Productos.*;
import java.time.LocalDate;

/**
 *
 * @author omargarcia
 */
public class Main3 {
    public static void main(String[] args) {

        Alimento alimento1 = new Alimento(LocalDate.now(), true, "Lentejas", 0, 0, 0);
        System.out.println(alimento1.getFechaExp());
    }
}
