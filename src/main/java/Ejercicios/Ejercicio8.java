package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas ventas vas a introducir? ");
        int cantidad = scanner.nextInt();

        double suma = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce la venta " + (i + 1) + ": ");
            suma += scanner.nextDouble();
        }
        scanner.close();

        System.out.println("La suma total de ventas es: " + suma);
    }
}

