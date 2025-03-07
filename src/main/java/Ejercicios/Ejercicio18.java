package Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio18 {
    private Scanner scanner;

    public Ejercicio18(Scanner scanner) {
        this.scanner = scanner;
    }
    public void ejecutar() {
        int[] numeros = {10, 35, 50, 23, 8, 90, 100, 17, 44, 65};
        ArrayList<Integer> filtrados = new ArrayList<>();

        for (int num : numeros) {
            if (num > 25 && num % 2 == 0) {
                filtrados.add(num);
            }
            scanner.nextLine();
        }

        System.out.println("Ejecutando Ejercicio 18: Array original: " + Arrays.toString(numeros));
        System.out.println("Números pares y mayores de 25: " + filtrados);
    }
}