package Fundaula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejecutando todos los ejercicios:");

        // Un solo Scanner para todos los ejercicios
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 22; i++) {
            try {
                // Espacio para separar cada ejercicio
                System.out.println("\n------------------------------\n");

                // Construir el nombre de la clase dinámicamente
                String className = "Ejercicios.Ejercicio" + i;

                // Cargar la clase
                Class<?> clase = Class.forName(className);

                // Crear instancia del ejercicio pasando el Scanner
                Object instancia = clase.getConstructor(Scanner.class).newInstance(scanner);

                // Ejecutar el método ejecutar()
                clase.getMethod("ejecutar").invoke(instancia);

            } catch (NoSuchMethodException e) {
                System.out.println("Ejercicio" + i + " no tiene un método ejecutar().");
            } catch (Exception e) {
                System.out.println("Error ejecutando Ejercicio" + i + ": " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("\nTodos los ejercicios ejecutados.");
    }
}



