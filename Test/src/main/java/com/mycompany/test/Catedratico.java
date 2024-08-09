/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author strdh
 */
public class Catedratico {
    private static int nextId = 1;  
    private int codigoCatedratico;
    private String nombre; 
    private String direcion;
    private String telefono;
    private String profecion;


    public Catedratico(String nombre){
        this.codigoCatedratico = nextId++;
        this.nombre = nombre;
        this.direcion = direcion;
        this.telefono = telefono;
        this.profecion = profecion;
        
    }
    
    public void imprimirDatos() {
        System.out.println("Codigo Catedratico: " + codigoCatedratico + ", Nombre: " + nombre + ", Direccion: " + direcion + ", Telefono: " + telefono + ", Profecion: " + profecion);
    }

    public int getcodigoCatedratico() {
        return codigoCatedratico;
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
        public void setProfesion(String profecion) {
        this.profecion = profecion;
    }

    public String getProfecion() {
        return profecion;
    }
}

