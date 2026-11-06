import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio09 {
    public static void main(String[] args) {
        String[] nuevasMaterias = {
            "Química General",
            "Comunicación Oral y Escrita"
        };

        BufferedWriter escritor = null;

        try {
            // 1. Modo de adición: el segundo parámetro (append = true) conserva el contenido previo
            escritor = new BufferedWriter(new FileWriter("materias.txt", true));

            // 2. Añadir dos asignaturas al final, una por línea
            for (int i = 0; i < nuevasMaterias.length; i++) {
                escritor.write(nuevasMaterias[i]);
                escritor.newLine();
            }

            System.out.println("Asignaturas agregadas al final de materias.txt.");
        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.getMessage());
        } finally {
            // 3. Cerrar el flujo con close()
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
