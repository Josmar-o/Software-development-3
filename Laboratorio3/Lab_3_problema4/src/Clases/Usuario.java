/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String usuario;
    private String password;
    private String nombre;
    private String correo;
    
    private static final String SEPARADOR = ";";
    private static final String ARCHIVO = "usuarios.txt";
    
    public Usuario(String usuario, String password, String nombre, String correo) {
        this.usuario = usuario;
        this.password = encriptarPassword(password);
        this.nombre = nombre;
        this.correo = correo;
    }
    
    public void insertar() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO, true))) {
            bw.write(usuario + SEPARADOR + password + SEPARADOR + nombre + SEPARADOR + correo);
            bw.newLine();
        }
    }
    
    public static List<Usuario> mostrar_todos() throws IOException {
        List<Usuario> usuarios = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(SEPARADOR);
                Usuario usuario = new Usuario(campos[0], campos[1], campos[2], campos[3]);
                usuarios.add(usuario);
            }
        }
        
        return usuarios;
    }
    
    public static Usuario buscar(String usuario) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(SEPARADOR);
                if (campos[0].equals(usuario)) {
                    return new Usuario(campos[0], campos[1], campos[2], campos[3]);
                }
            }
        }
        
        return null;
    }
    
    public static boolean validar_usuario(String usuario, String password) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(SEPARADOR);
                if (campos[0].equals(usuario) && campos[1].equals(encriptarPassword(password))) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private static String encriptarPassword(String password) {
        StringBuilder sb = new StringBuilder();
        for (char c : password.toCharArray()) {
            sb.append((char) (c + 1));
        }
        return sb.toString();
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = encriptarPassword(password);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

