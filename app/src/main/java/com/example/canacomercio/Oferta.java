package com.example.canacomercio;

import com.example.canacomercio.interfaces.IOferta;

import java.math.BigDecimal;
import java.util.Date;

public class Oferta implements IOferta {

    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private int bonificacion;
    private String descripcion;

    public Oferta(String nombre, Date fechaInicio, Date fechaFin, int bonificacion, String descripcion) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.bonificacion = bonificacion;
        this.descripcion = descripcion;
    }


    public String  getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
