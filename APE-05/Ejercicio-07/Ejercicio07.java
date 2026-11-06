import java.io.File;
import java.io.IOException;

public class Ejercicio07 {
    public static void main(String[] args) {
        // Objeto File que representa la ruta (abstracción de la ruta)
        File archivo = new File("datos/prueba.txt");

        // 1. Comprobación previa
        if (archivo.exists()) {
            System.out.println("El archivo ya existe en el disco.");
        } else {
            System.out.println("El archivo no existe. Se intentará crearlo...");

            // La carpeta "datos" debe existir para poder crear el archivo dentro
            File carpeta = archivo.getParentFile();
            if (carpeta != null && !carpeta.exists()) {
                carpeta.mkdirs();
            }

            // 2. Creación controlada con manejo de IOException
            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado correctamente.");
                } else {
                    System.out.println("No se pudo crear el archivo (ya existía).");
                }
            } catch (IOException e) {
                System.out.println("Error de E/S al crear el archivo: " + e.getMessage());
            }
        }

        // 3. Extracción de información
        System.out.println("Nombre (getName): " + archivo.getName());
        System.out.println("Ruta (getPath): " + archivo.getPath());
    }
}
