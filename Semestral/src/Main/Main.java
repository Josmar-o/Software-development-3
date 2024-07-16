/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import Clases.Empleado;
import Clases.Usuario;
import Frms.*;
import Metodos.MetodosUsuario;
import java.util.ArrayList;


/**
 *
 * @author omargarcia
 */
public class Main {

    public static void main(String[] args) {
        frmLogin frm1 = new frmLogin();
        frm1.setVisible(true);
        
                ArrayList<Usuario> usuarios = MetodosUsuario.cargarUsuarios();
        
        // Display each user's information
        for (Usuario usuario : usuarios) {
            System.out.println("Cedula: " + usuario.getCedula());
            System.out.println("UserID: " + usuario.getUserID());
            System.out.println("Pass: " + usuario.getContrasena());
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Apellido: " + usuario.getApellido());
            System.out.println("Dirección: " + usuario.getDireccion());
            System.out.println("Fecha de Ingreso: " + usuario.getFechaIngreso());
            System.out.println("---------------------------------");
        }
        
        // Optional: Print the total number of users loaded
        System.out.println("Total Usuarios: " + usuarios.size());
    }

    }
    

