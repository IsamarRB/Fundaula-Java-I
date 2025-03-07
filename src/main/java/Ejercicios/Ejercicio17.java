package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    private Scanner scanner;

    public Ejercicio17(Scanner scanner) {
        this.scanner = scanner;
    }

    public void ejecutar() {
        char[] abecedario = crearAbecedario();
        StringBuilder resultado = new StringBuilder();

        System.out.println("Ejecutando Ejercicio 17: Introduce posiciones del 0 al 25 (-1 para terminar): ");

        int posicion;
        while ((posicion = scanner.nextInt()) != -1) {
            if (posicion >= 0 && posicion < abecedario.length) {
                resultado.append(abecedario[posicion]);
            } else {
                System.out.println("Posición fuera de rango.");
            }
        }

        System.out.println("Cadena resultante: " + resultado);
    }

    public static char[] crearAbecedario() {
        char[] letras = new char[26];
        char letra = 'A';
        for (int i = 0; i < 26; i++, letra++) {
            letras[i] = letra;
        }
        return letras;
    }
}


