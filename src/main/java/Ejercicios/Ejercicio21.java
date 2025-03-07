package Ejercicios;

import java.util.Scanner;

public class Ejercicio21 {
    private Scanner scanner;

    public Ejercicio21(Scanner scanner) {
        this.scanner = scanner;
    }
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ejecutando Ejercicio 21: Introduce un año: ");
        int año = scanner.nextInt();

        if (esBisiesto(año)) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " NO es un año bisiesto.");
        }
    }

    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}

