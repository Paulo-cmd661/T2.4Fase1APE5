# T2.4Fase1APE5

**Asignatura:** Algoritmos y Lógica de Programación
**Estudiante:** Paulo Josué Escobar Bautista
**Paralelo:** 1B, Software, UTA

---

## Ejercicio 1: Crear un fichero en Java

### Planteamiento
Se requiere un programa en Java que genere un archivo de texto con el nombre `curso.txt`, verifique si la operación tuvo éxito o si el archivo ya estaba creado, y muestre su nombre en pantalla.

### Requisitos
- Importar las clases necesarias para manejar archivos.
- Crear un objeto de tipo `File`.
- Usar `createNewFile()` para crear el archivo.
- Verificar si se creó o si ya existía.
- Mostrar el nombre con `getName()`.
- Controlar los errores con `try-catch`.

### Clases y métodos utilizados
| Elemento | Función |
|---|---|
| `File` | Representa el archivo `curso.txt` dentro del programa |
| `createNewFile()` | Crea el archivo y devuelve `true` si lo creó o `false` si ya existía |
| `getName()` | Devuelve el nombre del archivo |
| `IOException` | Excepción que se captura si falla la creación |

### Explicación de la solución
1. Se importan `java.io.File` y `java.io.IOException`.
2. Dentro de un bloque `try` se crea el objeto `File` con el nombre `curso.txt`.
3. Con un `if`, se llama a `createNewFile()`: si devuelve `true`, el archivo se creó y se muestra un mensaje de éxito; si devuelve `false`, se informa que ya existía.
4. En ambos casos se imprime el nombre del archivo con `getName()`.
5. El bloque `catch` captura una posible `IOException` y muestra un mensaje de error.

### Código fuente
```java
import java.io.File;
import java.io.IOException;

public class CrearFichero {
    public static void main(String[] args) {
        try {
            File archivo = new File("curso.txt");

            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe: " + archivo.getName());
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo.");
            e.printStackTrace();
        }
    }
}
```

### Captura de pantalla
<img width="1028" height="173" alt="image" src="https://github.com/user-attachments/assets/7f13c366-872f-40e7-948d-9f987bc7fb41" />
