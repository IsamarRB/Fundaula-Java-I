package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        pedirNumeros(numeros);
        mostrarNumeros(numeros);
    }

    public static void pedirNumeros(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el número en la posición " + i + ": ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static void mostrarNumeros(int[] array) {
        System.out.println("Contenido del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + " -> " + array[i]);
        }
    }
}

