package Ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio7 {
    private Scanner scanner;

    public Ejercicio7(Scanner scanner) {
        this.scanner = scanner;
    }

    public void ejecutar() {
        int[] numeros = new int[20];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(300) + 1;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ejecutando Ejercicio 7: Introduce un dígito (0-9): ");
        int digito = scanner.nextInt();

        System.out.println("Números que terminan en " + digito + ":");
        for (int num : numeros) {
            if (num % 10 == digito) {
                System.out.println(num);
            }
        }
    }
}

