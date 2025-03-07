package Fundaula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" _____  _               _      _                    _   ___     ___    \n" +
                "| ____|(_) ___ _ __ ___(_) ___(_) ___  ___         | | / \\ \\   / / \\   \n" +
                "|  _|  | |/ _ \\ '__/ __| |/ __| |/ _ \\/ __|     _  | |/ _ \\ \\ / / _ \\  \n" +
                "| |___ | |  __/ | | (__| | (__| | (_) \\__ \\    | |_| / ___ \\ V / ___ \\ \n" +
                "|_____|/ |\\___|_|  \\___|_|\\___|_|\\___/|___/     \\___/_/   \\_\\_/_/   \\_\\\n" +
                "     |__/                                                              ");

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
        System.out.println("\n _____ ___ _   _ \n" +
                "|  ___|_ _| \\ | |\n" +
                "| |_   | ||  \\| |\n" +
                "|  _|  | || |\\  |\n" +
                "|_|   |___|_| \\_|\n");
    }
}



