package com.idat.fundamentos.examples;

import java.util.Scanner;
import java.util.InputMismatchException;
import com.idat.fundamentos.Vehiculo;
import com.idat.fundamentos.Auto;
import com.idat.fundamentos.Moto;
import com.idat.poo.PagoYape;
import com.idat.poo.PagoTarjeta;

public class OOPExamples {

    public static void main(String[] args) {
        mostrarMenuEjemplos();
    }

    private static void mostrarMenuEjemplos() {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion = 0;
            do {
                System.out.println("\n===== EJEMPLOS DE OOP =====");
                System.out.println("1. Demostrar Herencia (Vehículos)");
                System.out.println("2. Demostrar Polimorfismo (Métodos de Pago)");
                System.out.println("3. Ver ambos");
                System.out.println("4. Salir");
                try {
                    System.out.print("Seleccione un ejemplo: ");
                    opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1 -> demonstrateVehicles();
                        case 2 -> demonstratePayments();
                        case 3 -> {
                            demonstrateVehicles();
                            demonstratePayments();
                        }
                        case 4 -> System.out.println("Saliendo...");
                        default -> System.out.println("Opción no válida.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingrese un número válido.");
                    scanner.nextLine();
                }
            } while (opcion != 4);
        }
    }

    public static void demonstrateVehicles() {
        System.out.println("\n--- HERENCIA: Clase abstracta Vehiculo ---");

        System.out.println("\n1. Vehículo genérico con validación:");
        Vehiculo miVehiculo = new Auto();
        miVehiculo.setMarca("Toyota");
        miVehiculo.setVelocidad(120.5);
        System.out.println("Marca: " + miVehiculo.getMarca());
        System.out.println("Velocidad: " + miVehiculo.getVelocidad() + " km/h");

        System.out.println("\n2. Intento de establecer velocidad negativa (rechazada):");
        miVehiculo.setVelocidad(-50);
        System.out.println("Velocidad después de intento negativo: " + miVehiculo.getVelocidad() + " km/h");

        System.out.println("\n3. Auto (subclase de Vehiculo):");
        Vehiculo miAuto = new Auto();
        miAuto.setMarca("Honda");
        miAuto.arrancar();
        miAuto.mover();

        System.out.println("\n4. Moto (subclase de Vehiculo):");
        Vehiculo miMoto = new Moto();
        miMoto.setMarca("Yamaha");
        miMoto.arrancar();
        miMoto.mover();

        System.out.println("\nConcepto: Ambos heredan de Vehiculo pero implementan");
        System.out.println("arrancar() y mover() de forma diferente (Polimorfismo)");
    }

    public static void demonstratePayments() {
        System.out.println("\n--- POLIMORFISMO: Métodos de Pago ---");

        System.out.println("\n1. Pago con Yape:");
        PagoYape pagoYape = new PagoYape();
        pagoYape.setNumeroYape("987654321");
        System.out.println("Número Yape: " + pagoYape.getNumeroYape());
        pagoYape.pagar(150.75);

        System.out.println("\n2. Pago con Tarjeta:");
        PagoTarjeta pagoTarjeta = new PagoTarjeta();
        pagoTarjeta.setNumeroTarjeta("1234-5678-9012-3456");
        System.out.println("Número de Tarjeta: " + pagoTarjeta.getNumeroTarjeta());
        pagoTarjeta.pagar(250.50);

        System.out.println("\nConcepto: Ambas clases extienden MetodoPago (abstract)");
        System.out.println("y cada una implementa pagar() de forma diferente");
    }
}
