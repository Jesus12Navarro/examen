/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

/**
 *
 * @author strdh
 */
public class Test {
    public static void main(String[] args) {
        // Crear catedráticos
        Catedratico c1 = new Catedratico("Ing. Pérez");
        Catedratico c2 = new Catedratico("Ing. Gonzalez");
        Catedratico c3 = new Catedratico("Ing. Beltran");

        // Crear cursos
        Curso curso1 = new Curso("Matemáticas", 2);
        Curso curso2 = new Curso("Sistemas operativos", 5);
        Curso curso3 = new Curso("Fisica", 5);

        // Crear alumnos
        Alumno a1 = new Alumno("Jesus Perez");
        Alumno a2 = new Alumno("Maria");
        Alumno a3 = new Alumno("Lucas");

        // Crear asignaciones
        Asignacion asignacion1 = new Asignacion(a1);
        Asignacion asignacion2 = new Asignacion(a2);
        Asignacion asignacion3 = new Asignacion(a3);

        // Agregar cursos a alumnos
        asignacion1.addCurso(curso1);
        asignacion1.addCurso(curso2);

        asignacion2.addCurso(curso1);
        asignacion2.addCurso(curso3);

        asignacion3.addCurso(curso2);
        asignacion3.addCurso(curso3);

        // Imprimir datos
        c1.imprimirDatos();
        c2.imprimirDatos();
        c3.imprimirDatos();

        a1.imprimirDatos();
        a2.imprimirDatos();
        a3.imprimirDatos();

        asignacion1.imprimirCursos();
        asignacion2.imprimirCursos();
        asignacion3.imprimirCursos();
    }
}


