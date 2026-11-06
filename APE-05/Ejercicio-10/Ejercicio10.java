import java.io.File;
import java.io.IOException;

public class Ejercicio10 {
    public static void main(String[] args) {
        // 1. Objeto File que representa la ruta
        File archivo = new File("datos/temporal.txt");

        // 2. Consulta del estado y creación segura si no existe
        if (archivo.exists()) {
            System.out.println("El archivo ya existe: " + archivo.getPath());
        } else {
            System.out.println("El archivo no existe. Se intentara crearlo...");

            // La carpeta "datos" debe existir para poder crear el archivo dentro
            File carpeta = archivo.getParentFile();
            if (carpeta != null && !carpeta.exists()) {
                carpeta.mkdirs();
            }

            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado correctamente: " + archivo.getPath());
                } else {
                    System.out.println("No se pudo crear el archivo (ya existia).");
                }
            } catch (IOException e) {
                System.out.println("Error de E/S al crear el archivo: " + e.getMessage());
            }
        }

        // 3. Fase de validacion: simula la confirmacion del usuario
        boolean confirmarBorrado = true;

        // 4. delete() se usa unicamente si la confirmacion es verdadera
        if (confirmarBorrado) {
            boolean eliminado = archivo.delete();
            System.out.println("Resultado de delete(): " + eliminado);
            if (eliminado) {
                System.out.println("El archivo fue eliminado.");
            } else {
                System.out.println("No se pudo eliminar el archivo (puede que no exista).");
            }
        } else {
            System.out.println("Borrado cancelado: el archivo se conserva.");
        }
    }
}
