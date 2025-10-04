package clase6;
import java.util.ArrayList;

public class ejercicio1 {

    public static void main(String[] args) {
        
        Inventario inventario = new Inventario();
        
        System.out.println("CONSIGNA UNO -----------------------------------");
        Producto p1 = new Producto("P01", "Chocolate", 1000.0, 200, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P02", "Celular", 200000.0, 40, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P03", "Pantalon", 25000.0, 20, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P04", "Cocina", 399999.9, 12, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P05", "Aceite", 5000.0, 100, CategoriaProducto.ALIMENTOS);
        Producto a1 = new Producto("A01", "Mayonesa", 2500.0);
        Producto a2 = new Producto("A02", "Arroz", 1500.0);
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5); 
        inventario.agregarProducto(a1);
        inventario.agregarProducto(a2);
        System.out.println();
        
        System.out.println("CONSIGNA DOS -----------------------------------");
        System.out.println("Listado de todos los productos en el inventario:");
        inventario.listarProductos();
        System.out.println();

        System.out.println("CONSIGNA TRES ----------------------------------");
        System.out.println("Buscar producto con ID P03 (Pantalon):");
        Producto buscado = inventario.buscarProductoPorId("P03");
        if (buscado != null) { System.out.println(buscado); }
        System.out.println();
        
        System.out.println("CONSIGNA CUATRO --------------------------------");
        System.out.println("Filtrar productos de categoría ALIMENTOS:");
        ArrayList<Producto> alimentos = inventario.filtrarProductos(CategoriaProducto.ALIMENTOS);
        for (Producto p : alimentos) { System.out.println(p); }
        System.out.println();

        System.out.println("CONSIGNA CINCO ---------------------------------");
        System.out.println("Eliminar producto P02:");
        inventario.eliminarProducto("P02");
        inventario.listarProductos();
        System.out.println();

        System.out.println("CONSIGNA SEIS ----------------------------------");
        System.out.println("Actualizar stock de P04 a 25:");
        inventario.actualizarStock("P04", 25);
        System.out.println(inventario.buscarProductoPorId("P04"));
        System.out.println();

        System.out.println("CONSIGNA SIETE ---------------------------------");
        System.out.println("Total de stock disponible: " + inventario.obtenerTotalStock());
        System.out.println();

        System.out.println("CONSIGNA OCHO ----------------------------------");
        System.out.println("Producto con mayor stock:");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) { System.out.println(mayorStock); }
        System.out.println();

        System.out.println("CONSIGNA NUEVE ---------------------------------");
        System.out.println("Productos con precio entre $1000 y $3000:");
        ArrayList<Producto> rangoPrecio = inventario.filtrarProductos(1000.0, 3000.0);
        for (Producto p : rangoPrecio) { System.out.println(p); }
        System.out.println();

        System.out.println("CONSIGNA DIEZ ----------------------------------");
        System.out.println("Categorías disponibles:");
        inventario.mostrarCategoriasDisponibles();
        System.out.println();
        
    }
    
}