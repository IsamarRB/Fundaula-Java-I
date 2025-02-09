package Ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(300) + 1;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un dígito (0-9): ");
        int digito = scanner.nextInt();
        scanner.close();

        System.out.println("Números que terminan en " + digito + ":");
        for (int num : numeros) {
            if (num % 10 == digito) {
                System.out.println(num);
            }
        }
    }
}

