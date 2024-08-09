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

    private String nombre;
    private int maxAlumnos;
    private List<Alumno> alumnos;

    public Curso(String nombre, int maxAlumnos) {
        this.nombre = nombre;
        this.maxAlumnos = maxAlumnos;
        this.alumnos = new ArrayList<>();
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

