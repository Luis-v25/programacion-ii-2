// Este programa calcula la edad aproximada de un usuario

import java.util.Scanner; // Sirve para leer lo que escribe el usuario

public class CalculadoraEdad {

    public static void main(String[] args) {

        // Creamos un lector para leer lo que escribe el usuario
        Scanner entrada = new Scanner(System.in);

        // Pedimos el nombre del usuario
        System.out.println("Escribe tu nombre:");
        String nombre = entrada.nextLine(); // Guardamos el nombre

        // Pedimos el año en que nació
        System.out.println("Escribe tu año de nacimiento:");
        int añoNacimiento = entrada.nextInt(); // Guardamos el año

        // Calculamos la edad usando 2025 como el año actual
        int edad = 2025 - añoNacimiento;

        // Mostramos el resultado
        System.out.println("Hola " + nombre + ", tu edad aproximada es: " + edad + " años.");

        entrada.close();
    }
}
