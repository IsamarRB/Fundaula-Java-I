package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();
        scanner.close();

        String fraseSinEspacios = frase.replace(" ", "");
        System.out.println("Frase sin espacios: " + fraseSinEspacios);
    }
}

