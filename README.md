# T2.4Fase1APE5

**Asignatura:** Algoritmos y Lógica de Programación

**Estudiante:** Paulo Josué Escobar Bautista

**Paralelo:** 1B, Software, UTA

---

## Ejercicio 1: Crear un fichero en Java

### Planteamiento
Se requiere un programa en Java que genere un archivo de texto con el nombre `curso.txt`, verifique si la operación tuvo éxito o si el archivo ya estaba creado, y muestre su nombre en pantalla.

### Requerimiento
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



### Captura de pantalla
<img width="1028" height="173" alt="image" src="https://github.com/user-attachments/assets/7f13c366-872f-40e7-948d-9f987bc7fb41" />
---

## Ejercicio 2: Escribir información en un fichero

### Planteamiento
Se necesita un programa en Java que reciba un mensaje escrito por teclado y lo guarde al final del archivo de texto `estudiantes.txt`, que ya debe existir, sin borrar lo que contenía antes.

### Requerimiento
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




### Captura de pantalla
<img width="943" height="176" alt="image" src="https://github.com/user-attachments/assets/24b4936f-1827-4ddf-8099-1cb40e7dc64b" />


## Ejercicio 3: Eliminar un fichero en Java

### Planteamiento
Se necesita un programa en Java que elimine el archivo de texto `estudiantes.txt`, verifique si la eliminación fue exitosa y muestre un mensaje según el resultado.

### Requerimiento
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




### Captura de pantalla
<img width="1030" height="170" alt="image" src="https://github.com/user-attachments/assets/35bc6f85-a945-4a3d-b4c7-17a02db11e1d" />


# Ejercicios de APE clase 2

## Ejercicio 4: Registro de estudiantes y calificaciones

### Planteamiento

Se requiere un programa en Java que registre los datos de 3 estudiantes (nombre y calificación) y los guarde en un archivo de texto llamado `estudiantes.txt`, de modo que cada estudiante ocupe dos líneas.

### Requerimiento

- Importar las clases necesarias para manejar archivos y leer datos.
- Crear un objeto de tipo `Scanner` para solicitar los datos.
- Crear un objeto `BufferedWriter` a partir de un `FileWriter`.
- Usar un ciclo `for` para registrar los 3 estudiantes.
- Escribir el nombre y la calificación con `write()` y `newLine()`.
- Cerrar el archivo con `close()`.
- Controlar los errores con `try-catch`.

### Clases y métodos utilizados

| Elemento | Función |
|---|---|
| `Scanner` | Lee por teclado el nombre y la calificación |
| `FileWriter` | Abre o crea el archivo `estudiantes.txt` |
| `BufferedWriter` | Escribe el texto en el archivo de forma eficiente |
| `write()` | Escribe una cadena de texto en el archivo |
| `newLine()` | Agrega un salto de línea para separar los datos |
| `close()` | Cierra el archivo y libera los recursos |
| `IOException` | Excepción que se captura si falla la escritura |

### Captura de pantalla

![Ejercicio 1](capturas/ejercicio1.png)

---

## Ejercicio 5: Registro de productos con modo Append

### Planteamiento

Se requiere un programa en Java que registre productos (nombre, precio y cantidad), calcule el valor total de cada uno (precio × cantidad) y lo guarde en `productos.txt` sin borrar los registros anteriores.

### Requerimiento

- Importar las clases necesarias para manejar archivos y leer datos.
- Crear un `Scanner` para solicitar nombre, precio y cantidad.
- Abrir el archivo en modo append con `new FileWriter("productos.txt", true)`.
- Calcular el valor total con `precio * cantidad`.
- Guardar los resultados con `BufferedWriter`.
- Preguntar si se desea registrar otro producto.
- Controlar los errores con `try-catch`.

### Clases y métodos utilizados

| Elemento | Función |
|---|---|
| `Scanner` | Lee por teclado los datos del producto |
| `FileWriter(archivo, true)` | Abre el archivo en modo append (conserva lo anterior) |
| `BufferedWriter` | Escribe los datos del producto en el archivo |
| `nextDouble()` / `nextInt()` | Leen el precio y la cantidad |
| `String.format()` | Da formato con dos decimales al valor total |
| `IOException` | Excepción que se captura si falla la escritura |

### Captura de pantalla

![Ejercicio 2](capturas/ejercicio2.png)

---

## Ejercicio 6: Sistema de registro de ventas

### Planteamiento

Se requiere un programa en Java que registre las ventas de una tienda en `ventas.txt`. Debe calcular el subtotal de cada venta, aplicar un descuento del 10% si el subtotal es mayor o igual a $100, mostrar el total a pagar y guardar al final el total acumulado.

### Requerimiento

- Importar las clases necesarias para manejar archivos y leer datos.
- Abrir `ventas.txt` en modo append para no eliminar registros anteriores.
- Repetir el registro con un ciclo `while` hasta que el usuario escriba `fin`.
- Calcular el subtotal con `precio * cantidad`.
- Aplicar el descuento del 10% con una condición `if`.
- Mostrar el total a pagar en pantalla.
- Acumular el total de todas las ventas.
- Guardar el total acumulado al finalizar.
- Controlar los errores con `try-catch`.

### Clases y métodos utilizados

| Elemento | Función |
|---|---|
| `Scanner` | Lee el producto, el precio y la cantidad |
| `equalsIgnoreCase("fin")` | Detecta cuándo el usuario termina el registro |
| `if (subtotal >= 100)` | Aplica el descuento del 10% |
| `FileWriter(archivo, true)` | Abre `ventas.txt` en modo append |
| `BufferedWriter` | Guarda cada venta y el total acumulado |
| `printf()` | Muestra el total a pagar con formato |
| `IOException` | Excepción que se captura si falla la escritura |

### Captura de pantalla

![Ejercicio 3](capturas/ejercicio3.png)


