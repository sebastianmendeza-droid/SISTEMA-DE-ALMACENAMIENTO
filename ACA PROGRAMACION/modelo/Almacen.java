package modelo;

import java.util.ArrayList; 

public class Almacen {

private ArrayList<Productos> productos = new ArrayList<>();
private String [] tiposDisponibles = {"Alimentos_nevera", "Alimentos_despensa", "Liquidos", "No_alimentos"};

public String[] getTiposDisponibles() {
    return tiposDisponibles;
}

public void mostrarTiposDisponibles() {
    System.out.println("Tipos de productos disponibles:");
    for (int i = 0; i < tiposDisponibles.length; i++) {
        System.out.println((i + 1)+ " " + tiposDisponibles [i]);
    }
}

public void agregarProducto(Productos producto) {
    productos.add(producto);
}

public void mostrarProductos() {
    if (productos.isEmpty()) {
        System.out.println("No hay productos en el almacén.");
        return;
    }

    System.out.println("Productos en el almacén:");
    for (Productos v : productos) {
        v.mostrarinformacion();
        System.out.println("--------------------");
    }
}

public Productos buscarProducto(String nombre) throws Exception {
    for (Productos v : productos) {
        if (v.getnombre().equalsIgnoreCase(nombre)) {
            return v;
        }
    }
    throw new Exception("Producto no encontrado: " + nombre);



}

}