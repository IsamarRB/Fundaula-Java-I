package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        System.out.print("¿Convertir a mayúsculas (M) o minúsculas (m)? ");
        char opcion = scanner.next().charAt(0);
        scanner.close();

        if (opcion == 'M' || opcion == 'm') {
            String resultado = opcion == 'M' ? frase.toUpperCase() : frase.toLowerCase();
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Opción no válida.");
        }
    }
}

