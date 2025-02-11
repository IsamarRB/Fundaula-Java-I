package Ejercicios;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de horas en el parking: ");
        int horas = scanner.nextInt();
        scanner.close();

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

