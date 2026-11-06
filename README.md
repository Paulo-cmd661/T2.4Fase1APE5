# APE-05-Ficheros

[![Java](https://img.shields.io/badge/JAVA-E38D1F?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com)
[![GitHub](https://img.shields.io/badge/GITHUB-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Paulo-cmd661)

---

## Información General

- **Carrera:** Ingeniería en Software
- **Asignatura:** Algoritmos y Lógica de Programación
- **Nivel / Paralelo:** Primer Semestre — Paralelo B
- **Actividad:** APE 5 – Ficheros
- **Modalidad:** Presencial
- **Nombre:** Paulo Josué Escobar Bautista

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

---


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


---

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

<img width="1453" height="127" alt="{85CC019D-642F-40CB-AE0F-BFBEA7871C14}" src="https://github.com/user-attachments/assets/f13aab75-422a-49f0-a432-dd6628668dfe" />


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

<img width="1380" height="278" alt="{CF61B670-E6A9-4CC2-B617-560BD3FE1116}" src="https://github.com/user-attachments/assets/c7d99bac-75fa-4d89-9216-2a43f92a6095" />


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

<img width="1325" height="192" alt="{CAE6F3E1-DED1-43B7-944E-B8B2998F00A4}" src="https://github.com/user-attachments/assets/fb7a72a4-ed3b-4745-a037-396e883cc49e" />


---

## Ejercicio 7: Exploración y Gestión de Metadatos con File

### Planteamiento
Se requiere un programa en Java que utilice la clase `File` para interactuar con la ruta `datos/prueba.txt`, verifique si el recurso existe en el disco, lo cree en caso contrario y muestre su nombre y su ruta en pantalla.

### Requerimiento
- Importar las clases necesarias para manejar archivos.
- Crear un objeto de tipo `File` con la ruta `datos/prueba.txt`.
- Usar `exists()` para comprobar si el recurso ya existe.
- Usar `createNewFile()` para crear el archivo si no existe.
- Controlar los errores de E/S con `try-catch` (`IOException`).
- Mostrar el nombre con `getName()`.
- Mostrar la ruta con `getPath()`.

### Clases y métodos utilizados
| Elemento | Función |
|---|---|
| `File` | Representa la ruta `datos/prueba.txt` dentro del programa |
| `exists()` | Devuelve `true` si el archivo existe en el disco |
| `createNewFile()` | Crea el archivo y devuelve `true` si lo creó o `false` si ya existía |
| `getName()` | Devuelve el último nombre de la ruta |
| `getPath()` | Devuelve la ruta con la que se construyó el objeto |
| `IOException` | Excepción que se captura si falla la creación |

### Captura de pantalla
<img width="1324" height="193" alt="{6F6D82B2-015A-47C7-898F-689D748A93C2}" src="https://github.com/user-attachments/assets/0355c01d-d7ee-4388-b050-98cd304056db" />


---

## Ejercicio 8: Escritura Estructurada por Líneas con BufferedWriter

### Planteamiento
Se requiere un programa en Java que cree un fichero de texto llamado `materias.txt`, escriba en él cinco asignaturas (una por línea) usando un `BufferedWriter` enlazado con un `FileWriter`, y libere los recursos correctamente controlando los errores de escritura.

### Requerimiento
- Importar las clases necesarias (`BufferedWriter`, `FileWriter` e `IOException`).
- Configurar un flujo de salida con `BufferedWriter` enlazado a un `FileWriter`.
- Escribir cinco asignaturas con `write()`.
- Usar `newLine()` para que cada asignatura quede en una línea independiente.
- Cerrar el flujo con `close()` en un bloque `finally`.
- Controlar los errores de escritura con `try-catch` (`IOException`).
- Verificar que el archivo se generó y que contiene una asignatura por línea.

### Clases y métodos utilizados
| Elemento | Función |
|---|---|
| `FileWriter` | Abre el archivo `materias.txt` para escribir caracteres en el disco |
| `BufferedWriter` | Almacena los datos en un búfer en memoria antes de enviarlos al archivo |
| `write()` | Escribe el texto de cada asignatura |
| `newLine()` | Inserta un salto de línea portable según el sistema operativo |
| `close()` | Vacía el búfer y libera el recurso |
| `IOException` | Excepción que se captura si falla la escritura o el cierre |

### Verificación
Salida en consola:

```
Archivo materias.txt generado correctamente.
```

Contenido de `materias.txt` (una asignatura por línea, 5 líneas en total):

```
Fundamentos de Programación
Lógica Matemática
Cálculo Diferencial
Álgebra Lineal
Física General
```

### Captura de pantalla
<img width="1465" height="249" alt="{B2C48483-DDE8-44C9-A16F-D33ABA638B25}" src="https://github.com/user-attachments/assets/cc7ae7ce-b731-4eef-9a45-d35881def9f2" />

## Ejercicio 9: Control del Modo de Apertura (Append vs Sobrescribir)

### Planteamiento
Se requiere un programa en Java que abra el archivo existente `materias.txt` en modo de adición (`append = true`) y agregue dos nuevas asignaturas al final, sin perder las cinco originales.

### Requerimiento
- Importar las clases necesarias (`BufferedWriter`, `FileWriter` e `IOException`).
- Abrir el archivo con `new FileWriter("materias.txt", true)` para activar el modo de adición.
- Escribir dos nuevas asignaturas con `write()`.
- Usar `newLine()` para mantener una asignatura por línea.
- Cerrar el flujo con `close()` en un bloque `finally`.
- Controlar los errores con `try-catch` (`IOException`).
- Verificar que el contenido previo se conserva y que las nuevas asignaturas quedan al final.

### Clases y métodos utilizados
| Elemento | Función |
|---|---|
| `FileWriter(nombre, true)` | Abre el archivo en modo de adición: escribe al final sin borrar lo existente |
| `FileWriter(nombre)` o `false` | Modo por defecto: sobrescribe y borra el contenido anterior |
| `BufferedWriter` | Almacena los datos en un búfer antes de enviarlos al archivo |
| `write()` | Escribe el texto de cada asignatura |
| `newLine()` | Inserta un salto de línea portable |
| `close()` | Vacía el búfer y libera el recurso |
| `IOException` | Excepción que se captura si falla la escritura o el cierre |

### Verificación
Antes de ejecutar (5 líneas):

```
Fundamentos de Programación
Lógica Matemática
Cálculo Diferencial
Álgebra Lineal
Física General
```

Después de ejecutar (7 líneas: las 5 originales conservadas y 2 nuevas al final):

```
Fundamentos de Programación
Lógica Matemática
Cálculo Diferencial
Álgebra Lineal
Física General
Química General
Comunicación Oral y Escrita
```

### Captura de pantalla
<img width="1474" height="370" alt="{C501D36C-65A5-4C7C-BE0F-2007C76583C1}" src="https://github.com/user-attachments/assets/ebc98802-5249-42d7-aa65-790ed5aafb91" />

---
## Ejercicio 10: Ciclo de Vida Completo y Borrado Seguro

### Planteamiento
Se requiere un programa en Java que recorra el ciclo de vida de un archivo: representar la ruta `datos/temporal.txt`, comprobar si existe, crearlo si no está disponible y eliminarlo únicamente si una variable de confirmación lo permite.

### Requerimiento
- Importar las clases necesarias (`File` e `IOException`).
- Crear un objeto de tipo `File` con la ruta `datos/temporal.txt`.
- Usar `exists()` para consultar el estado del archivo.
- Usar `createNewFile()` para crearlo si no existe, controlando `IOException` con `try-catch`.
- Declarar una variable de control `boolean confirmarBorrado = true;` que simule la confirmación del usuario.
- Usar `delete()` solo si `confirmarBorrado` es verdadera.
- Mostrar por consola el resultado booleano de `delete()`.

### Clases y métodos utilizados
| Elemento | Función |
|---|---|
| `File` | Representa la ruta `datos/temporal.txt` dentro del programa |
| `exists()` | Devuelve `true` si el archivo existe en el disco |
| `createNewFile()` | Crea el archivo y devuelve `true` si lo creó o `false` si ya existía |
| `confirmarBorrado` | Variable booleana que simula la confirmación antes de eliminar |
| `delete()` | Elimina el archivo y devuelve `true` si lo logró o `false` si falló |
| `IOException` | Excepción que se captura si falla la creación |

### Verificación
Salida en consola con `confirmarBorrado = true`:

```
El archivo no existe. Se intentara crearlo...
Archivo creado correctamente: datos/temporal.txt
Resultado de delete(): true
El archivo fue eliminado.
```

Al terminar, la carpeta `datos` queda vacía porque `temporal.txt` fue eliminado. Con `confirmarBorrado = false`, el programa muestra "Borrado cancelado" y el archivo se conserva.

### Captura de pantalla
<img width="1859" height="142" alt="{48343905-E260-4D5A-8061-E4AF63C0D95B}" src="https://github.com/user-attachments/assets/3600daf2-c1ef-45ee-a145-be7626ef568f" />
