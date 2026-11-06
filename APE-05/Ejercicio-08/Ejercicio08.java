import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio08 {
    public static void main(String[] args) {
        String[] materias = {
            "Fundamentos de Programación",
            "Lógica Matemática",
            "Cálculo Diferencial",
            "Álgebra Lineal",
            "Física General"
        };

        BufferedWriter escritor = null;

        try {
            // 1. Flujo de salida: BufferedWriter enlazado con un FileWriter
            escritor = new BufferedWriter(new FileWriter("materias.txt"));

            // 2 y 3. Escribir cada asignatura y separar con newLine() (portable)
            for (int i = 0; i < materias.length; i++) {
                escritor.write(materias[i]);
                escritor.newLine();
            }

            System.out.println("Archivo materias.txt generado correctamente.");
        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.getMessage());
        } finally {
            // 4. Liberar recursos con close()
            try {
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
}
