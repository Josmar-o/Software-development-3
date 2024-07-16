/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;
import Clases.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author omargarcia
 */
public class MetodosUsuario {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=proyecto1;user=sa;password=Password-19;encrypt=false;trustServerCertificate=true";
    // Método para crear la conexión con la base de datos
    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
    
    public static ArrayList<Usuario> cargarUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String query = "{call sp_cargarUsuarios}";

        try (Connection conn = getConnection();
             CallableStatement stmt = conn.prepareCall(query);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                String cedula = rs.getString("cedula");
                String userId = rs.getString("user_id");
                String contrasena = rs.getString("contrasena");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String direccion = rs.getString("direccion");
                LocalDate fecha = rs.getDate("fecha_ingreso").toLocalDate();
                
                Usuario usuario = new Usuario(userId, contrasena, cedula, nombre, apellido, direccion, fecha);
                usuarios.add(usuario);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return usuarios;
    }
    public static boolean verificarUsuario(String user, String contra){
        ArrayList<Usuario> usuarios = cargarUsuarios();
        for(Usuario usuario : usuarios){
            if(usuario.getUserID().equals(user) && usuario.getContrasena().equals(contra)){
                return true;
            }
        }
        return false;
    }
}
