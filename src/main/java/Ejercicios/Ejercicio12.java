package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    private Scanner scanner;

    public Ejercicio12(Scanner scanner) {
        this.scanner = scanner;
    }
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ejecutando Ejercicio 12: Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Introduce la operación (+, -, *, /, ^, %): ");
        String operacion = scanner.next();

        double resultado = calcular(num1, num2, operacion);
        System.out.println("Resultado: " + resultado);
    }

    public static double calcular(double a, double b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return b != 0 ? a / b : Double.NaN;
            case "^": return Math.pow(a, b);
            case "%": return a % b;
            default:
                System.out.println("Operación no válida.");
                return 0;
        }
    }
}

