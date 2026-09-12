import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Almacen almacen = new Almacen();

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = mostrarMenu();
            switch (opcion) {
                case 1:
                    registrarProductos();
                    break;
                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    buscarProducto();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema... Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 4);
        
        scanner.close();
    }

    private static int mostrarMenu() {
        System.out.println("========================================================");
        System.out.println("Bienvenido al sistema de almacenamiento de productos");
        System.out.println("========================================================");
        System.out.println("-------- Menú --------");
        System.out.println("1. Agregar producto");
        System.out.println("2. Mostrar productos");
        System.out.println("3. Buscar producto");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }

    private static void registrarProductos() {
        try {
            System.out.println("Tipos de producto disponibles: alimento, bebida, limpieza");
            System.out.print("Ingrese el tipo de producto que desea registrar: ");
            String tipo = scanner.nextLine();
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la categoría del producto: ");
            String categoria = scanner.nextLine();
            System.out.print("Ingrese precio: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();

            Productos producto = new Productos(tipo, categoria, nombre, precio);
            almacen.agregarProducto(producto);
            System.out.println("Producto registrado exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al registrar el producto: " + e.getMessage());
        }
    }

    private static void mostrarProductos() {
        almacen.mostrarProductos();
    }

    private static void buscarProducto() {
        try {
            System.out.print("Ingrese el nombre del producto a buscar: ");
            String nombre = scanner.nextLine();
            Productos producto = almacen.buscarProducto(nombre);
            System.out.println("Producto encontrado: " + producto);
        } catch (ProductoNoEncontradoExcepcion e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static class Productos {
        private final String tipo;
        private final String categoria;
        private final String nombre;
        private final double precio;

        public Productos(String tipo, String categoria, String nombre, double precio) {
            this.tipo = tipo;
            this.categoria = categoria;
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        @Override
        public String toString() {
            return "Productos{" +
                    "tipo='" + tipo + '\'' +
                    ", categoria='" + categoria + '\'' +
                    ", nombre='" + nombre + '\'' +
                    ", precio=" + precio +
                    '}';
        }
    }

    static class Almacen {
        private final List<Productos> productos = new ArrayList<>();

        public void agregarProducto(Productos producto) {
            productos.add(producto);
        }

        public Productos buscarProducto(String nombre) throws ProductoNoEncontradoExcepcion {
            for (Productos producto : productos) {
                if (producto.getNombre().equalsIgnoreCase(nombre)) {
                    return producto;
                }
            }
            throw new ProductoNoEncontradoExcepcion("Producto no encontrado: " + nombre);
        }

        public void mostrarProductos() {
            if (productos.isEmpty()) {
                System.out.println("No hay productos registrados.");
                return;
            }

            for (Productos producto : productos) {
                System.out.println(producto);
            }
        }
    }

    static class ProductoNoEncontradoExcepcion extends Exception {
        public ProductoNoEncontradoExcepcion(String mensaje) {
            super(mensaje);
        }
    }
}
