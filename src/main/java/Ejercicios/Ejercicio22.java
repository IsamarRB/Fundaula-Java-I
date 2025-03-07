package Ejercicios;

import java.util.Scanner;

public class Ejercicio22 {
    private Scanner scanner;

    public Ejercicio22(Scanner scanner) {
        this.scanner = scanner;
    }
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ejecutando Ejercicio 22: Introduce el número de horas en el parking: ");
        int horas = scanner.nextInt();
        scanner.nextLine();

        double costo = calcularPrecioParking(horas);
        System.out.println("El precio total es: " + costo + " euros.");
    }

    public static double calcularPrecioParking(int horas) {
        if (horas <= 3) {
            return horas * 2.50;
        } else if (horas <= 24) {
            return Math.min(28, 3 * 2.50 + (horas - 3) * 1.30);
        } else {
            int dias = horas / 24;
            int horasExtras = horas % 24;
            return (dias * 28) + Math.min(28, horasExtras * 1.30);
        }
    }
}

