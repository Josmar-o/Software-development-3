/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;
import Clases.Usuario;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author omargarcia
 */
public class MetodosUsuario {
//LINUX
        private static String rutaUsuarios = "./src/Archivos/Usuarios.txt";
//WINDOWS
//        private static String rutaUsuarios = ".\\src\\Archivos\\Empleados.txt";
    
    public static void escribirUsuarios(Usuario usuario) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(rutaUsuarios, true));
            writer.println(usuario.imprimirUsuario());
            writer.close();
        } catch (IOException e) {
        }
    }
    
    public static ArrayList<Usuario> leerUsuarios(){
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileReader(rutaUsuarios))) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] datos = linea.split(",");
                Usuario usuario = new Usuario(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5]);
                usuarios.add(usuario);
            }
        } catch (IOException e) {
         
        }
        return usuarios;
    }
    
        public static boolean verificarUsuario(String userID, String contrasena) {
        ArrayList<Usuario> usuarios = leerUsuarios();
        for (Usuario usuario : usuarios) {
            if (usuario.getUserID().equals(userID) && usuario.getContrasena().equals(contrasena)) {
                return true;
            }
        }
        return false;
        }
        
        public static boolean verificarContra(String contra1, String contra2){
            if(contra1.equals(contra2)){
                return true;
            }else{
                return false;
            }
        }
    
}
