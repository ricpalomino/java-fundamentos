package com.idat.fundamentos;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class StudentManagementApp {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        List<Alumno> alumnos = crearAlumnos();
        mostrarMenu(alumnos);
    }

    private static List<Alumno> crearAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Juan", 20, 18));
        alumnos.add(new Alumno("María", 22, 15));
        alumnos.add(new Alumno("Pedro", 19, 10));
        alumnos.add(new Alumno("Richard", 34, 20));
        return alumnos;
    }

    private static void mostrarMenu(List<Alumno> alumnos) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion = 0;
            do {
                System.out.println();
                System.out.println("===== SISTEMA DE GESTIÓN DE ALUMNOS =====");
                System.out.println("1. Mostrar alumnos");
                System.out.println("2. Mostrar aprobados");
                System.out.println("3. Mostrar desaprobados");
                System.out.println("4. Mostrar promedio de notas");
                System.out.println("5. Salir");
                try {
                    System.out.print("Seleccione una opción: ");
                    opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1 -> mostrarAlumnos(alumnos);
                        case 2 -> mostrarAprobados(alumnos);
                        case 3 -> mostrarDesaprobados(alumnos);
                        case 4 -> mostrarPromedioNotas(alumnos);
                        case 5 -> System.out.println("Saliendo del programa...");
                        default -> System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 5.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Entrada no válida. Por favor, ingrese un número.");
                    scanner.nextLine();
                }
            } while (opcion != 5);
        }
    }

    private static void mostrarAlumnos(List<Alumno> alumnos) {
        System.out.println("\nLista de Alumnos:");
        alumnos.forEach(alumno -> System.out.println(alumno.mostrarInformacion()));
    }

    private static void mostrarAprobados(List<Alumno> alumnos) {
        System.out.println("\nAlumnos aprobados:");
        long cantidadAprobados = alumnos.stream()
                .filter(alumno -> alumno.getNota() > 10)
                .peek(alumno -> System.out.println(alumno.mostrarInformacion()))
                .count();
        System.out.println("Cantidad de alumnos aprobados: " + cantidadAprobados);
    }

    private static void mostrarDesaprobados(List<Alumno> alumnos) {
        System.out.println("\nAlumnos desaprobados:");
        alumnos.stream()
                .filter(alumno -> alumno.getNota() <= 10)
                .forEach(alumno -> System.out.println(alumno.mostrarInformacion()));
    }

    private static void mostrarPromedioNotas(List<Alumno> alumnos) {
        double promedio = alumnos.stream()
                .mapToInt(Alumno::getNota)
                .average()
                .orElse(0);
        System.out.println("\nPromedio de notas: " + promedio);
    }
}
