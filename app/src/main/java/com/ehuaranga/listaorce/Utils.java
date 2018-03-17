package com.ehuaranga.listaorce;

import com.ehuaranga.listaorce.Model.AlumnoUNI;

import java.util.ArrayList;

/**
 * Created by edhuar on 17.03.18.
 */

public class Utils {
    public static ArrayList<AlumnoUNI> getAlumnosUNI(){
        ArrayList<AlumnoUNI> alumnos = new ArrayList<>();
        alumnos.add(new AlumnoUNI("20101272K"));
        alumnos.add(new AlumnoUNI("20134010E"));
        alumnos.add(new AlumnoUNI("20140004C"));
        alumnos.add(new AlumnoUNI("20152003G"));
        alumnos.add(new AlumnoUNI("20150423I"));
        alumnos.add(new AlumnoUNI("20162519F"));
        alumnos.add(new AlumnoUNI("20164501G"));
        alumnos.add(new AlumnoUNI("20154068I"));
        alumnos.add(new AlumnoUNI("20141270I"));
        alumnos.add(new AlumnoUNI("20134561G"));

        return alumnos;
    }
}
