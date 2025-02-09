package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        char[] abecedario = crearAbecedario();
        Scanner scanner = new Scanner(System.in);
        StringBuilder resultado = new StringBuilder();

        System.out.println("Introduce posiciones del 0 al 25 (-1 para terminar):");
        int posicion;
        while ((posicion = scanner.nextInt()) != -1) {
            if (posicion >= 0 && posicion < abecedario.length) {
                resultado.append(abecedario[posicion]);
            } else {
                System.out.println("Posición fuera de rango.");
            }
        }
        scanner.close();

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

