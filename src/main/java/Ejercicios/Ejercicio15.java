package Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numero;

        System.out.println("Introduce números (-1 para salir):");
        while ((numero = scanner.nextInt()) != -1) {
            contador++;
        }
        scanner.close();

        System.out.println("Se han introducido " + contador + " números.");
    }
}

