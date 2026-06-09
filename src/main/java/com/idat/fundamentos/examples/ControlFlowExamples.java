package com.idat.fundamentos.examples;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ControlFlowExamples {

    public static void main(String[] args) {
        mostrarMenuEjemplos();
    }

    private static void mostrarMenuEjemplos() {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion = 0;
            do {
                System.out.println("\n===== EJEMPLOS DE CONTROL FLOW =====");
                System.out.println("1. Demostrar Switch");
                System.out.println("2. Demostrar For");
                System.out.println("3. Demostrar While");
                System.out.println("4. Demostrar Try-Catch");
                System.out.println("5. Demostrar Operador Ternario");
                System.out.println("6. Salir");
                try {
                    System.out.print("Seleccione un ejemplo: ");
                    opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1 -> ejemploSwitch();
                        case 2 -> ejemploFor();
                        case 3 -> ejemploWhile();
                        case 4 -> ejemploTryCatch();
                        case 5 -> ejemploOperadorTernario();
                        case 6 -> System.out.println("Saliendo...");
                        default -> System.out.println("Opción no válida.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingrese un número válido.");
                    scanner.nextLine();
                }
            } while (opcion != 6);
        }
    }

    public static void ejemploSwitch() {
        System.out.println("\n--- EJEMPLO 1: Switch con int ---");
        int dia = 1;
        switch (dia) {
            case 1, 2, 3, 4, 5 -> System.out.println("Es un día laboral");
            case 6, 7 -> System.out.println("Es fin de semana");
            default -> System.out.println("Día no válido");
        }

        System.out.println("\n--- EJEMPLO 2: Switch con String ---");
        String estado = "EN_CAMINO";
        switch (estado) {
            case "EN_CAMINO" -> System.out.println("El pedido está en camino");
            case "ENTREGADO" -> System.out.println("El pedido ha sido entregado");
            default -> System.out.println("Estado no reconocido");
        }

        System.out.println("\n--- EJEMPLO 3: Switch Expression (arrow syntax) ---");
        int statusCode = 404;
        String mensaje = switch (statusCode) {
            case 200 -> "OK";
            case 404 -> "Not Found";
            case 500 -> "Internal Server Error";
            default -> "Unknown Status Code";
        };
        System.out.println("Mensaje para código " + statusCode + ": " + mensaje);
    }

    public static void ejemploFor() {
        System.out.println("\n--- EJEMPLO 1: For clásico con índice ---");
        String[] productos = {"Laptop", "Smartphone", "Tablet"};
        for (int i = 0; i < productos.length; i++) {
            System.out.println("[" + i + "] Producto: " + productos[i]);
        }

        System.out.println("\n--- EJEMPLO 2: Enhanced For (for-each) ---");
        for (String producto : productos) {
            System.out.println("Producto: " + producto);
        }

        System.out.println("\n--- EJEMPLO 3: For-each con List ---");
        java.util.List<String> productosList = java.util.List.of("Laptop", "Smartphone", "Tablet");
        for (String producto : productosList) {
            System.out.println("Producto: " + producto);
        }
    }

    public static void ejemploWhile() {
        System.out.println("\n--- EJEMPLO 1: While loop ---");
        boolean conectado = false;
        int intentos = 0;
        while (!conectado && intentos < 3) {
            System.out.println("Intentando conectar... Intento #" + (intentos + 1));
            intentos++;
            if (intentos == 3) {
                conectado = true;
            }
        }
        System.out.println("CONECTADO.\n");

        System.out.println("--- EJEMPLO 2: Do-While loop ---");
        boolean desconectado = true;
        int intentosDesconexion = 0;
        do {
            System.out.println("Desconectando... Intento #" + (intentosDesconexion + 1));
            intentosDesconexion++;
            if (intentosDesconexion == 3) {
                desconectado = false;
            }
        } while (desconectado);
        System.out.println("DESCONECTADO.");
    }

    public static void ejemploTryCatch() {
        System.out.println("\n--- Intento de división por cero ---");
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error capturado: No se puede dividir por cero");
            System.out.println("Mensaje: " + e.getMessage());
        }
    }

    public static void ejemploOperadorTernario() {
        System.out.println("\n--- Operador Ternario (condición ? valor_si_verdadero : valor_si_falso) ---");
        int[] numeros = {10, 15, 20, 23, 8};
        for (int numero : numeros) {
            String resultado = (numero % 2 == 0) ? "Par" : "Impar";
            System.out.println("El número " + numero + " es: " + resultado);
        }
    }
}
