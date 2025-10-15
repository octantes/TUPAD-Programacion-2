package clase8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LecturaArchivo {
    
    public static void main(String[] args) {
        
        String nombreArchivo = "archivo.txt";
        BufferedReader reader = null;

        try {
            
            reader = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            System.out.println("contenido del archivo " + nombreArchivo + ":");
            while ((linea = reader.readLine()) != null) { System.out.println(linea); }
            
        } 
        
        catch (FileNotFoundException e) { System.err.println("error: el archivo " + nombreArchivo + " no se encontro"); }
        catch (IOException e) { System.err.println("error de entrada/salida al leer el archivo: " + e.getMessage()); }
        finally {
            
            try { if (reader != null) { reader.close(); } } 
            catch (IOException e) { System.err.println("error al cerrar el archivo: " + e.getMessage()); } 
            
        }
        
    }
    
}