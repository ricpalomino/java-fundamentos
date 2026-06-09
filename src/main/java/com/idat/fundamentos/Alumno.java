package com.idat.fundamentos;

public class Alumno {
    
    private String nombre;
    private int edad;
    private int nota;

    public Alumno(String nombre, int edad, int nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String mostrarInformacion() {
        return "Alumno: " + nombre + ", Edad: " + edad + ", Nota: " + nota;
    }

    public String evaluarNota() {
        if (nota >= 18) {
            return "Excelente";
        } else if (nota >= 11) {
            return "Aprobado";
        } 
        return "Desaprobado";
    }

}
