package clase3;

import java.util.Scanner;

public class registroLibros {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // instanciamos la clase Libro pasandole sus atributos al constructor
        Libro libro_uno = new Libro("The Stack", "Benjamin Bratton", 2014);
        
        // mostramos el estado antes de cambiar
        libro_uno.mostrarInfo();
        
        // modificamos el año usando el setter
        libro_uno.setAnioPublicacion(-100);
        libro_uno.setAnioPublicacion(2016);
        
        // mostramos el estado final
        libro_uno.mostrarInfo();
        
    }
}