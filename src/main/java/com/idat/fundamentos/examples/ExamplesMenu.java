package com.idat.fundamentos.examples;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExamplesMenu {

    public static void main(String[] args) {
        mostrarMenuPrincipal();
    }

    private static void mostrarMenuPrincipal() {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion = 0;
            do {
                System.out.println("\n╔════════════════════════════════════════╗");
                System.out.println("║   CENTRO DE EJEMPLOS EDUCATIVOS JAVA   ║");
                System.out.println("╚════════════════════════════════════════╝");
                System.out.println("1. Ejemplos de Control Flow (Switch, For, While)");
                System.out.println("2. Ejemplos de OOP (Herencia, Polimorfismo)");
                System.out.println("3. Ejemplos de Method Overloading");
                System.out.println("4. Ejemplos de Streams API");
                System.out.println("5. Salir");
                try {
                    System.out.print("\nSeleccione una opción: ");
                    opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1 -> ControlFlowExamples.main(new String[]{});
                        case 2 -> OOPExamples.main(new String[]{});
                        case 3 -> MethodOverloadingExamples.main(new String[]{});
                        case 4 -> StreamsExamples.main(new String[]{});
                        case 5 -> System.out.println("\n¡Hasta luego!");
                        default -> System.out.println("Opción no válida. Intente de nuevo.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingrese un número válido.");
                    scanner.nextLine();
                }
            } while (opcion != 5);
        }
    }
}
