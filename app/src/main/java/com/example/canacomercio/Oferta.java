package com.example.canacomercio;

import com.example.canacomercio.interfaces.IOferta;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Oferta implements IOferta {

    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private int bonificacion;
    private String descripcion;

    public Oferta(){

    }

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

    public static IOferta fromMap(Map<String, Object> map){
        IOferta oferta = new Oferta();

        if (map.containsKey("nombre")) {
            oferta.setNombre((String) map.get("nombre"));
        }
        if (map.containsKey("fecha_inicio")) {
            oferta.setFechaInicio((Date) map.get("fecha_inicio"));
        }
        if (map.containsKey("fecha_fin")) {
            oferta.setFechaFin((Date) map.get("fecha_fin"));
        }
        if (map.containsKey("bonificacion")) {
            oferta.setBonificacion((Integer) map.get("bonificacion"));
        }
        if (map.containsKey("descripcion")) {
            oferta.setDescripcion((String) map.get("descripcion"));
        }

        return oferta;
    }

    public static Map<String, Object> toMap(IOferta oferta){
        Map<String, Object> datos = new HashMap<>();

        if (oferta.getNombre() != null) {
            datos.put("nombre", oferta.getNombre());
        }
        if (oferta.getFechaInicio() != null) {
            datos.put("fecha_inicio", oferta.getFechaInicio());
        }
        if (oferta.getFechaFin() != null) {
            datos.put("fecha_fin", oferta.getFechaFin());
        }
        if (oferta.getBonificacion() >= 1) {
            datos.put("bonificacion", oferta.getBonificacion());
        }
        if (oferta.getDescripcion() != null) {
            datos.put("descripcion", oferta.getDescripcion());
        }

        return datos;
    }
}
