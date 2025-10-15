package clase8;

public class ValidarEdad {

    public static void verificarEdad(int edad) throws EdadInvalidaException {
        
        if (edad < 0 || edad > 120) { throw new EdadInvalidaException("la edad " + edad + " debe ser un numero entre 0 y 120"); }
        System.out.println("la edad " + edad + " es valida");
        
    }

    public static void main(String[] args) {
        
        try {
            
            verificarEdad(25);
            verificarEdad(-5);
            verificarEdad(150);
            
        } catch (EdadInvalidaException e) {
            
            System.err.println("error de validacion: " + e.getMessage());
            
        }
        
    }
    
}