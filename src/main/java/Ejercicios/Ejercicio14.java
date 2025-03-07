package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    private Scanner scanner;

    public Ejercicio14(Scanner scanner) {
        this.scanner = scanner;
    }

    public void ejecutar() {
        System.out.print("Ejecutando Ejercicio 14: Introduce una frase: ");

        if (scanner.hasNextLine()) {
            scanner.nextLine(); // Consumir el salto de línea pendiente si lo hay
        }

        String frase = scanner.nextLine(); // Captura la frase correctamente

        System.out.print("¿Convertir a mayúsculas (M) o minúsculas (m)? ");
        char opcion = scanner.next().charAt(0); // Captura la opción

        if (opcion == 'M' || opcion == 'm') {
            String resultado = (opcion == 'M') ? frase.toUpperCase() : frase.toLowerCase();
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Opción no válida.");
        }
    }
}






