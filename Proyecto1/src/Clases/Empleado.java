/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;

/**
 *
 * @author omargarcia
 */
public class Empleado {

    private String cedula;
    private String nombre;
     private String nombre2;
    private String apellido;
     private String apellido2;
    private String direccion;
    private String telefono;
    private String fechaNacimiento;
    
    private double horasTrab;
    private double salarioHora;
    private double salarioBruto;
    private double seguroSocial;
    private double seguroEducativo;
    private double salarioNeto;
    
    
    public Empleado(){
        
    }

    public Empleado(String cedula, String nombre, String nombre2, String apellido, String apellido2, String direccion, String telefono, String fechaNac, double salarioHora, double horasTrab) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.nombre2 = nombre2;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.telefono = telefono; 
        this.fechaNacimiento = fechaNac;
        this.salarioHora = salarioHora;
        this.horasTrab = horasTrab;
        calcularSalarioBruto();
        calcularSeguroEducativo();
        calcularSeguroSocial();
        calcularSalarioNeto();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(double horasTrab) {
        this.horasTrab = horasTrab;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double SalarioBruto) {
        this.salarioBruto = SalarioBruto;
    }

    public double getSeguroSocial() {
        return seguroSocial;
    }

    public void setSeguroSocial(double seguroSocial) {
        this.seguroSocial = seguroSocial;
    }

    public double getSeguroEducativo() {
        return seguroEducativo;
    }

    public void setSeguroEducativo(double seguroEducativo) {
        this.seguroEducativo = seguroEducativo;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void calcularSalarioBruto(){
        salarioBruto = salarioHora * horasTrab;
    }
    
    public void calcularSeguroSocial(){
        this.seguroSocial = this.salarioBruto * 0.0975;
    }
    public void calcularSeguroEducativo(){
        this.seguroEducativo = this.salarioBruto * 0.0125;
    }
    public void calcularSalarioNeto(){
        this.salarioNeto = salarioBruto - seguroEducativo - seguroSocial;
    }
    public String imprimirEmpleado() {
        return cedula + "," + nombre + "," + nombre2 + "," + apellido + "," + apellido2 + "," + direccion + "," + telefono + "," + fechaNacimiento + ","+ salarioHora + ","+horasTrab+ "," + salarioBruto + "," + seguroSocial + ","+ seguroEducativo + ","+salarioNeto;
    }


}
