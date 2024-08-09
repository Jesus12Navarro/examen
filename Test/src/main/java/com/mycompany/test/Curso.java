/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author strdh
 */
public class Curso {

    private int id;
    private String Titulo;
    private int numMaxAlumnos;
    private int creditos;
    private Catedratico catedratico; 
    private int alumnosAsignados;

    public Curso(int id, String Titulo, int numMaxAlumnos, int creditos, int alumnosAsignados, Catedratico catedratico) {
        this.Titulo = Titulo;
        this.numMaxAlumnos = numMaxAlumnos;
        this.creditos = creditos;
        this.catedratico = catedratico;
        this.alumnosAsignados = alumnosAsignados;
        
    }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMaxAlumnos() {
        return maxAlumnos;
    }

    public void setMaxAlumnos(int maxAlumnos) {
        this.maxAlumnos = maxAlumnos;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public boolean verificaEspacio() {
        return alumnos.size() < maxAlumnos;
    }


    public boolean agregarAlumno(Alumno alumno) {
        if (verificaEspacio()) {
            alumnos.add(alumno);
            return true;
        }
        return false;
    }
}

