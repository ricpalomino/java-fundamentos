package com.idat.fundamentos.examples;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import com.idat.fundamentos.Alumno;

public class StreamsExamples {

    public static void main(String[] args) {
        List<Alumno> alumnos = crearAlumnos();

        System.out.println("===== EJEMPLOS DE STREAMS API (Java 8+) =====\n");

        demonstrateFilter(alumnos);
        demonstrateMap(alumnos);
        demonstrateForEach(alumnos);
        demonstrateCount(alumnos);
        demonstrateReduce(alumnos);
        demonstrateCollect(alumnos);
    }

    private static List<Alumno> crearAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Juan", 20, 18));
        alumnos.add(new Alumno("María", 22, 15));
        alumnos.add(new Alumno("Pedro", 19, 8));
        alumnos.add(new Alumno("Richard", 34, 20));
        alumnos.add(new Alumno("Ana", 21, 12));
        return alumnos;
    }

    public static void demonstrateFilter(List<Alumno> alumnos) {
        System.out.println("--- 1. FILTER: Filtrar alumnos aprobados (nota > 10) ---");
        alumnos.stream()
                .filter(a -> a.getNota() > 10)
                .forEach(a -> System.out.println("  " + a.mostrarInformacion()));
    }

    public static void demonstrateMap(List<Alumno> alumnos) {
        System.out.println("\n--- 2. MAP: Extraer solo nombres ---");
        alumnos.stream()
                .map(Alumno::getNombre)
                .forEach(nombre -> System.out.println("  " + nombre));
    }

    public static void demonstrateForEach(List<Alumno> alumnos) {
        System.out.println("\n--- 3. FOREACH: Iterar sobre alumnos desaprobados ---");
        System.out.println("Alumnos con nota <= 10:");
        alumnos.stream()
                .filter(a -> a.getNota() <= 10)
                .forEach(a -> System.out.println("  " + a.mostrarInformacion()));
    }

    public static void demonstrateCount(List<Alumno> alumnos) {
        System.out.println("\n--- 4. COUNT: Contar aprobados ---");
        long aprobados = alumnos.stream()
                .filter(a -> a.getNota() > 10)
                .count();
        System.out.println("  Total de aprobados: " + aprobados);
    }

    public static void demonstrateReduce(List<Alumno> alumnos) {
        System.out.println("\n--- 5. REDUCE: Sumar todas las notas ---");
        int sumaNotas = alumnos.stream()
                .mapToInt(Alumno::getNota)
                .sum();
        System.out.println("  Suma total de notas: " + sumaNotas);

        System.out.println("\n--- 5b. REDUCE: Calcular promedio ---");
        double promedio = alumnos.stream()
                .mapToInt(Alumno::getNota)
                .average()
                .orElse(0);
        System.out.println("  Promedio: " + promedio);
    }

    public static void demonstrateCollect(List<Alumno> alumnos) {
        System.out.println("\n--- 6. COLLECT: Recopilar en lista nueva ---");
        List<String> nombresAprobados = alumnos.stream()
                .filter(a -> a.getNota() > 10)
                .map(Alumno::getNombre)
                .collect(Collectors.toList());
        System.out.println("  Nombres aprobados: " + nombresAprobados);

        System.out.println("\n--- 6b. COLLECT: Contar por evaluación ---");
        var porEvaluacion = alumnos.stream()
                .collect(Collectors.groupingBy(
                        Alumno::evaluarNota,
                        Collectors.counting()
                ));
        System.out.println("  Conteo por evaluación: " + porEvaluacion);
    }
}
