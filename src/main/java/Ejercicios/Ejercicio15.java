package Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    private Scanner scanner;

    public Ejercicio15(Scanner scanner) {
        this.scanner = scanner;
    }
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numero;

        System.out.println("Ejecutando Ejercicio 15: Introduce números (-1 para salir):");
        while ((numero = scanner.nextInt()) != -1) {
            contador++;
        }

        System.out.println("Se han introducido " + contador + " números.");
    }
}

