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
        //numeros[5] = 60; // Esto causará un error de índice fuera de rango
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
        System.out.println("Fruta Indice 1: " + frutas.get(1)); // Imprime "Banana"
        frutas.remove("Banana");
        System.out.println("Frutas después de eliminar Banana: " + frutas);
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }
    }

    public static void ejemploHashSet() {
        Set<String> colores = new HashSet<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Rojo"); // No se añadirá porque los sets no permiten duplicados
        System.out.println("Colores: " + colores);
    }

    public static void ejemploHashMap() {
        Map<String, Alumno> alumnosByKey = new HashMap<>();
        alumnosByKey.put("Juan", new Alumno("Juan", 25, 10));
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Juan", 25);
        edades.put("María", 30);
        edades.put("Pedro", 20);
        System.out.println("Edad de María: " + edades.get("María")); // Imprime 30
        edades.remove("Pedro");
        System.out.println("Edades después de eliminar a Pedro: " + edades);
    }

    public static void main(String[] args) {
        //EjemploArrays();
        //ejemploArrayList();
        //ejemploHashSet();
        ejemploHashMap();
    }

}
