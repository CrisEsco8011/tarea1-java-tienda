import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] productos = {"Tomate", "Lechuga", "Cebolla", "Naranja", "Chile"};
        double[] precios = {30.0, 20.0, 60.0, 40.0, 90.0};
        int[] carrito = new int[productos.length];

        Scanner tc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ DE TIENDA =====");
            System.out.println("1. Ver productos");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Ver total a pagar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = tc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Lista de Productos ---");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.println((i + 1) + ". " + productos[i] + " - Lps. " + precios[i]);
                    }
                    break;

                case 2:
                    System.out.println("\n¿Qué producto desea agregar? (Ingrese el número)");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.println((i + 1) + ". " + productos[i]);
                    }
                    System.out.print("Opción: ");
                    int seleccion = tc.nextInt();

                    if (seleccion >= 1 && seleccion <= productos.length) {
                        carrito[seleccion - 1]++;
                        System.out.println(productos[seleccion - 1] + " agregado al carrito.");
                    } else {
                        System.out.println("Selección inválida.");
                    }
                    break;

                case 3:
                    double total = 0;
                    System.out.println("\n--- Carrito de Compras ---");
                    for (int i = 0; i < carrito.length; i++) {
                        if (carrito[i] > 0) {
                            double subtotal = carrito[i] * precios[i];
                            System.out.println(productos[i] + " x" + carrito[i] + " = Lps." + subtotal);
                            total += subtotal;
                        }
                    }
                    System.out.println("Total a pagar: Lps." + total);
                    break;

                case 4:
                    System.out.println("Gracias por su visita. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        tc.close();
    }
}
