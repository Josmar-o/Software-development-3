/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;
import Clases.Planilla;
import Clases.Empleado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.Date;
/**
 *
 * @author Omar Garcia
 */
public class MetodosPlanilla {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=proyecto1;user=sa;password=Password-19;encrypt=false;trustServerCertificate=true";
    // Método para crear la conexión con la base de datos
    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
    
    public static void insertarPlanilla(Date fecha) {
    String query = "{call sp_insertarPlanilla(?)}";

    try (Connection conn = getConnection();
         CallableStatement stmt = conn.prepareCall(query)) {
        stmt.setDate(1, fecha);
        stmt.executeUpdate();
       
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    public static void insertarDetallePlanilla(int idPlanilla, Empleado empleado) {
        String query = "{call sp_insertarDetallePlanilla(?, ?, ?, ?, ?, ?, ?, ?)}";

        try (Connection conn = getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {

            stmt.setInt(1, idPlanilla);
            stmt.setString(2, empleado.getCedula());
            stmt.setInt(3, empleado.getHorasTrab());
            stmt.setDouble(4, empleado.getSalarioHora());
            stmt.setDouble(5, empleado.getSalarioBruto());
            stmt.setDouble(6, empleado.getSeguroSocial());
            stmt.setDouble(7, empleado.getSeguroEducativo());
            stmt.setDouble(8, empleado.getSalarioNeto());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static int obtenerUltimoIdPlanilla() {
        String query = "{call sp_obtener_ultimo_id_planilla}";
        int ultimoIdPlanilla = -1;

        try (Connection conn = getConnection();
             CallableStatement stmt = conn.prepareCall(query);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                ultimoIdPlanilla = rs.getInt("ultimo_id_planilla");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ultimoIdPlanilla;
    }
       public static ArrayList<Empleado> obtenerDetallePlanilla(int idPlanilla) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        String query = "{CALL SP_obtenerDetallePlanilla(?)}";

        try (Connection conn = getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {

            stmt.setInt(1, idPlanilla);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String cedula = rs.getString("cedula_empleado");
                String nombre1 = rs.getString("nombre1");
                String nombre2 = rs.getString("nombre2");
                String apellido1 = rs.getString("apellido1");
                String apellido2 = rs.getString("apellido2");
                int horasTrabajadas = rs.getInt("horas_trabajadas");
                double salarioPorHora = rs.getDouble("salario_por_horas");
                LocalDate fecha = rs.getDate("fecha").toLocalDate(); 

     
                Empleado empleado = new Empleado(cedula, nombre1, nombre2, apellido1, apellido2, horasTrabajadas, salarioPorHora, fecha);
                empleados.add(empleado);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return empleados;
    }
       
       public static ArrayList<Planilla> obtenerPlanillas() {
        ArrayList<Planilla> planillas = new ArrayList<>();
        String query = "{CALL sp_obtenerPlanillas}";

        try (Connection conn = getConnection();
             CallableStatement stmt = conn.prepareCall(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int idPlanilla = rs.getInt("id_planilla");
                LocalDate fecha = rs.getDate("fecha").toLocalDate();
                double totalSalarioBruto = rs.getDouble("total_salario_bruto");
                double totalSeguroSocial = rs.getDouble("total_seguro_social");
                double totalSeguroEducativo = rs.getDouble("total_seguro_educativo");
                double totalSalarioNeto = rs.getDouble("total_salario_neto");

                Planilla planilla = new Planilla(idPlanilla, fecha, totalSalarioBruto, totalSeguroSocial,totalSeguroEducativo, totalSalarioNeto);
                planillas.add(planilla);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return planillas;
    }
    
}
