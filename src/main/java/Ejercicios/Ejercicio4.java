package Ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Introduce la cantidad de números aleatorios a generar: ");
        int cantidad = scanner.nextInt();

        System.out.print("Introduce el valor mínimo del rango: ");
        int min = scanner.nextInt();

        System.out.print("Introduce el valor máximo del rango: ");
        int max = scanner.nextInt();
        scanner.close();

        System.out.println("Números aleatorios generados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(generarNumeroAleatorio(min, max, random));
        }
    }

    public static int generarNumeroAleatorio(int min, int max, Random random) {
        return random.nextInt((max - min) + 1) + min;
    }
}

