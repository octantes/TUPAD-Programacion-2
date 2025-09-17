package clase5;

public class ejercicio13 {

    public static void main(String[] args) {
        
        Usuario3 u = new Usuario3("Ramiro Gimenez", "ramagim@gmail.com");
        GeneradorQR g = new GeneradorQR();

        g.generar("www.qr-generado.com", u);
        
    }
    
}