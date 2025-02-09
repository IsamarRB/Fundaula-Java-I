package Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, sumaTotal = 0, sumaPositivos = 0, sumaNegativos = 0;

        System.out.println("Introduce números (-1 para terminar):");
        while ((numero = scanner.nextInt()) != -1) {
            sumaTotal += numero;
            if (numero > mayor) mayor = numero;
            if (numero < menor) menor = numero;
            if (numero > 0) sumaPositivos += numero;
            else sumaNegativos += numero;
        }
        scanner.close();

        System.out.println("Mayor número: " + mayor);
        System.out.println("Menor número: " + menor);
        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Suma positivos: " + sumaPositivos);
        System.out.println("Suma negativos: " + sumaNegativos);
    }
}

