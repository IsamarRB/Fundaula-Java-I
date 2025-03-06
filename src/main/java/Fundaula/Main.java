package Fundaula;

import java.util.Scanner;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejecutando todos los ejercicios:");

        // Un solo Scanner para todos los ejercicios
        Scanner scanner = new Scanner(System.in);

        try {
            for (int i = 1; i <= 22; i++) {
                try {
                    // Construir el nombre de la clase dinámicamente
                    String className = "Ejercicios.Ejercicio" + i;

                    // Cargar la clase
                    Class<?> clase = Class.forName(className);

                    // Verificar si la clase tiene el constructor esperado
                    if (clase.getDeclaredConstructor(Scanner.class) != null) {
                        // Crear instancia del ejercicio pasando el Scanner
                        Object instancia = clase.getConstructor(Scanner.class).newInstance(scanner);

                        // Ejecutar el método ejecutar()
                        clase.getMethod("ejecutar").invoke(instancia);
                    }

                } catch (ClassNotFoundException e) {
                    System.out.println("Ejercicio" + i + " no encontrado.");
                } catch (NoSuchMethodException e) {
                    System.out.println("Ejercicio" + i + " no tiene un constructor adecuado o método ejecutar().");
                } catch (InvocationTargetException e) {
                    System.out.println("Error en la ejecución de Ejercicio" + i + ": " + e.getCause().getMessage());
                } catch (Exception e) {
                    System.out.println("Error ejecutando Ejercicio" + i + ": " + e.getMessage());
                }
            }
        } finally {
            scanner.close();  // Asegurar que el scanner se cierra correctamente
        }

        System.out.println("Todos los ejercicios ejecutados.");
    }
}


