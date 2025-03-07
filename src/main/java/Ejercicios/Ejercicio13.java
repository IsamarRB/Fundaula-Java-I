package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    private Scanner scanner;

    public Ejercicio13(Scanner scanner) {
        this.scanner = scanner;
    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ejecutando Ejercicio 13: Introduce una frase: ");
        String frase = scanner.nextLine();

        String fraseSinEspacios = frase.replace(" ", "");
        System.out.println("Frase sin espacios: " + fraseSinEspacios);
    }
}

