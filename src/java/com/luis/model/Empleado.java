package com.luis.model;
// Generated 25-abr-2014 21:04:13 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Empleado generated by hbm2java
 */
public class Empleado  implements java.io.Serializable {


     private Integer idEmpleado;
     private Puesto puesto;
     private String nombre;
     private double salario;
     private Date fechaAlta;
     private Set conocimientoses = new HashSet(0);

    public Empleado() {
    }

	
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    public Empleado(Puesto puesto, String nombre, double salario, Date fechaAlta, Set conocimientoses) {
       this.puesto = puesto;
       this.nombre = nombre;
       this.salario = salario;
       this.fechaAlta = fechaAlta;
       this.conocimientoses = conocimientoses;
    }
   
    public Integer getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public Puesto getPuesto() {
        return this.puesto;
    }
    
    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalario() {
        return this.salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Date getFechaAlta() {
        return this.fechaAlta;
    }
    
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public Set getConocimientoses() {
        return this.conocimientoses;
    }
    
    public void setConocimientoses(Set conocimientoses) {
        this.conocimientoses = conocimientoses;
    }




}

