package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();
        scanner.close();

        String[] palabras = frase.split(" ");

        System.out.println("Palabras en el array:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
