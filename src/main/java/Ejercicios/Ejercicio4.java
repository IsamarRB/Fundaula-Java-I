package Ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio4 {
    private Scanner scanner;

    public Ejercicio4(Scanner scanner) {
        this.scanner = scanner;
    }

    public void ejecutar() {
        System.out.print("Ejecutando Ejercicio 4: Introduce la cantidad de números aleatorios a generar: ");
        int cantidad = scanner.nextInt();

        int min, max;
        do {
            System.out.print("Introduce el valor mínimo del rango: ");
            min = scanner.nextInt();

            System.out.print("Introduce el valor máximo del rango: ");
            max = scanner.nextInt();

            if (min > max) {
                System.out.println("Error: El valor mínimo no puede ser mayor que el máximo. Intenta de nuevo.");
            }
        } while (min > max);

        System.out.println("Números aleatorios generados: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(generarNumeroAleatorio(min, max));
        }
    }

    public static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}



