package com.example.canacomercio.interfaces;

import java.math.BigDecimal;
import java.util.Date;

public interface IOferta {

    String getNombre();

    void setNombre(String nombre);

    Date getFechaInicio();

    void setFechaInicio(Date fechaInicio);

    Date getFechaFin();

    void setFechaFin(Date fechaFin);

    int getBonificacion();

    void setBonificacion(int bonificacion);

    String getDescripcion();

    void setDescripcion(String descripcion);

}
