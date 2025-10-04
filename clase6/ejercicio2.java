package clase6;
import java.util.ArrayList;

public class ejercicio2 {

    public static void main(String[] args) {
        
        System.out.println("CONSIGNA UNO -----------------------------------");
        Biblioteca biblioteca = new Biblioteca("Biblioteca La Plata");
        System.out.println();

        System.out.println("CONSIGNA DOS -----------------------------------");
        Autor autor1 = new Autor("A01", "Jorge Luis Borges", "Argentino");
        Autor autor2 = new Autor("A02", "Edgar Allan Poe", "Estadounidense");
        Autor autor3 = new Autor("A03", "J.K. Rowling", "Britanica");
        System.out.println();

        System.out.println("CONSIGNA TRES ----------------------------------");
        biblioteca.agregarLibro("ISBN01", "Ficciones", 1941, autor1);
        biblioteca.agregarLibro("ISBN02", "El cuervo y otros poemas", 1845, autor2);
        biblioteca.agregarLibro("ISBN03", "El gato negro y otros cuentos", 1843, autor2);
        biblioteca.agregarLibro("ISBN04", "Harry Potter y la piedra filosofal", 1997, autor3);
        biblioteca.agregarLibro("ISBN05", "Harry Potter y la cámara secreta", 1998, autor3);
        System.out.println();

        System.out.println("CONSIGNA CUATRO --------------------------------");
        System.out.println("Listado de libros:");
        biblioteca.listarLibros();
        System.out.println();

        System.out.println("CONSIGNA CINCO ---------------------------------");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("ISBN03");
        if (encontrado != null) { encontrado.mostrarInfo(); }
        System.out.println();

        System.out.println("CONSIGNA SEIS ----------------------------------");
        biblioteca.filtrarLibrosPorAnio(1997);
        System.out.println();

        System.out.println("CONSIGNA SIETE ---------------------------------");
        boolean eliminado = biblioteca.eliminarLibro("ISBN02");
        if (eliminado) { System.out.println("Libro eliminado correctamente."); }
        System.out.println("Libros restantes:");
        biblioteca.listarLibros();
        System.out.println();

        System.out.println("CONSIGNA OCHO ----------------------------------");
        System.out.println("Cantidad total de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());
        System.out.println();

        System.out.println("CONSIGNA NUEVE ---------------------------------");
        System.out.println("Autores disponibles en la biblioteca:");
        biblioteca.mostrarAutoresDisponibles();
        System.out.println();
        
    }
    
}