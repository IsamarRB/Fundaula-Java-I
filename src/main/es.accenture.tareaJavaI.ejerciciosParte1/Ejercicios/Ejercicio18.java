package Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio18 {
    public static void main(String[] args) {
        int[] numeros = {10, 35, 50, 23, 8, 90, 100, 17, 44, 65};
        ArrayList<Integer> filtrados = new ArrayList<>();

        for (int num : numeros) {
            if (num > 25 && num % 2 == 0) {
                filtrados.add(num);
            }
        }

        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Números pares y mayores de 25: " + filtrados);
    }
}

