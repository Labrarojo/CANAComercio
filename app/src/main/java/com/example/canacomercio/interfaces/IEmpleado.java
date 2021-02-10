package com.example.canacomercio.interfaces;

import java.util.Date;

public interface IEmpleado {

    String getNombre();

    void setNombre(String nombre);

    String getApellidoPaterno();

    void setApellidoPaterno(String apellidoPaterno);

    String getApellidoMaterno();

    void setApellidoMaterno(String apellidoMaterno);

    Date getFechaNacimiento();

    void setFechaNacimiento(Date fechaNacimiento);

    String getCorreo();

    void setCorreo(String correo);

    String getContrasena();

    void setContrasena(String contrasena);

}
