package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    private Scanner scanner;

    public Ejercicio9(Scanner scanner) {
        this.scanner = scanner;
    }
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ejecutando Ejercicio 9: Introduce el límite inferior: ");
        int min = scanner.nextInt();
        System.out.print("Introduce el límite superior: ");
        int max = scanner.nextInt();

        System.out.println("Números aleatorios generados:");
        for (int i = 0; i < 10; i++) {
            System.out.println(generarNumeroAleatorio(min, max));
        }
    }

    public static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}

