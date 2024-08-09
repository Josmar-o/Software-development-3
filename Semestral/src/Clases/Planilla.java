/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;

/**
 *
 * @author Omar Garcia
 */
public class Planilla {
    private String cedula;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;

    
    private int idPlanilla;
    private LocalDate fecha;
    private double totalSalarioBruto;
    private double totalSeguroSocial;
    private double totalSeguroEducativo;
    private double totalSalarioNeto;
    
    public Planilla(int idPlanilla, LocalDate fecha, double totalSalarioBruto, double totalSeguroSocial, double totalSeguroEducativo, double totalSalarioNeto){
        this.idPlanilla = idPlanilla;
        this.fecha = fecha;
        this.totalSalarioBruto = totalSalarioBruto;
        this.totalSeguroSocial = totalSeguroSocial;
        this.totalSeguroEducativo = totalSeguroEducativo;
        this.totalSalarioNeto = totalSalarioNeto;
    }
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getIdPlanilla() {
        return idPlanilla;
    }

    public void setIdPlanilla(int idPlanilla) {
        this.idPlanilla = idPlanilla;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getTotalSalarioBruto() {
        return totalSalarioBruto;
    }

    public void setTotalSalarioBruto(double totalSalarioBruto) {
        this.totalSalarioBruto = totalSalarioBruto;
    }

    public double getTotalSeguroSocial() {
        return totalSeguroSocial;
    }

    public void setTotalSeguroSocial(double totalSeguroSocial) {
        this.totalSeguroSocial = totalSeguroSocial;
    }

    public double getTotalSeguroEducativo() {
        return totalSeguroEducativo;
    }

    public void setTotalSeguroEducativo(double totalSeguroEducativo) {
        this.totalSeguroEducativo = totalSeguroEducativo;
    }

    public double getTotalSalarioNeto() {
        return totalSalarioNeto;
    }

    public void setTotalSalarioNeto(double totalSalarioNeto) {
        this.totalSalarioNeto = totalSalarioNeto;
    }
    
    
}
