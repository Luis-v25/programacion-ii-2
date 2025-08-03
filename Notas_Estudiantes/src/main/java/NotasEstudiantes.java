import java.util.Scanner;

public class NotasEstudiantes {

    // Función para obtener el promedio de 3 notas
    public static double promedio(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // Función que dice si el estudiante pasa o no
    public static boolean pasa(double prom) {
        if (prom >= 61) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[5];
        double[] notasFinales = new double[5];
        String[] resultados = new String[5];

        System.out.print("¿Cuántos estudiantes desea ingresar (máximo 5)?: ");
        int total = sc.nextInt();
        sc.nextLine(); // limpiar el enter

        if (total > 5) {
            System.out.println("Solo se permiten hasta 5 estudiantes.");
            total = 5;
        }

        int cont = 0;

        while (cont < total) {
            System.out.println("\nEstudiante " + (cont + 1) + ":");

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Nota 1: ");
            double n1 = sc.nextDouble();

            System.out.print("Nota 2: ");
            double n2 = sc.nextDouble();

            System.out.print("Nota 3: ");
            double n3 = sc.nextDouble();
            sc.nextLine(); // limpiar el enter

            double prom = promedio(n1, n2, n3);
            boolean aprobado = pasa(prom);

            nombres[cont] = nombre;
            notasFinales[cont] = prom;
            resultados[cont] = aprobado ? "Aprobado" : "Reprobado";

            cont++;
        }

        System.out.println("\n=== Resumen de estudiantes ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Nombre: " + nombres[i] +
                    " | Promedio: " + String.format("%.2f", notasFinales[i]) +
                    " | Estado: " + resultados[i]);
        }

        sc.close();
    }
}
