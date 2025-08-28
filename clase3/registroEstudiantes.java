package clase3;

import java.util.Scanner;

public class registroEstudiantes {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // instanciamos la clase Estudiante
        Estudiante estudiante_uno = new Estudiante();
        
        // le proporcionamos valores a sus atributos
        estudiante_uno.nombre       =   "Matias";
        estudiante_uno.apellido     =   "Rodriguez";
        estudiante_uno.curso        =   "Programacion";
        estudiante_uno.calificacion =   7;
        
        // llamamos a los metodos desde un switch
        
        System.out.println("Desea subir o bajar la nota del estudiante? "
                + "(Subir/Bajar/Mostrar)");
        String modificar = input.nextLine().toUpperCase();
        
        switch (modificar) {
            case "SUBIR" -> {
                estudiante_uno.subirCalificacion(input.nextInt());
                input.nextLine();
            }
            case "BAJAR" -> {
                estudiante_uno.bajarCalificacion(input.nextInt());
                input.nextLine();
            }
            case "MOSTRAR" -> estudiante_uno.mostrarInfo();
            default -> {
                System.out.println("La nota no fue modificada");
                estudiante_uno.mostrarInfo();
                return;
            }
        }
        
    }
}