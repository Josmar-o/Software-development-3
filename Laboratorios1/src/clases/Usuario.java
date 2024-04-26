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
public class Usuario {
    private String user;
    private String pass;
    
    public Usuario(){
        
    }
    public Usuario(String user, String pass){
        this.pass = pass;
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public static void registerUser(String user, String pass, ArrayList<Usuario> usuarios){
        Usuario newUser = new Usuario(user, pass);
        usuarios.add(newUser);
    }
    public static boolean validateUser(String user, String pass, ArrayList<Usuario> usuarios){
       for(Usuario usuario: usuarios ){
           if(usuario.getUser().equals(user) && usuario.getPass().equals(pass)){
               return true;
           }
       }
       return false;
    }
    
 
    
}
