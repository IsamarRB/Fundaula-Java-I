package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void ejecutar() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ejecutando Ejercicio 1: Introduce una palabra: ");
        String palabra = scanner.nextLine();
        scanner.close();

        if (esPalindromo(palabra)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra NO es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String palabra) {
        String invertida = new StringBuilder(palabra).reverse().toString();
        return palabra.equalsIgnoreCase(invertida);
    }
}
