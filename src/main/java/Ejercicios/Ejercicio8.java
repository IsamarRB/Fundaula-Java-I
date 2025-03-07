package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    private Scanner scanner;

    public Ejercicio8(Scanner scanner) {
        this.scanner = scanner;
    }
    public void ejecutar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ejecutando Ejercicio 8: ¿Cuántas ventas vas a introducir? ");
        int cantidad = scanner.nextInt();

        double suma = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce la venta " + (i + 1) + ": ");
            suma += scanner.nextDouble();
        }

        System.out.println("La suma total de ventas es: " + suma);
    }
}

