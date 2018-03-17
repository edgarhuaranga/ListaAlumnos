package com.ehuaranga.listaorce.Model;

/**
 * Created by edhuar on 17.03.18.
 */

public class AlumnoUNI {
    String codigo;
    String facultad;
    String nombre;

    public AlumnoUNI(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
