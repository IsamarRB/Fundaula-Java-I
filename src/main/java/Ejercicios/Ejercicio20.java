package Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
    private Scanner scanner;

    public Ejercicio20(Scanner scanner) {
        this.scanner = scanner;
    }
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ejecutando Ejercicio 20: ¿Cuántos alumnos vas a registrar? ");
        int cantidad = scanner.nextInt();
        String[] nombres = new String[cantidad];
        double[] notas = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce el nombre del alumno: ");
            nombres[i] = scanner.next();
            System.out.print("Introduce la nota de " + nombres[i] + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();
        }

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
