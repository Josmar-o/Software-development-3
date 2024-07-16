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

    
}
