package clase3;

// creamos la clase Estudiante
public class Estudiante {
    
    // declaramos sus atributos
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    // definimos sus metodos
    
    public void mostrarInfo() {
        System.out.println("El estudiante " + nombre + " " + apellido
                + " cursa " + curso + " y su nota es: " + calificacion);
    }
    
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        if (calificacion > 10) {
            calificacion = 10;
        }
        
        System.out.println("La nota modificada es: " + calificacion);
    }
    
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) {
            calificacion = 0;
        }
        
        System.out.println("La nota modificada es: " + calificacion);
    }
}

