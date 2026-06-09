package com.idat.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.idat.fundamentos.Alumno;

public class Colecciones {

    public static void EjemploArrays() {
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número en índice " + i + ": " + numeros[i]);
        }
        String[] cursos = {"Java", "Python", "JavaScript"};
        for (String curso : cursos) {
            System.out.println("Curso: " + curso);
        }
    }

    public static void ejemploArrayList() {
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        System.out.println("Fruta Indice 1: " + frutas.get(1));
        frutas.remove("Banana");
        System.out.println("Frutas después de eliminar Banana: " + frutas);
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }
    }

    public static void ejemploHashSet() {
        Set<String> estudiantes = new HashSet<>();
        estudiantes.add("Juan Pérez");
        estudiantes.add("María García");
        estudiantes.add("Carlos López");
        estudiantes.add("Ana Martínez");
        estudiantes.add("Juan Pérez");

        System.out.println("Total de estudiantes únicos: " + estudiantes.size());
        System.out.println("Lista de estudiantes: " + estudiantes);

        if (estudiantes.contains("María García")) {
            System.out.println("María García está en el conjunto");
        }

        estudiantes.remove("Carlos López");
        System.out.println("Después de eliminar a Carlos López: " + estudiantes);

        System.out.println("\nIterando con forEach:");
        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }
    }

    public static void ejemploHashMap() {
        Map<String, Alumno> alumnosByKey = new HashMap<>();
        alumnosByKey.put("Juan", new Alumno("Juan", 25, 10));
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Juan", 25);
        edades.put("María", 30);
        edades.put("Pedro", 20);
        System.out.println("Edad de María: " + edades.get("María"));
        edades.remove("Pedro");
        System.out.println("Edades después de eliminar a Pedro: " + edades);
    }

    public static void main(String[] args) {
        System.out.println("=== Ejemplo HashSet ===");
        ejemploHashSet();
        System.out.println("\n=== Ejemplo HashMap ===");
        ejemploHashMap();
    }

}
