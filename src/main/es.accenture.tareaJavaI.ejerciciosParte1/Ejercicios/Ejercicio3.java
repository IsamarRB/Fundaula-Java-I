package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elige una figura (circulo, cuadrado, triangulo): ");
        String figura = scanner.nextLine().toLowerCase();

        double area = 0;

        switch (figura) {
            case "circulo":
                System.out.print("Introduce el radio: ");
                double radio = scanner.nextDouble();
                area = calcularAreaCirculo(radio);
                break;
            case "cuadrado":
                System.out.print("Introduce el lado: ");
                double lado = scanner.nextDouble();
                area = calcularAreaCuadrado(lado);
                break;
            case "triangulo":
                System.out.print("Introduce la base: ");
                double base = scanner.nextDouble();
                System.out.print("Introduce la altura: ");
                double altura = scanner.nextDouble();
                area = calcularAreaTriangulo(base, altura);
                break;
            default:
                System.out.println("Figura no válida.");
                return;
        }

        System.out.println("El área del " + figura + " es: " + area);
        scanner.close();
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
