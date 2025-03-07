package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    private Scanner scanner;

    public Ejercicio14(Scanner scanner) {
        this.scanner = scanner;
    }
    public void ejecutar (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ejecutando Ejercicio 14: Introduce una frase: ");
        String frase = scanner.nextLine();

        System.out.print("¿Convertir a mayúsculas (M) o minúsculas (m)? ");
        char opcion = scanner.next().charAt(0);

        if (opcion == 'M' || opcion == 'm') {
            String resultado = opcion == 'M' ? frase.toUpperCase() : frase.toLowerCase();
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Opción no válida.");
        }
    }
}

