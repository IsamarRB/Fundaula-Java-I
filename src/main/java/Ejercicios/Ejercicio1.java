package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    private Scanner scanner;

    // Constructor que recibe Scanner
    public Ejercicio1(Scanner scanner) {
        this.scanner = scanner;
    }

    // Método que ejecuta el ejercicio
    public void ejecutar() {
        System.out.print("Ejecutando Ejercicio 1: Introduce una palabra: ");
        String palabra = scanner.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra NO es un palíndromo.");
        }
    }

    // Método para verificar si una palabra es palíndromo
    private boolean esPalindromo(String palabra) {
        String invertida = new StringBuilder(palabra).reverse().toString();
        return palabra.equalsIgnoreCase(invertida);
    }
}

