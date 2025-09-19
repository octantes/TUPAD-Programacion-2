package clase5;

public class ejercicio01 {

    public static void main(String[] args) {

        Titular t = new Titular("Rodrigo Bueno", "23165136");
        Pasaporte p = new Pasaporte("A12345", "1990-09-17", "foto1", ".png", t);

        System.out.println("Titular: " + p.getTitular().getNombre());
        System.out.println("Pasaporte del titular: " + t.getPasaporte().getNumero());
        System.out.println("Foto del pasaporte: " + t.getPasaporte().getFoto().getImagen()
                                + t.getPasaporte().getFoto().getFormato());
        
    }
    
}