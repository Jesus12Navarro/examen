/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author strdh
 */
public class Alumno {
    private static int nextCarnet = 1000; 
    private int carnet;
    private String nombre;
    private String direcion;
    private String telefono;
    private String edad;
    
    

    public Alumno(String nombre) {
        this.carnet = nextCarnet++;
        this.nombre = nombre;
        this.direcion = direcion;
        this.telefono = telefono;
        this.edad = edad;
    }

    public void imprimirDatos() {
        System.out.println("Carnet: " + carnet + ", Nombre: " + nombre + ", Edad: " + edad + ", Direccion: " + direcion + ", Telefono: " + telefono);
    }

    public int getCarnet() {
        return carnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
            public void setDireccion(String direcion) {
        this.direcion = direcion;
    }

    public String getDireccion() {
        return direcion;
    }
        public void setTelefono(String telefono) {
            this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
        public void setProfesion(String edad) {
        this.edad = edad;
    }

    public String getEdad() {
        return edad;
    }
}

