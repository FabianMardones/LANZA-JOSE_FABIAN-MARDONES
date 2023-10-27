package com.backend.parcial.model;

public class Odontologo {
    private int id;
    private String nombre;
    private String apellido;
    private int numeroDeMatricula;

    public Odontologo(String nombre, String apellido, int numeroDeMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public Odontologo(int id, String nombre, String apellido, int numeroDeMatricula) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(int numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    @Override
    public String toString() {
        return " id : " + id +
                " - nombre: '" + nombre + '\'' +
                " - apellido: '" + apellido + '\'' +
                " - numeroDeMatricula: " + numeroDeMatricula;
    }
}
