package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número para calcular su factorial: ");
        int numero = scanner.nextInt();
        scanner.close();

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
