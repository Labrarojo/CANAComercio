package com.example.canacomercio;

import com.example.canacomercio.interfaces.IEmpleado;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Empleado implements IEmpleado {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date fechaNacimiento;
    private String correo;
    private String contrasena;

    public Empleado(){

    }

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento, String correo, String contrasena) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public static IEmpleado fromMap(Map<String, Object> map){
        IEmpleado empleado = new Empleado();

        if (map.containsKey("nombre")) {
            empleado.setNombre((String) map.get("nombre"));
        }
        if (map.containsKey("apellido_paterno")) {
            empleado.setApellidoPaterno((String) map.get("apellido_paterno"));
        }
        if (map.containsKey("apellido_materno")) {
            empleado.setApellidoMaterno((String) map.get("apellido_materno"));
        }
        if (map.containsKey("fecha_nacimiento")) {
            empleado.setFechaNacimiento((Date) map.get("fecha_nacimiento"));
        }
        if (map.containsKey("email")) {
            empleado.setCorreo((String) map.get("email"));
        }
        if (map.containsKey("password")) {
            empleado.setContrasena((String) map.get("password"));
        }

        return empleado;
    }

    public static Map<String, Object> toMap(IEmpleado empleado){
        Map<String, Object> datos = new HashMap<>();

        if (empleado.getNombre() != null) {
            datos.put("nombre", empleado.getNombre());
        }
        if (empleado.getApellidoPaterno() != null) {
            datos.put("apellido_paterno", empleado.getApellidoPaterno());
        }
        if (empleado.getApellidoMaterno() != null) {
            datos.put("apellido_materno", empleado.getApellidoMaterno());
        }
        if (empleado.getFechaNacimiento() != null) {
            datos.put("fecha_nacimiento", empleado.getFechaNacimiento());
        }
        if (empleado.getCorreo() != null) {
            datos.put("email", empleado.getCorreo());
        }
        if (empleado.getContrasena() != null) {
            datos.put("password", empleado.getContrasena());
        }

        return datos;
    }
}
