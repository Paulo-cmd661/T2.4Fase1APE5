import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double totalAcumulado = 0;

        // Modo append: no se eliminan las ventas anteriores
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ventas.txt", true))) {
            while (true) {
                System.out.print("Nombre del producto (o 'fin' para terminar): ");
                String nombre = sc.nextLine();
                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }

                System.out.print("Precio: ");
                double precio = sc.nextDouble();
                System.out.print("Cantidad vendida: ");
                int cantidad = sc.nextInt();
                sc.nextLine(); // limpiar el salto de línea pendiente

                double subtotal = precio * cantidad;
                double descuento = 0;
                if (subtotal >= 100) {
                    descuento = subtotal * 0.10;
                }
                double totalPagar = subtotal - descuento;
                totalAcumulado += totalPagar;

                System.out.printf(Locale.US, "Total a pagar: $%.2f%n", totalPagar);

                bw.write("Producto: " + nombre);
                bw.newLine();
                bw.write(String.format(Locale.US, "Precio: %.2f | Cantidad: %d", precio, cantidad));
                bw.newLine();
                bw.write(String.format(Locale.US, "Subtotal: %.2f | Descuento: %.2f | Total: %.2f",
                        subtotal, descuento, totalPagar));
                bw.newLine();
                bw.write("-------------------");
                bw.newLine();
            }

            bw.write(String.format(Locale.US, "TOTAL ACUMULADO DE VENTAS: %.2f", totalAcumulado));
            bw.newLine();
            bw.newLine();

            System.out.printf(Locale.US, "Total acumulado: $%.2f%n", totalAcumulado);

        } catch (IOException e) {
            System.out.println("Error con el archivo: " + e.getMessage());
        }
        sc.close();
    }
}
