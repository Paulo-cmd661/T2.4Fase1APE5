import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("estudiantes.txt"));

            for (int i = 1; i <= 3; i++) {
                System.out.print("Nombre del estudiante " + i + ": ");
                String nombre = sc.nextLine();

                System.out.print("Calificación de " + nombre + ": ");
                String calificacion = sc.nextLine();

                // Cada estudiante ocupa dos líneas: nombre y calificación
                bw.write(nombre);
                bw.newLine();
                bw.write(calificacion);
                bw.newLine();
            }
            System.out.println("Datos guardados en estudiantes.txt");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
            sc.close();
        }
    }
}
