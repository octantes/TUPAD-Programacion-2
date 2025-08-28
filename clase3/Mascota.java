package clase3;

// creamos la clase Mascota
public class Mascota {
    
    // declaramos sus atributos
    String nombre;
    String especie;
    double edad;
    
    // definimos sus metodos
    public void mostrarInfo() {
        System.out.println(nombre + " es un " + especie + " y tiene "
                + edad + " años.");
    }
    
    public void cumplirAnios(double anios) {
        edad = edad + anios;
        System.out.println(nombre + " ahora tiene " + edad + " años.");
    }
    
}