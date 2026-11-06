import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // los decimales se escriben con punto

        // El segundo parámetro (true) activa el modo append
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("productos.txt", true))) {
            String continuar;
            do {
                System.out.print("Nombre del producto: ");
                String nombre = sc.nextLine();

                System.out.print("Precio: ");
                double precio = sc.nextDouble();

                System.out.print("Cantidad disponible: ");
                int cantidad = sc.nextInt();
                sc.nextLine(); // limpiar el salto de línea pendiente

                double total = precio * cantidad;

                bw.write("Producto: " + nombre);
                bw.newLine();
                bw.write("Precio: " + precio);
                bw.newLine();
                bw.write("Cantidad: " + cantidad);
                bw.newLine();
                bw.write("Valor total: " + String.format(Locale.US, "%.2f", total));
                bw.newLine();
                bw.write("-------------------");
                bw.newLine();

                System.out.print("¿Registrar otro producto? (s/n): ");
                continuar = sc.nextLine();
            } while (continuar.equalsIgnoreCase("s"));

            System.out.println("Registros guardados en productos.txt");

        } catch (IOException e) {
            System.out.println("Error con el archivo: " + e.getMessage());
        }
        sc.close();
    }
}
