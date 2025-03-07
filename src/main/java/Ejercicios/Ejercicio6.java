package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    private Scanner scanner;

    public Ejercicio6(Scanner scanner) {
        this.scanner = scanner;
    }
    public void ejecutar() {
        int[] numeros = new int[10];
        pedirNumeros(numeros);
        mostrarNumeros(numeros);
    }

    public static void pedirNumeros(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ejecutando Ejercicio 6: Introduce el número en la posición " + i + ": ");
            array[i] = scanner.nextInt();
        }
    }

    public static void mostrarNumeros(int[] array) {
        System.out.println("Contenido del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + " -> " + array[i]);
        }
    }
}

