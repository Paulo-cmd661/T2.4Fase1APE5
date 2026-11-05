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
---

## Ejercicio 2: Escribir información en un fichero

### Planteamiento
Se necesita un programa en Java que reciba un mensaje escrito por teclado y lo guarde al final del archivo de texto `estudiantes.txt`, que ya debe existir, sin borrar lo que contenía antes.

### Requisitos
- Importar las clases necesarias.
- Crear un objeto `Scanner` para leer datos por teclado.
- Pedir al usuario que escriba un mensaje.
- Abrir `estudiantes.txt` con `FileWriter`.
- Usar el parámetro `true` para conservar la información anterior.
- Guardar el mensaje con `write()`.
- Cerrar el archivo con `close()`.
- Mostrar un mensaje de confirmación.
- Controlar los errores con `try-catch`.

**Nota:** el archivo `estudiantes.txt` debe existir antes de ejecutar el programa.

### Clases y métodos utilizados
| Elemento | Función |
|---|---|
| `Scanner` | Lee por teclado el mensaje que escribe el usuario |
| `FileWriter` | Abre el archivo para escribir en él |
| `true` (segundo parámetro) | Activa el modo *append*: agrega al final sin borrar el contenido anterior |
| `write()` | Escribe el mensaje en el archivo |
| `close()` | Cierra el archivo y libera el recurso |
| `IOException` | Excepción que se captura si falla la escritura |

### Explicación de la solución
1. Se importan `java.io.FileWriter`, `java.io.IOException` y `java.util.Scanner`.
2. Se crea el `Scanner` y se pide al usuario que escriba un mensaje, que se guarda en una variable `String`.
3. Dentro de un bloque `try` se crea el `FileWriter` con `estudiantes.txt` y el parámetro `true`, para que el mensaje se añada al final.
4. Con `write()` se guarda el mensaje seguido de un salto de línea, y luego se cierra el archivo con `close()`.
5. Se muestra un mensaje indicando que la información se guardó correctamente.
6. El bloque `catch` captura una posible `IOException` y muestra un mensaje de error.

### Código fuente
```java
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirFichero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un mensaje: ");
        String mensaje = sc.nextLine();

        try {
            FileWriter escritor = new FileWriter("estudiantes.txt", true);
            escritor.write(mensaje + System.lineSeparator());
            escritor.close();

            System.out.println("La información se guardó correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }

        sc.close();
    }
}
```

### Captura de pantalla
<img width="943" height="165" alt="image" src="https://github.com/user-attachments/assets/c0d7a2d1-f4c2-4941-9599-b055bd293476" />
