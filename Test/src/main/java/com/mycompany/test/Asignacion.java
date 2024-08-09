/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author strdh
 */

public class Asignacion {
    private int id;
    private String Titulo;
    private int numMaxAlumnos;
    private int creditos;
    private catedratico Catedratico; 


    public Asignacion(Alumno alumno) {
        this.alumno = alumno;
        this.cursos = new HashMap<>();
    }
    public boolean addCurso(Curso curso) {
        if (curso.agregarAlumno(alumno)) {
            cursos.put(curso.getNombre(), curso);
            return true;
        }
        return false;
    }
    public void imprimirCursos() {
        System.out.println("Cursos de " + alumno.getNombre() + ":");
        for (Curso curso : cursos.values()) {
            System.out.println(curso.getNombre());
        }
    }
}

