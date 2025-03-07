package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    private Scanner scanner;

    public Ejercicio5(Scanner scanner) { // Se agregó la llave faltante
        this.scanner = scanner;
    }

    public void ejecutar() {
        System.out.print("Ejecutando Ejercicio 5: Introduce un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        // No cerrar scanner aquí para evitar errores en Main

        System.out.println("El factorial de " + numero + " es: " + calcularFactorial(numero));
    }

    public static long calcularFactorial(int n) {
        long factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }
}

