package clase8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaRecursos {
    
    public static void main(String[] args) {
        
        String nombreArchivo = "archivo.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            
            String linea;
            System.out.println("contenido del archivo:");
            while ((linea = reader.readLine()) != null) { System.out.println(linea); }
            
        } catch (IOException e) { System.err.println("error al leer el archivo: " + e.getMessage()); }
        
    }
    
}