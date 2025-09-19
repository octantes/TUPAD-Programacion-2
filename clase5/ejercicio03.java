package clase5;

public class ejercicio03 {

    public static void main(String[] args) {

        Autor a = new Autor("Benjamin Bratton", "Estadounidense");
        Editorial e = new Editorial("e-flux Journal", "Estados Unidos");
        Libro l = new Libro("The Black Stack", "ISBN12345", e);
        l.setAutor(a);

        System.out.println("Libro: " + l.getTitulo());
        System.out.println("Autor: " + l.getAutor().getNombre() + " - " + l.getAutor().getNacionalidad());
        System.out.println("Editorial: " + l.getEditorial().getNombre() + " - " + l.getEditorial().getDireccion());
        
    }
    
}