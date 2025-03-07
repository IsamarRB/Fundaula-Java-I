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

        System.out.print("Introduce el valor mínimo del rango: ");
        int min = scanner.nextInt();

        System.out.print("Introduce el valor máximo del rango: ");
        int max = scanner.nextInt();

        // No cerramos el scanner para evitar problemas en Main

        System.out.println("Números aleatorios generados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(generarNumeroAleatorio(min, max));
        }
    }

    public static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random(); // Se crea dentro del método
        return random.nextInt((max - min) + 1) + min;
    }
}


