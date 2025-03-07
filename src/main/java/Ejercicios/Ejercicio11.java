package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    private Scanner scanner;

    public Ejercicio11(Scanner scanner) {
        this.scanner = scanner;
    }
    public void ejecutar() {
        System.out.println("Ejecutando Ejercicio 11: Números primos entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

