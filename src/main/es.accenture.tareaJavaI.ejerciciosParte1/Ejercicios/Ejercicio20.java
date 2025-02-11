package Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos alumnos vas a registrar? ");
        int cantidad = scanner.nextInt();
        String[] nombres = new String[cantidad];
        double[] notas = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce el nombre del alumno: ");
            nombres[i] = scanner.next();
            System.out.print("Introduce la nota de " + nombres[i] + ": ");
            notas[i] = scanner.nextDouble();
        }
        scanner.close();

        System.out.println("\nListado de alumnos:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(nombres[i] + " - " + calificacion(notas[i]));
        }
    }

    public static String calificacion(double nota) {
        if (nota < 5) return "SUSPENSO";
        if (nota < 7) return "BIEN";
        if (nota < 9) return "NOTABLE";
        return "SOBRESALIENTE";
    }
}
