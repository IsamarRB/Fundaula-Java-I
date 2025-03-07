package Ejercicios;

import java.util.Scanner;

public class Ejercicio19 {
    private Scanner scanner;

    public Ejercicio19(Scanner scanner) {
        this.scanner = scanner;
    }
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ejecutando Ejercicio 19: Introduce la cantidad en euros: ");
        double euros = scanner.nextDouble();
        System.out.print("Elige moneda (dolar, yen, libra): ");
        String moneda = scanner.next().toLowerCase();
        scanner.nextLine();

        double resultado = convertirMoneda(euros, moneda);
        if (resultado != -1) {
            System.out.println(euros + " euros en " + moneda + " son: " + resultado);
        } else {
            System.out.println("Moneda no válida.");
        }
    }

    public static double convertirMoneda(double euros, String moneda) {
        switch (moneda) {
            case "dolar": return euros * 1.28611;
            case "yen": return euros * 129.852;
            case "libra": return euros * 0.86;
            default: return -1;
        }
    }
}

