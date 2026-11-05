# T2.4Fase1APE5

**Asignatura:** Algoritmos y Lógica de Programación
**Estudiante:** Paulo Josué Escobar Bautista
**Paralelo:** 1B, Software, UTA

---

## Ejercicio 1: Crear un fichero en Java

### Planteamiento
Se requiere un programa en Java que genere un archivo de texto con el nombre `curso.txt`, verifique si la operación tuvo éxito o si el archivo ya estaba creado, y muestre su nombre en pantalla.

### Indicaciones
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

### Indicaciones
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
<img width="943" height="176" alt="image" src="https://github.com/user-attachments/assets/24b4936f-1827-4ddf-8099-1cb40e7dc64b" />
---

## Ejercicio 3: Eliminar un fichero en Java

### Planteamiento
Se necesita un programa en Java que elimine el archivo de texto `estudiantes.txt`, verifique si la eliminación fue exitosa y muestre un mensaje según el resultado.

### Indicaciones
- Importar la clase necesaria para trabajar con archivos.
- Crear un objeto `File` con el nombre del archivo a eliminar.
- Usar `delete()` para intentar eliminarlo.
- Comprobar si la eliminación se realizó correctamente.
- Mostrar un mensaje de confirmación si se eliminó.
- Mostrar un mensaje indicando el problema si no se pudo eliminar.

### Clases y métodos utilizados
| Elemento | Función |
|---|---|
| `File` | Representa el archivo `estudiantes.txt` dentro del programa |
| `delete()` | Intenta eliminar el archivo y devuelve `true` si lo logró o `false` si falló |
| `if-else` | Decide qué mensaje mostrar según el resultado de `delete()` |
| `System.out.println()` | Muestra los mensajes en pantalla |


### Código fuente
```java
import java.io.File;

public class EliminarFichero {
    public static void main(String[] args) {
        File archivo = new File("estudiantes.txt");

        if (archivo.delete()) {
            System.out.println("El archivo " + archivo.getName() + " se eliminó correctamente.");
        } else {
            System.out.println("No se pudo eliminar el archivo (puede que no exista o esté en uso).");
        }
    }
}
```


### Captura de pantalla
<img width="1003" height="173" alt="image" src="https://github.com/user-attachments/assets/1665a76a-023f-494d-86fa-39cb2c6d43a6" />
