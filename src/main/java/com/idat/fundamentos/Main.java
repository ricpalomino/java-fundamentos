package com.idat.fundamentos;

import com.idat.fundamentos.examples.ExamplesMenu;

/**
 * Punto de entrada principal de la aplicación.
 *
 * Para usar diferentes funcionalidades:
 * - StudentManagementApp: Sistema de gestión de alumnos
 * - ExamplesMenu: Centro de ejemplos educativos (Control Flow, OOP, Streams, etc.)
 *
 * O ejecuta directamente cualquier clase ejemplo:
 * - ControlFlowExamples.main()
 * - OOPExamples.main()
 * - MethodOverloadingExamples.main()
 * - StreamsExamples.main()
 */
public class Main {
    public static void main(String[] args) {
        StudentManagementApp.run();
    }
}