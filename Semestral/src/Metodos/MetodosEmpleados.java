/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;
import Clases.Empleado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.Date;

/**
 *
 * @author omargarcia
 */
public class MetodosEmpleados {
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
  
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=proyecto1;user=sa;password=Password-19;encrypt=false;trustServerCertificate=true";
    // Método para crear la conexión con la base de datos
    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
    
    public static void registrarEmpleado(Empleado empleado) {
        String query = "{call sp_registrarEmpleado(?, ?, ?, ?, ?, ?, ?, ?)}";

        try (Connection conn = getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {

            stmt.setString(1, empleado.getCedula());
            stmt.setString(2, empleado.getNombre());
            stmt.setString(3, empleado.getNombre2());
            stmt.setString(4, empleado.getApellido());
            stmt.setString(5, empleado.getApellido2());
            stmt.setDate(6, Date.valueOf(empleado.getFechaNacimiento()));
            stmt.setString(7, empleado.getDireccion());
            stmt.setString(8, empleado.getTelefono());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        public static ArrayList<Empleado> cargarEmpleados() {
        ArrayList<Empleado> empleados = new ArrayList<>();
        String query = "{call sp_cargarEmpleados}";

        try (Connection conn = getConnection();
             CallableStatement stmt = conn.prepareCall(query);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                String cedula = rs.getString("cedula");
                String nombre1 = rs.getString("nombre1");
                String nombre2 = rs.getString("nombre2");
                String apellido1 = rs.getString("apellido1");
                String apellido2 = rs.getString("apellido2");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                LocalDate fechaNacimiento = rs.getDate("fecha_nacimiento").toLocalDate();
                
                Empleado empleado = new Empleado(cedula, nombre1, nombre2, apellido1, apellido2, direccion, telefono, fechaNacimiento);
                empleados.add(empleado);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return empleados;
    }
        
        public static Empleado busquedaEmpleado(String cedula){
            ArrayList<Empleado> empleados = cargarEmpleados();
            
            for(int i = 0; i < empleados.size(); i++){
            Empleado empleado = empleados.get(i);
            if (empleado.getCedula().equals(cedula)){
                //Encontrado
                return empleado;
            }
          }
            //No encontrado
            return null;

        } 
         public static void actualizarEmpleado(Empleado empleado) {
        String query = "{call sp_actualizarEmpleado(?, ?, ?, ?, ?, ?, ?, ?)}";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, empleado.getCedula());
            stmt.setString(2, empleado.getNombre());
            stmt.setString(3, empleado.getNombre2());
            stmt.setString(4, empleado.getApellido());
            stmt.setString(5, empleado.getApellido2());
            stmt.setDate(6, java.sql.Date.valueOf(empleado.getFechaNacimiento()));
            stmt.setString(7, empleado.getDireccion());
            stmt.setString(8, empleado.getTelefono());
            
            stmt.executeUpdate();
       
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
        
}
