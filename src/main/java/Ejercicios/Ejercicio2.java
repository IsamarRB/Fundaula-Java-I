package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    private Scanner scanner; // Declaración del Scanner

    // Constructor que recibe Scanner
    public Ejercicio2(Scanner scanner) {
        this.scanner = scanner;
    }

    // Método que ejecuta el ejercicio
    public void ejecutar() {
        System.out.print("Ejecutando Ejercicio 2: Introduce una frase: ");
        String frase = scanner.nextLine(); // Leer la frase ingresada

        String[] palabras = frase.split(" "); // Separar por espacios

        System.out.println("Palabras en el array:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}

